package JavaOOP.ClasseTV;

public class TV {
    public String marca;
    public int canal;
    public int volume;
    public boolean ligada;

    public void detalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
        System.out.println("Ligada: " + ligada);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
        }
    }
}
