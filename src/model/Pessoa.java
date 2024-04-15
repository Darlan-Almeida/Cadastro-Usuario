import java.time.LocalDate;
import java.time.Period;

class Pessoa {
    private String nome;
    private String cpf;
    private int dataDeNascimento;
    private double altura;

    public Pessoa(String nome, String cpf, int dataDeNascimento, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getdataDeNascimento() {
        return dataDeNascimento;
    }

    public void setdataDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int anoAtual){
        this.dataDeNascimento = dataDeNascimento;
    }
    

    public String getIdade() {
        LocalDate hoje = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(dataDeNascimento, 1, 1); // Supondo que o dia e mês de nascimento sejam 1 de janeiro
        Period periodo = Period.between(dataNascimento, hoje);
        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        return anos + " anos, " + meses + " meses e " + dias + " dias";
    }
}
