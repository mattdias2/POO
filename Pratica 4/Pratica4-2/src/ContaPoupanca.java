// Classe ContaPoupanca que implementa Conta
public class ContaPoupanca implements ContaInterface {
    private double saldo;

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }
}
