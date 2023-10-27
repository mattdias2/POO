package exercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando 10 objetos da classe Artigo
        ArrayList<Artigo> artigos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Artigo artigo = new Artigo("Título do Artigo " + i, "Resumo do Artigo " + i, "Autores do Artigo " + i);
            artigos.add(artigo);
        }

        // Criando um objeto da classe Edicao e adicionando todos os artigos
        Edicao edicao = new Edicao(1, 1, "01/01/2023", 1000);
        for (Artigo artigo : artigos) {
            edicao.adicionaArtigo(artigo);
        }

        // Criando um objeto da classe RevistaCientifica e adicionando a Edição
        RevistaCientifica revistaCientifica = new RevistaCientifica("Revista Científica", 1234567890L, "Mensal");
        revistaCientifica.adicionaEdicao(edicao);
    }
}
