package exercicio1;

import java.util.ArrayList;

class Publicacao {
    private String dataPublicacao;
    private String textoPublicacao;
    private String linkMidia;
    public static double contadorPublicacao;

    public Publicacao(String dataPublicacao, String textoPublicacao, String linkMidia) {
        this.dataPublicacao = dataPublicacao;
        this.textoPublicacao = textoPublicacao;
        this.linkMidia = linkMidia;
        contadorPublicacao++;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }
}

class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;
    private ArrayList<Publicacao> publicacoes;

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.publicacoes = new ArrayList<>();
    }

    public void inserePublicacao(Publicacao publi) {
        publicacoes.add(publi);
    }

    public void imprimePublicacoes() {
        System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());

        for (Publicacao publi : publicacoes) {
            System.out.println("Data da Publicação: " + publi.getDataPublicacao());
            System.out.println("Texto da Publicação: " + publi.getTextoPublicacao());
            System.out.println("------------------------");
        }
    }
}

public class Principal {
    public static void main(String[] args) {
        // Solicitar dados da Rede Social
        String dataCriacao = "2023-10-27";
        String nomeUsuario = "exemplo";
        String dataNascimento = "2000-01-01";
        String senha = "senha123";

        // Criar objeto RedeSocial
        RedeSocial redeSocial = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);

        // Solicitar dados das publicações
        String dataPub1 = "2023-10-27";
        String textoPub1 = "Primeira publicação";
        String linkMidia1 = "https://exemplo.com/midia1";

        String dataPub2 = "2023-10-28";
        String textoPub2 = "Segunda publicação";
        String linkMidia2 = "https://exemplo.com/midia2";

        // Criar objetos Publicacao
        Publicacao pub1 = new Publicacao(dataPub1, textoPub1, linkMidia1);
        Publicacao pub2 = new Publicacao(dataPub2, textoPub2, linkMidia2);

        // Inserir publicações na Rede Social
        redeSocial.inserePublicacao(pub1);
        redeSocial.inserePublicacao(pub2);

        // Imprimir as publicações
        redeSocial.imprimePublicacoes();
    }
}
