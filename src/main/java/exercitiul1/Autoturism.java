package exercitiul1;

public class Autoturism extends Vehicul{
    private float volum_portbagaj;
    private float kg_portbagaj;

    public Autoturism() {}

    public Autoturism(float volum_portbagaj, float kg_portbagaj) {
        this.volum_portbagaj = volum_portbagaj;
        this.kg_portbagaj = kg_portbagaj;
    }

    public Autoturism(String marca, float pret, float volum_portbagaj, float kg_portbagaj) {
        super(marca, pret);
        this.volum_portbagaj = volum_portbagaj;
        this.kg_portbagaj = kg_portbagaj;
    }

}


