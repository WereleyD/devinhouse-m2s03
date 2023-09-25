package exercicio2;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentarSalario(double porcAumento) {
        salario = salario * (porcAumento / 100 + 1);
        return salario;
    }

    public double aumentarSalarioComissao(double porcAumento, double porcComissao) {
        salario = salario * ((porcAumento / 100) + (porcComissao / 100) + 1);
        return salario;
    }
}
