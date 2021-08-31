package gomes.filipe.domain;

public abstract class Funcionario {
    String nome;
    String sobrenome;
    int antiguidade;
    double salario;
    double plus = 5000;

    public Funcionario(String nome, String sobrenome, int antiguidade, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.antiguidade = antiguidade;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sobrenome=" + sobrenome +
                ", antiguidade=" + antiguidade +
                ", salario=" + salario +
                ", plus=" + plus +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String nome) {
        this.sobrenome = sobrenome;
    }

    public int getAntiguidade() {
        return antiguidade;
    }

    public void setAntiguidade(int antiguidade) {
        this.antiguidade = antiguidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPlus() {
        return plus;
    }

    public void setPlus(double plus) {
        this.plus = plus;
    }
}
