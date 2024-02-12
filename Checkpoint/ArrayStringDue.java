package Checkpoint;

class ArrayStringDue{
    public static void main(String[] args) {
        String[] testo = {"ciao ","io ","sono ","una ","vincente "};
        System.out.println(isStringContained(testo,1));

    }
    static boolean isStringContained(String[] testo, int length){
        for(String stringhe:testo){
            if(stringhe.length()==length){
                return true;
            }
        }
        return false;
    }
}
//
////Scrivere un metodo che ricerchi se una stringa di lunghezza
////definita dall’utente è contenuta o meno all’iterno dell’array e che restituisca
////true o false come risultato della ricerca. Il risultato della ricerca dovrà essere stampato a video.

