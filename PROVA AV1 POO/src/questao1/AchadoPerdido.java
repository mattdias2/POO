package questao1;
import javax.swing.JOptionPane;

class AchadoPerdido implements Publicacao {
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String localAchado;
    private String dataHora;
    private String status;

    public AchadoPerdido(String titulo, String descricao, String foto, String tipo, String localAchado, String dataHora, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.foto = foto;
        this.tipo = tipo;
        this.localAchado = localAchado;
        this.dataHora = dataHora;
        this.status = status;
    }

    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public void completaDados(String foto, String localAchado, String dataHora) {
        this.foto = foto;
        this.localAchado = localAchado;
        this.dataHora = dataHora;
    }

    public String buscarTitulo(String titulo) {
        if (this.titulo.equals(titulo)) {
            return "Título: " + this.titulo + "\nDescrição: " + this.descricao + "\nLocal Achado: " + this.localAchado;
        } else {
            return "Achado não encontrado.";
        }
    }

    public void visualizarDetalhes() {
        String mensagem = "Título: " + titulo + "\nFoto: " + foto + "\nLocal Achado: " + localAchado +
                "\nTipo: " + tipo + "\nStatus: " + status;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
