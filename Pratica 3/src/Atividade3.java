import java.util.Scanner;

// Classe Funcionario
class Funcionario {
    private String nome;
    private double salarioFixo;

    public Funcionario(String nome, double salarioFixo) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularProventos() {
        return salarioFixo;
    }
}

// Classe FuncionarioProdutividade
class FuncionarioProdutividade extends Funcionario {
    private double valorPorUnidade;
    private int unidadesProduzidas;

    public FuncionarioProdutividade(String nome, double salarioFixo, double valorPorUnidade, int unidadesProduzidas) {
        super(nome, salarioFixo);
        this.valorPorUnidade = valorPorUnidade;
        this.unidadesProduzidas = unidadesProduzidas;
    }

    public double getValorPorUnidade() {
        return valorPorUnidade;
    }

    public int getUnidadesProduzidas() {
        return unidadesProduzidas;
    }

    @Override
    public double calcularProventos() {
        return getSalarioFixo() + (valorPorUnidade * unidadesProduzidas);
    }
}

// Classe FuncionarioComissionado
class FuncionarioComissionado extends Funcionario {
    private double comissao;

    public FuncionarioComissionado(String nome, double salarioFixo, double comissao) {
        super(nome, salarioFixo);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public double calcularProventos() {
        return getSalarioFixo() + comissao;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Escolha o tipo de funcionário:");
        System.out.println("1 - Padrão");
        System.out.println("2 - Produtividade");
        System.out.println("3 - Comissionado");
        int tipo = scanner.nextInt();

        Funcionario funcionario;

        switch (tipo) {
            case 1:
                funcionario = new Funcionario(nome, salarioFixo);
                break;
            case 2:
                System.out.print("Digite o valor por unidade produzida: ");
                double valorPorUnidade = scanner.nextDouble();
                System.out.print("Digite a quantidade de unidades produzidas: ");
                int unidadesProduzidas = scanner.nextInt();
                funcionario = new FuncionarioProdutividade(nome, salarioFixo, valorPorUnidade, unidadesProduzidas);
                break;
            case 3:
                System.out.print("Digite o valor da comissão: ");
                double comissao = scanner.nextDouble();
                funcionario = new FuncionarioComissionado(nome, salarioFixo, comissao);
                break;
            default:
                System.out.println("Tipo de funcionário inválido.");
                scanner.close();
                return;
        }

        double proventos = funcionario.calcularProventos();
        System.out.println("Proventos do funcionário " + funcionario.getNome() + ": R$" + proventos);

        scanner.close();
    }
}
