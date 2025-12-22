package JavaBasic;

public class OperatorsAssignment {
    public static void main(String[] args) {
        
        // Os Operedores de atribuição são:

        // = += -= *= /= %=

        System.out.println("voê recebera um bonus!");
        int salario = 1500;
        salario += 1000;
        System.out.println("Você recebera nesse mês " + salario);


        // ++ --
        System.out.println("Você tem um dia a mais de descanso!");
        Byte BancoDeHoras = 2;
        BancoDeHoras++;
        System.out.println("O total de de dias de descanso que você tem é " + BancoDeHoras);
    }
}
