// Interface Celular
interface Celular {
    boolean ligar();
    boolean desligar();
    boolean camera();
    boolean foneDeOuvido();
    boolean controleDeVolume();
}

// Classe abstrata CelularComum que implementa a interface Celular e contém os atributos comuns
abstract class CelularComum implements Celular {
    boolean enviarMensagem;
    boolean acessarInternet;
    boolean emails;
    boolean verificarSistemaDeArquivos;
    double preco;

    CelularComum(boolean enviarMensagem, boolean acessarInternet, boolean emails, boolean verificarSistemaDeArquivos, double preco) {
        this.enviarMensagem = enviarMensagem;
        this.acessarInternet = acessarInternet;
        this.emails = emails;
        this.verificarSistemaDeArquivos = verificarSistemaDeArquivos;
        this.preco = preco;
    }
}

// Classe CelularFabricanteA que estende a classe abstrata CelularComum
class CelularFabricanteA extends CelularComum {
    boolean tv;

    CelularFabricanteA(boolean tv, double preco) {
        super(true, true, true, true, preco);
        this.tv = tv;
    }

    @Override
    public boolean ligar() {
        return true;
    }

    @Override
    public boolean desligar() {
        return true;
    }

    @Override
    public boolean camera() {
        return true;
    }

    @Override
    public boolean foneDeOuvido() {
        return true;
    }

    @Override
    public boolean controleDeVolume() {
        return true;
    }
}

// Classe CelularFabricanteB que estende a classe abstrata CelularComum
class CelularFabricanteB extends CelularComum {
    boolean radio;

    CelularFabricanteB(boolean radio, double preco) {
        super(true, true, true, true, preco);
        this.radio = radio;
    }

    @Override
    public boolean ligar() {
        return true;
    }

    @Override
    public boolean desligar() {
        return true;
    }

    @Override
    public boolean camera() {
        return true;
    }

    @Override
    public boolean foneDeOuvido() {
        return true;
    }

    @Override
    public boolean controleDeVolume() {
        return true;
    }
}

// Classe Main para testar os objetos das classes
public class Main {
    public static void main(String[] args) {
        CelularFabricanteA celularA = new CelularFabricanteA(false, 6800.00);
        CelularFabricanteB celularB = new CelularFabricanteB(false, 5200.00);

        System.out.println("Celular Fabricante A:");
        System.out.println("TV: " + celularA.tv);
        System.out.println("Preço: R$ " + celularA.preco);

        System.out.println("\nCelular Fabricante B:");
        System.out.println("Rádio: " + celularB.radio);
        System.out.println("Preço: R$ " + celularB.preco);
    }
}
