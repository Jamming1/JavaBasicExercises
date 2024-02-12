package esercizioEreditarieta2;

public class Rettangolo extends Forma{

    float base;
    float altezza;

    public Rettangolo(float base,float altezza) {

        this.base = base;
        this.altezza = altezza;

    }

    @Override
    public float area() {
     return base*altezza;
    }
}



//ti basta creare una classe con calcolaArea() e un
// semplice print ln ad esempio , la estendi poi a rettangolo e
// usi tipo double area = base * altezza;
//per calcolare l'area