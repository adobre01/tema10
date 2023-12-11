package exercitiul1;

public class Motocicleta extends Vehicul
{

    private float viteza_maxima;

    public Motocicleta() {}

    public Motocicleta(float viteza_maxima) {
        this.viteza_maxima = viteza_maxima;
    }

    public Motocicleta(String marca, float pret, float viteza_maxima) {
        super(marca, pret);
        this.viteza_maxima = viteza_maxima;
    }
}
