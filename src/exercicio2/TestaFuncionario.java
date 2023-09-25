package exercicio2;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Wesley Dieterich");
        func.setSalario(5000);

        Funcionario func2 = new Funcionario("Wesley", 3500);

        System.out.println("Nome: " + func.getNome());
        System.out.printf("Salário: R$ %.2f\n", func.getSalario());
        System.out.printf("Salário após aumento: R$ %.2f\n", func.aumentarSalario(35));
        System.out.printf("Salário após aumento com comissão: R$ %.2f", func.aumentarSalarioComissao(35, 3));

    }

}
