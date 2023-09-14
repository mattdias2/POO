import java.util.Scanner;

public class Pratica2Q2 {
    private double investimentoInicial;
    private double taxaMensal;
    private int numeroMeses;

    public Pratica2Q2(double investimentoInicial, double taxaMensal, int numeroMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaMensal = taxaMensal / 100.0; // Converte a taxa para decimal (ex: 2% -> 0.02)
        this.numeroMeses = numeroMeses;
    }

    public void Pratica2Q2() {
        double valorFinal = investimentoInicial * Math.pow(1 + taxaMensal, numeroMeses);
        double rendimento = valorFinal - investimentoInicial;

        System.out.println("Investimento: R$" + investimentoInicial);
        System.out.println("Taxa do Rendimento: " + (taxaMensal * 100) + "% a/m");
        System.out.println("Número de meses: " + numeroMeses);
        System.out.println("Rendimento: R$" + rendimento);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do investimento inicial: R$");
        double investimentoInicial = scanner.nextDouble();

        System.out.print("Informe a taxa de rendimento mensal (em %): ");
        double taxaMensal = scanner.nextDouble();

        System.out.print("Informe o número de meses: ");
        int numeroMeses = scanner.nextInt();

        Pratica2Q2 calculadora = new Pratica2Q2(investimentoInicial, taxaMensal, numeroMeses);
        calculadora.Pratica2Q2();

        scanner.close();
    }
}
