public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(); //cria um objeto c1, do tipo ContaCorrente
        c1.cadastrar(123,"Ana",789);
        c1.depositar(1000);
        System.out.println("Saldo:" + c1.ConsultarSaldo() );
        c1.sacar(200);
        System.out.println("Saldo:" + c1.ConsultarSaldo() );

    }
}