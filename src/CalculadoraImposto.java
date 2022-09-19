public class CalculadoraImposto {

    private static double percentualImposto = 3.0;

    public static double calculaImposto(Funcionario funcionario){
         return funcionario.getSalario() * percentualImposto / 100.0;
    }
}
