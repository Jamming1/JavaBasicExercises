package Checkpoint;

public class Checkprova {
    public static void main(String[] args) {
        System.out.println(valoreMassimoMinimo(numeri));
        System.out.println(oddEven(numeri));

    }
    static int[] numeri={6,9,23,11,55,45,78,93};
    static int valoreMassimoMinimo(int[]numeri){
        int valoreMassimo= numeri[0];
        int valoreMinimo= numeri[0];

        for(int numero:numeri){

            if(valoreMassimo<numero){
             valoreMassimo=numero;
            }
            if (valoreMinimo>numero) {
             valoreMinimo=numero;
            }
        }
        System.out.println("il max: "+ valoreMassimo);
        System.out.println("il min: "+ valoreMinimo);
        return valoreMassimo;
    }
    static int oddEven(int[] numeri){
        int evenNumvers = 1;
        for(int numero:numeri){
            if(numero%2==0){
                evenNumvers = numero*evenNumvers;
            }
        }
        return evenNumvers;
    }
}

//Scrivere un metodo che a partire da un array calcoli
// il valore massimo e il valore minimo e stampi l’informazione a video.
//Scrivere un metodo che calcoli il prodotto di tutti i numeri pari all’interno
//dell’array e stampi l’informazione a video.