package JavaOOP.ClasseLivro;

public class Livro {
    public String titulo;
    public String autor;
    public int totPaginas;
    public int pagAtual;
    public boolean aberto;

    public void detalhes() {
        System.out.println("Livro " + this.titulo + " escrito por " + this.autor);
        System.out.println("Total de páginas: " + this.totPaginas);
        System.out.println("Página atual: " + this.pagAtual);
        System.out.println("Está aberto? " + this.aberto);
    }

    public void lerPag() {
        if(this.aberto == true){
            System.out.println("Lendo a página " + this.pagAtual + " do livro " + this.titulo);
        } else {
            System.out.println("Não posso ler um livro fechado.");
        }
    }

    public void abrir() {
        this.aberto = true;
    }

    public void fechar() {
        this.aberto = false;
    }
}