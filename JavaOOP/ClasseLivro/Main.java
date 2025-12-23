package JavaOOP.ClasseLivro;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.titulo = "Aprendendo Java";
        l1.autor = "Guanabara";
        l1.totPaginas = 200;
        l1.pagAtual = 1;
        l1.abrir();
        l1.detalhes();
        l1.lerPag();

        System.out.println("-------------------");

        Livro l2 = new Livro();
        l2.titulo = "POO para Iniciantes";
        l2.autor = "Guanabara";
        l2.totPaginas = 150;
        l2.pagAtual = 37;
        l2.fechar();
        l2.detalhes();
        l2.lerPag();
    }
}
