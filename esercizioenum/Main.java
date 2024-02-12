package esercizioenum;

public class Main {
    public static void main (String[] args){
        RettangoloEnum rettangoloEnum = new RettangoloEnum(9.0,8.0);
        Triangolo triangolo = new Triangolo(9.0,8.0);
        System.out.println("l'area è = "+ rettangoloEnum.calcolaArea() +"tipo: "+ rettangoloEnum.getTipo());
        System.out.println("l'area è = "+ triangolo.calcolaArea() +"tipo: "+ triangolo.getTipo());
    }

}

enum TipoForma{
TRIANGOLO,
    RETTANGOLO
}

class Forma{
    private TipoForma tipo;

    public TipoForma getTipo() {
        return tipo;
    }

    public void setTipo(TipoForma tipo) {
        this.tipo = tipo;
    }
    public double calcolaArea(){
        System.out.println("l'area della forma è = ");
        return 0.0;
    }
}

class RettangoloEnum extends Forma{
    double base = 0.0;
    double altezza = 0.0;

    public RettangoloEnum(double base,double altezza){
        this.base = base;
        this.altezza= altezza;
        super.setTipo(TipoForma.RETTANGOLO);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base*altezza;
    }
}

class Triangolo extends Forma{
    double base = 0.0;
    double altezza = 0.0;

    public Triangolo(double base,double altezza){
        this.base = base;
        this.altezza= altezza;
        super.setTipo(TipoForma.TRIANGOLO);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return (base*altezza)/2;
    }
}