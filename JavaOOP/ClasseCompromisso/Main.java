package JavaOOP.ClasseCompromisso;

public class Main {
    public static void main(String[] args) {
        Compromisso cp1 = new Compromisso();
        cp1.data = "25/12/2024";
        cp1.hora = "10:00";
        cp1.descricao = "Reunião de Natal";
        cp1.compromisso();

        System.out.println("-----------------------");

        Compromisso cp2 = new Compromisso();
        cp2.data = "31/12/2024";
        cp2.hora = "23:59";
        cp2.descricao = "Festa de Ano Novo";
        cp2.marcado();
    }
}
