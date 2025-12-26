package JavaOOP.ClasseCaneta;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;

    public void status(){
        System.out.println("Sobre a caneta!");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Uma caneta de ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}
