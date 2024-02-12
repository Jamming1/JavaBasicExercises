package esercizioAbstracts;

public class Main {

    public static void main (String[] args){

        Triangolo triangolo = new Triangolo(8,8);
        Rettangolo rettangolo = new Rettangolo(8,8);

        System.out.println("l area del triangolo = "+ triangolo.area());
        System.out.println("l area del rettangolo = "+ rettangolo.area());

    }
}