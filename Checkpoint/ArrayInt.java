package Checkpoint;

public class ArrayInt {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5, 6};
        System.out.println(printSum(numeri));
    }

    private static int printSum(int[] numeri) {
        int smaller = numeri[0];
        int bigger = numeri[0];

        for (int numero : numeri) {
            if (smaller < numero) {
                smaller = numero;
            }
            if (bigger > numero) {
                bigger = numero;
            }
        }
        return bigger+smaller;
    }
}





//creare un metodo che dato un array di int ritorni la somma del primo e
// dell'ultimo