package exercicio3;

import java.util.ArrayList;

public class RevistaCientifica {
    private String titulo;
    private long issn;
    private String peridiocidade;
    private ArrayList<Edicao> edicoes;

    public RevistaCientifica(String titulo, long issn, String peridiocidade) {
        this.titulo = titulo;
        this.issn = issn;
        this.peridiocidade = peridiocidade;
        this.edicoes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public String getPeridiocidade() {
        return peridiocidade;
    }

    public void setPeridiocidade(String peridiocidade) {
        this.peridiocidade = peridiocidade;
    }

    public void adicionaEdicao(Edicao edicao) {
        edicoes.add(edicao);
    }
}
