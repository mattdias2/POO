package questao1e2;

class Produto {
    private String nomeProduto;
    private double precoProduto;
    private String descProduto;
    private int estoqueAtual;
    private Categoria categoria;

    public Produto(String nomeProduto, double precoProduto, String descProduto, int estoqueAtual, Categoria categoria) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.descProduto = descProduto;
        this.estoqueAtual = estoqueAtual;
        this.categoria = categoria;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean buscarProduto(String nome) {
        return this.nomeProduto.equalsIgnoreCase(nome);
    }

    public void atualizarEstoque(int quantidade) {
        this.estoqueAtual -= quantidade;
    }
}