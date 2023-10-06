package questao2;

// Classe filha do Projeto
class DistribuicaoAlimento extends Projeto {
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }


    public boolean validaProjeto(String nomeProjeto) {
        return getDataFim().isEmpty();
    }


    public String imprimeProjeto() {
        return "Nome do Projeto: " + getNomeProjeto() +
                "\nDescrição: " + getDescricao() +
                "\nData de Início: " + getDataInicio() +
                "\nData de Fim: " + getDataFim() +
                "\nDescrição do Alimento: " + descAlimento +
                "\nQuantidade: " + qtde;
    }
}
