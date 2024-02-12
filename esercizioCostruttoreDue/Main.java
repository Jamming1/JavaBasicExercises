package esercizioCostruttoreDue;

public class Main {

    public static void main(String[] args) {
        Auto firstAuto = new Auto("Audi", "A4", "ZXY123", "cm3 1.968");
        System.out.println(firstAuto);

        //sostituisco i dati in firstAuto usando get e set
        System.out.println(firstAuto.getBrand());
        firstAuto.setBrand("BMW");

        System.out.println("New brand name: " + firstAuto.getBrand());
    }
}
