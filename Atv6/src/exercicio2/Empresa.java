package exercicio2;

public class Empresa {
    private String nome;
    private String cnpj;
    private int qtdeDeFuncionario;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeDeFuncionario = 0;
        this.funcionarios = new Funcionario[100];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}
