package questao1e2;

class PedidoItem {
    private String nomeItem;
    private int qtdeItem;
    private double precoItem;

    public PedidoItem(String nomeItem, int qtdeItem, double precoItem) {
        this.nomeItem = nomeItem;
        this.qtdeItem = qtdeItem;
        this.precoItem = precoItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public int getQtdeItem() {
        return qtdeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }
}