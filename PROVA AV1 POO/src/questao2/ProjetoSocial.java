package questao2;
import javax.swing.JOptionPane;

// Classe ProjetoSocial com o método main
public class ProjetoSocial {
    public static void main(String[] args) {
        int escolha;
        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n1- Distribuição de Alimentos\n2- Trabalho Voluntário\n3- Sair"));
            Projeto projeto;
            switch (escolha) {
                case 1:
                    String nomeAlimento = JOptionPane.showInputDialog("Digite o nome do alimento:");
                    float quantidade = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade do alimento:"));
                    projeto = new DistribuicaoAlimento("Projeto Alimentos", "Distribuição de alimentos para pessoas carentes", "Rua Principal, 123", "01/01/2023", "", nomeAlimento, quantidade);
                    break;
                case 2:
                    String tipoTrabalho = JOptionPane.showInputDialog("Digite o tipo de trabalho voluntário:");
                    int duracao = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração do trabalho voluntário em horas:"));
                    projeto = new TrabalhoVoluntario("Projeto Voluntariado", "Trabalho voluntário para melhorar a comunidade", "Rua Secundária, 456", "01/01/2023", "", tipoTrabalho, duracao);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    continue;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    continue;
            }

            if (projeto != null && projeto.validaProjeto(projeto.getNomeProjeto())) {
                JOptionPane.showMessageDialog(null, projeto.imprimeProjeto());
            } else {
                JOptionPane.showMessageDialog(null, "Projeto inválido.");
            }
        } while (escolha != 3);
    }
}