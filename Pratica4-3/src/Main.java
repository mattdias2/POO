import java.util.Scanner;

abstract class Projeto {
    private String nomeProjeto;
    private String descricao;
    private String endereco;
    private String datainicio;
    private String datafim;

    public Projeto(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.endereco = endereco;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDatafim() {
        return datafim;
    }

    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }

    public abstract boolean validaProjeto();

    public abstract String imprimeProjeto();
}

class DistribuicaoAlimento extends Projeto {
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean validaProjeto() {
        return getDatafim().isEmpty();
    }

    @Override
    public String imprimeProjeto() {
        return "Nome do Projeto: " + getNomeProjeto() + "\nDescrição: " + getDescricao() + "\nData de Início: " + getDatainicio()
                + "\nData de Fim: " + getDatafim() + "\nDescrição do Alimento: " + getDescAlimento() + "\nQuantidade: " + getQtde();
    }
}

class TrabalhoVoluntario extends Projeto {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    @Override
    public boolean validaProjeto() {
        return duracaoTrabalho > 2;
    }

    @Override
    public String imprimeProjeto() {
        return "Nome do Projeto: " + getNomeProjeto() + "\nDescrição: " + getDescricao() + "\nData de Início: " + getDatainicio()
                + "\nData de Fim: " + getDatafim() + "\nTipo de Trabalho: " + getTipoTrabalho() + "\nDuração do Trabalho (horas): " + getDuracaoTrabalho();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Projeto Distribuir Alimentos");
            System.out.println("2. Cadastrar Projeto Trabalho Voluntário");
            System.out.println("3. Sair");

            choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (choice) {
                case 1:
                    System.out.println("Digite o nome do projeto:");
                    String nomeAlimento = scanner.nextLine();
                    System.out.println("Digite a descrição do projeto:");
                    String descricaoAlimento = scanner.nextLine();
                    System.out.println("Digite o endereço:");
                    String enderecoAlimento = scanner.nextLine();
                    System.out.println("Digite a data de início:");
                    String dataInicioAlimento = scanner.nextLine();
                    System.out.println("Digite a data de fim (deixe em branco se não aplicável):");
                    String dataFimAlimento = scanner.nextLine();
                    System.out.println("Digite a descrição do alimento:");
                    String descAlimento = scanner.nextLine();
                    System.out.println("Digite a quantidade:");
                    float qtdeAlimento = scanner.nextFloat();

                    DistribuicaoAlimento projetoAlimento = new DistribuicaoAlimento(nomeAlimento, descricaoAlimento, enderecoAlimento,
                            dataInicioAlimento, dataFimAlimento, descAlimento, qtdeAlimento);

                    if (projetoAlimento.validaProjeto()) {
                        System.out.println("Projeto válido:");
                        System.out.println(projetoAlimento.imprimeProjeto());
                    } else {
                        System.out.println("Projeto inválido. Data de Fim não está vazia.");
                    }
                    break;

                case 2:
                    System.out.println("Digite o nome do projeto:");
                    String nomeTrabalho = scanner.nextLine();
                    System.out.println("Digite a descrição do projeto:");
                    String descricaoTrabalho = scanner.nextLine();
                    System.out.println("Digite o endereço:");
                    String enderecoTrabalho = scanner.nextLine();
                    System.out.println("Digite a data de início:");
                    String dataInicioTrabalho = scanner.nextLine();
                    System.out.println("Digite a data de fim (deixe em branco se não aplicável):");
                    String dataFimTrabalho = scanner.nextLine();
                    System.out.println("Digite o tipo de trabalho:");
                    String tipoTrabalho = scanner.nextLine();
                    System.out.println("Digite a duração do trabalho (horas):");
                    int duracaoTrabalho = scanner.nextInt();

                    TrabalhoVoluntario projetoTrabalho = new TrabalhoVoluntario(nomeTrabalho, descricaoTrabalho, enderecoTrabalho,
                            dataInicioTrabalho, dataFimTrabalho, tipoTrabalho, duracaoTrabalho);

                    if (projetoTrabalho.validaProjeto()) {
                        System.out.println("Projeto válido:");
                        System.out.println(projetoTrabalho.imprimeProjeto());
                    } else {
                        System.out.println("Projeto inválido. Duração do Trabalho menor ou igual a 2 horas.");
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
