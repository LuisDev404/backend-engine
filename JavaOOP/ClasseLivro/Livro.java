package JavaOOP.ClasseLivro;

public class Livro {
    String titulo;
    String autor;
    int totPaginas;
    int pagAtual;
    boolean aberto;
    
    void detalhes() {
        System.out.println("Livro " + this.titulo + " escrito por " + this.autor);
        System.out.println("Total de páginas: " + this.totPaginas);
        System.out.println("Página atual: " + this.pagAtual);
        System.out.println("Está aberto? " + this.aberto);
    }

    void lerPag() {
        if(this.aberto == true){
            System.out.println("Lendo a página " + this.pagAtual + " do livro " + this.titulo);
        } else {
            System.out.println("Não posso ler um livro fechado.");
        }
    }

    void abrir() {
        this.aberto = true;
    }

    void fechar() {
        this.aberto = false;
    }
}