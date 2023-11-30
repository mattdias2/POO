package questao1e2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// ... (Implementação das classes Categoria, Produto, PedidoItem e Pedido)

public class Main {

    public static void main(String[] args) {
        // Criação da lista de produtos
        ArrayList<Produto> produtos = new ArrayList<>();
        Categoria categoriaAlimentos = new Categoria("Alimentos");
        Categoria categoriaBebidas = new Categoria("Bebidas");
        Categoria categoriaLimpeza = new Categoria("Limpeza");

        produtos.add(new Produto("Arroz", 10.99, "Arroz Branco 1kg", 100, categoriaAlimentos));
        produtos.add(new Produto("Feijão", 6.49, "Feijão Carioca 1kg", 100, categoriaAlimentos));
        produtos.add(new Produto("Macarrão", 4.89, "Macarrão Espaguete 500g", 100, categoriaAlimentos));
        produtos.add(new Produto("Refrigerante", 6.99, "Refrigerante Lata 350ml", 100, categoriaBebidas));
        produtos.add(new Produto("Detergente", 1.79, "Detergente Líquido 500ml", 100, categoriaLimpeza));

        // Criação da lista de pedidos
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Pedido pedido1 = new Pedido(1);
        Pedido pedido2 = new Pedido(2);

        // Adicionando itens ao pedido1
        for (Produto produto : produtos) {
            if (produto.buscarProduto("Arroz")) {
                PedidoItem item = new PedidoItem(produto.getNomeProduto(), 2, produto.getPrecoProduto());
                pedido1.adicionarItem(item);
                produto.atualizarEstoque(item.getQtdeItem());
            }
            if (produto.buscarProduto("Feijão")) {
                PedidoItem item = new PedidoItem(produto.getNomeProduto(), 1, produto.getPrecoProduto());
                pedido1.adicionarItem(item);
                produto.atualizarEstoque(item.getQtdeItem());
            }
            if (produto.buscarProduto("Refrigerante")) {
                PedidoItem item = new PedidoItem(produto.getNomeProduto(), 3, produto.getPrecoProduto());
                pedido1.adicionarItem(item);
                produto.atualizarEstoque(item.getQtdeItem());
            }
        }

        // Atualizando o status do pedido1 após adicionar os itens
        pedido1.setStatusPedido(2);

        // Adicionando itens ao pedido2
        for (Produto produto : produtos) {
            if (produto.buscarProduto("Macarrão")) {
                PedidoItem item = new PedidoItem(produto.getNomeProduto(), 2, produto.getPrecoProduto());
                pedido2.adicionarItem(item);
                produto.atualizarEstoque(item.getQtdeItem());
            }
            if (produto.buscarProduto("Detergente")) {
                PedidoItem item = new PedidoItem(produto.getNomeProduto(), 4, produto.getPrecoProduto());
                pedido2.adicionarItem(item);
                produto.atualizarEstoque(item.getQtdeItem());
            }
            if (produto.buscarProduto("Arroz")) {
                PedidoItem item = new PedidoItem(produto.getNomeProduto(), 1, produto.getPrecoProduto());
                pedido2.adicionarItem(item);
                produto.atualizarEstoque(item.getQtdeItem());
            }
        }

        // Atualizando o status do pedido2 após adicionar os itens
        pedido2.setStatusPedido(2);

        // Calculando o total a pagar para cada pedido
        pedido1.calcularTotalPagar();
        pedido2.calcularTotalPagar();

        // Adicione os pedidos à lista de pedidos
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        // Imprimindo informações dos pedidos para verificação
        for (Pedido p : pedidos) {
            System.out.println("Pedido Número: " + p.getNumeroPedido());
            System.out.println("Data/Hora: " + p.getDataHoraPedido());
            System.out.println("Status do Pedido: " + p.getStatusPedido());
            System.out.println("Total a Pagar: " + p.getPrecoTotal());
            System.out.println("Itens do Pedido:");
            for (PedidoItem item : p.getItensPedido()) {
                System.out.println(" - " + item.getNomeItem() + ": " + item.getQtdeItem() + " x " + item.getPrecoItem());
            }
            System.out.println("-----------------------------------");
        }
    }
}
