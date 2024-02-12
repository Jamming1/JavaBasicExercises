package esercizioAbstracts;

public class Triangolo extends Forma {


    float base;
    float altezza;

    public Triangolo(float base,float altezza) {

        this.base = base;
        this.altezza = altezza;

    }
    @Override
    public float area() {
        return (base*altezza)/2;
    }
}
