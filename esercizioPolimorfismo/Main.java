package esercizioPolimorfismo;

public class Main {

    public static void main (String[] args){

        Forma forma = new Forma();
        Triangolo triangolo = new Triangolo (8,8);

        System.out.println(forma);
        System.out.println("l area del triangolo = "+ triangolo.area());

    }
}