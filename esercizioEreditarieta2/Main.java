package esercizioEreditarieta2;
public class Main {

    public static void main (String[] args){

        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(6,7);
        Triangolo triangolo = new Triangolo (8,8);

        System.out.println(forma);
        System.out.println("l area del triangolo = "+ triangolo.area());
        System.out.println("l area del rettangolo = " + rettangolo.area());

    }
}
