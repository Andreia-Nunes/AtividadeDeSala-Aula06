import java.util.Locale;

public class TesteFuncionario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Funcionario func = new Funcionario(12345, "Maria José dos Santos", "maria@gmail.com", 30000.00);

        System.out.printf("Nome do(a) funcionário(a): %s\n", func.getNome());
        System.out.printf("Identificador: %d\n", func.getId());
        System.out.printf("E-mail: %s\n", func.getEmail());
        System.out.printf("Salário: R$ %.2f\n", func.getSalario());

        func.aumentarSalario(50);

        System.out.println();
        System.out.printf("Novo salário pós-aumento: R$ %.2f\n", func.getSalario());
        System.out.printf("Imposto a pagar: R$ %.2f\n", CalculadoraImposto.calculaImposto(func));

    }
}
