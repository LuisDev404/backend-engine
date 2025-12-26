package JavaOOP.ClasseBau;

public class Bau {
    private String conteudo;
    private String quemTemAcesso;
    public boolean estaAberto;

    public Bau(String conteudo, String quemTemAcesso, boolean estaAberto) {
        this.conteudo = getConteudo();
        this.quemTemAcesso = quemTemAcesso;
        this.estaAberto = estaAberto;
    }

    public void status() {
            System.out.println("Quem tem acesso ao baú: " + quemTemAcesso);
            if (estaAberto) {
                System.out.println("O baú está aberto e contém: " + getConteudo());
            } else {
                System.out.println("O baú está fechado.");
            }

    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public boolean isEstaAberto() {
        return estaAberto;
    }

    public void setEstaAberto(boolean estaAberto) {
        this.estaAberto = estaAberto;
    }


    public String getQuemTemAcesso() {
        return quemTemAcesso;
    }


    public void setQuemTemAcesso(String quemTemAcesso) {
        this.quemTemAcesso = quemTemAcesso;
    }

}