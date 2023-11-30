package questao1e2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private List<PedidoItem> itensPedido;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = new Date();
        this.precoTotal = 0.0;
        this.statusPedido = 1; // Status inicial é 1
        this.itensPedido = new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public List<PedidoItem> getItensPedido() {
        return itensPedido;
    }

    public void adicionarItem(PedidoItem item) {
        itensPedido.add(item);
        calcularTotalPagar();
    }

    public void calcularTotalPagar() {
        precoTotal = itensPedido.stream().mapToDouble(i -> i.getPrecoItem() * i.getQtdeItem()).sum();
    }
}