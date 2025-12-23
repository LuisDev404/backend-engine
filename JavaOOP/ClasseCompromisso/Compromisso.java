package JavaOOP.ClasseCompromisso;

public class Compromisso {
    String data;
    String hora;
    String descricao;

    void compromisso() {
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Descrição: " + descricao);
    }

    void marcado() {
        System.out.println("Compromisso marcado para " + data + " às " + hora);
        System.out.println("Descrição: " + descricao);
    }

    void desmarcado() {
        System.out.println("Compromisso desmarcado: " + descricao);
    }
}
