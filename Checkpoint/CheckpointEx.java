package Checkpoint;

public class CheckpointEx {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8};

        //calcoloValoreMaxMin(numeri);
        System.out.println("il prodotto della moltiplicazione è: "+ evenNumbers(numeri));
        System.out.println(calcoloValoreMaxMin(numeri));

    }

    static boolean calcoloValoreMaxMin(int[] numeri) {
        int valoreMax = numeri[0];
        int valoreMin = numeri[0];
        for (int numero : numeri) {
            if (valoreMax < numero) {
                valoreMax = numero;
            }

            if (valoreMin > numero) {
                valoreMin = numero;
            }
        }
        System.out.println("il valore minimo è: " + valoreMin);
        System.out.println("il valore massimo è: " + valoreMax);
        return false;
    }

    static int evenNumbers(int[] numeri){
        int prodottoPari = 1;

        for(int numero : numeri){
            if(numero%2==0){
              prodottoPari =  prodottoPari*numero;
            }
        }
        return prodottoPari;
    }
}

//Scrivere un metodo che a partire da un array calcoli
// il valore massimo e il valore minimo e stampi l’informazione a video.
//Scrivere un metodo che calcoli il prodotto di tutti i numeri pari all’interno
//dell’array e stampi l’informazione a video.