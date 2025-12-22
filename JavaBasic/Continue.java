package JavaBasic;

public class Continue {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue; // pula quando i for 3
            }

            System.out.println("Valor de i: " + i);
        }
    }
}
