import java.time.LocalDate;
import java.time.Period;

class Pessoa {
    private String nome;
    private String cpf;
    private int anoDeNascimento;
    private double altura;

    public Pessoa(String nome, String cpf, int anoDeNascimento, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.anoDeNascimento = anoDeNascimento;
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

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getIdade() {
        LocalDate hoje = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(anoDeNascimento, 1, 1); // Supondo que o dia e mês de nascimento sejam 1 de janeiro
        Period periodo = Period.between(dataNascimento, hoje);
        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        return anos + " anos, " + meses + " meses e " + dias + " dias";
    }
}
