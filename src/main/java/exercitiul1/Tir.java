package exercitiul1;
public class Tir extends Vehicul{
    private float incarcatura_maxima;

    public Tir() {}

    public Tir(String marca, float pret) {
        super(marca, pret);
    }

    public Tir(float incarcatura_maxima) {
        super();
        this.incarcatura_maxima = incarcatura_maxima;
    }

    public Tir(String marca, float pret, float incarcatura_maxima) {
        super(marca, pret);
        this.incarcatura_maxima = incarcatura_maxima;
    }

}
