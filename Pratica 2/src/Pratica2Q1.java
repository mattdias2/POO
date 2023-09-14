public class Pratica2Q1 {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    // Construtor sem parâmetros
    public Pratica2Q1() {
    }

    // Construtor com parâmetros
    public Pratica2Q1(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    // Método para dar baixa no estoque
    public void darBaixa(int qtde) {
        if (qtdAtual - qtde >= 0) {
            qtdAtual -= qtde;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    // Método para mostrar os dados do estoque
    public String mostra() {
        return "Produto: " + nome + ", Quantidade Mínima: " + qtdMinima + ", Quantidade Atual: " + qtdAtual;
    }

    // Método para verificar se precisa repor o estoque
    public boolean precisaRepor() {
        return qtdAtual <= qtdMinima;
    }

    public static void main(String[] args) {
        // Criando um objeto Estoque e inicializando com valores
        Pratica2Q1 produto = new Pratica2Q1("Produto A", 50, 10);

        // Exibindo os dados iniciais
        System.out.println("Dados iniciais do estoque:");
        System.out.println(produto.mostra());

        // Realizando algumas operações no estoque
        produto.darBaixa(20); // Baixa de 20 unidades
        System.out.println("\nApós dar baixa de 20 unidades:");
        System.out.println(produto.mostra());

        // Verificando se precisa repor o estoque
        if (produto.precisaRepor()) {
            System.out.println("\nO estoque precisa ser reposto.");
        } else {
            System.out.println("\nO estoque está adequado.");
        }
    }
}
