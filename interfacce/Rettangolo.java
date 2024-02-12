package interfacce;

public class Rettangolo implements Forma{
    float base;
    float altezza;
    public Rettangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public float calcolaArea() {
        return base*altezza;
    }
}
