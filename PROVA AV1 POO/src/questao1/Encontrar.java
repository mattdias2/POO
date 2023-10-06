package questao1;

public class Encontrar {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Matheus", "mattdias2@gmail.com", "123456666");
        AchadoPerdido achado = new AchadoPerdido("Blusa perdida", "Blusa de Matheus perdida", "Objeto", "Em andamento");
        achado.completaDados("12116183 /C: Downloads/Foto-blusa.png", "Rua Deputado Anuar Menhem, 1212", "05/8/2023 15:00");


        String resultadoBusca = achado.buscarTitulo("Chave perdida");
        System.out.println(resultadoBusca);

        achado.visualizarDetalhes();
    }
}
