public class Main {
    public static void main(String[] args) {
        Caneta c1 =  new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.modelo = "Bic Cristal";
        c1.carga = 80;
        c1.destampar();
        c1.status();
        c1.rabiscar();

        System.out.println("-------------------");

        Caneta c2 = new Caneta();
        c2.modelo = "Compactor";
        c2.cor = "vermelha";
        c2.ponta = 0.7f;
        c2.carga = 50;
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}