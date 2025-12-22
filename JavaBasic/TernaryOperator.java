package JavaBasic;

public class TernaryOperator {

    public static void main(String[] args) {
        
        // Operador ternario
        // Foi feito uma alteração no VScode que após digitar "tern" ele cria a estrutura do operador ternario
        int salario = 4000;
        String Doar = "Vou doar";
        String NaoDoar = "Não vou doar";
        String resultado = salario > 5000 ? Doar : NaoDoar;
        System.out.println(resultado);
    }
}