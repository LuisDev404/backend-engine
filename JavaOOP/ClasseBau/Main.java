package JavaOOP.ClasseBau;

public class Main {
    public static void main(String[] args) {
        Bau bau = new Bau("Cachorro de brinque", "Larissa", true);
        Bau bau1 = new Bau("iphone", "Allana", false);
        Bau bau2 = new Bau("PS5", "Luis", true);
        System.out.println("-------------------");
        bau.status();
        System.out.println("-------------------");
        bau1.status();
        System.out.println("-------------------");
        bau2.status();
    }
}