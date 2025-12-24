package JavaOOP.ClasseTV;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.marca = "Samsung";
        tv.canal = 5;
        tv.volume = 10;
        tv.ligar();
        tv.detalhes();
    }    
}
