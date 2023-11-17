package Pratica7;

import Pratica7.Consulta;
import Pratica7.Excluir;
import Pratica7.Inserir;

import javax.swing.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Pratica7.Inserir dados
        String id_isbn, nm_titulo, cod_excluir, buscaTitulo;
        int id_categoria, id_editora;
        double vl_preco;

        id_isbn = JOptionPane.showInputDialog("Digite ISBN");
        nm_titulo = JOptionPane.showInputDialog("Digite titulo");
        id_categoria = Integer.parseInt(JOptionPane.showInputDialog("Digite codigo da categoria"));
        id_editora = Integer.parseInt(JOptionPane.showInputDialog("Digite codigo da editora"));
        vl_preco = Double.parseDouble(JOptionPane.showInputDialog("Digite preco do livro"));
        Inserir inserir = new Inserir(id_isbn, id_categoria, id_editora, nm_titulo, vl_preco);

        // Pratica7.Excluir
        cod_excluir = JOptionPane.showInputDialog("Digite ISBN para Pratica7.Excluir");
        Excluir excluir = new Excluir(cod_excluir);

        // Pratica7.Consulta titulo
        Consulta busca = new Consulta();
        buscaTitulo = JOptionPane.showInputDialog("Digite Titulo para buscar");
        busca.BuscaTitulo(buscaTitulo);

        // Pratica7.Consulta por valor
        double buscaValor = Double.parseDouble(JOptionPane.showInputDialog("Digite Valor para buscar"));
        busca.BuscaValor(buscaValor);
    }
}