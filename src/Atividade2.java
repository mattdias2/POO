import java.util.Scanner;

// Classe Ingresso
class Atividade2 {
    private double valor;

    public Atividade2 (double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

// Classe Normal
class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }

    public void imprimeValor() {
        System.out.println("Ingresso Normal - Valor: R$" + getValor());
    }
}

// Classe VIP
class VIP extends Ingresso {
    private double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public void imprimeValor() {
        System.out.println("Ingresso VIP - Valor Total: R$" + (getValor() + valorAdicional));
    }
}

// Classe Camarote
class Camarote extends Ingresso {
    private double valorAdicional;
    private String localizacao;

    public Camarote(double valor, double valorAdicional, String localizacao) {
        super(valor);
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }

    public void imprimeValor() {
        System.out.println("Ingresso Camarote - Localização: " + localizacao + " - Valor Total: R$" + (getValor() + valorAdicional));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Ingresso Normal");
        System.out.println("2 - Ingresso VIP");
        System.out.println("3 - Ingresso Camarote");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Informe o valor do ingresso normal: ");
                double valorNormal = scanner.nextDouble();
                Normal ingressoNormal = new Normal(valorNormal);
                ingressoNormal.imprimeValor();
                break;
            case 2:
                System.out.print("Informe o valor do ingresso VIP: ");
                double valorVIP = scanner.nextDouble();
                System.out.print("Informe o valor adicional do ingresso VIP: ");
                double valorAdicionalVIP = scanner.nextDouble();
                VIP ingressoVIP = new VIP(valorVIP, valorAdicionalVIP);
                ingressoVIP.imprimeValor();
                break;
            case 3:
                System.out.print("Informe o valor do ingresso camarote: ");
                double valorCamarote = scanner.nextDouble();
                System.out.print("Informe o valor adicional do ingresso camarote: ");
                double valorAdicionalCamarote = scanner.nextDouble();
                System.out.print("Informe a localização do camarote: ");
                String localizacaoCamarote = scanner.next();
                Camarote ingressoCamarote = new Camarote(valorCamarote, valorAdicionalCamarote, localizacaoCamarote);
                ingressoCamarote.imprimeValor();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
