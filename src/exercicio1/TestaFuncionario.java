package exercicio1;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("04304335065", "Wesley Dieterich", 3440.90);
        System.out.println("CPF: " + func.getCpf());
        System.out.println("Nome: " + func.getNome());
        System.out.printf("Salário: R$ %.2f\n", func.getSalario());
        System.out.printf("Salário após aumento: R$ %.2f", func.aumentarSalario(35));
    }
}
