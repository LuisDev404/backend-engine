package JavaOOP.ClasseCompromisso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        Compromisso cp1 = new Compromisso();
        
        cp1.data = dados.nextLine();
        cp1.hora = dados.nextLine();
        cp1.descricao = dados.nextLine();
        
        System.out.println("-----------------------");

        cp1.compromisso();
        cp1.marcado();
        
        dados.close();
    }
}
