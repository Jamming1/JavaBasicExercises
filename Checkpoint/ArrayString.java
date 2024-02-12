package Checkpoint;

import java.util.Arrays;

public class ArrayString {
public static void main(String[] args) {
    String parola = "Cocco";
    int lunghezza = 3;
    String[] stringsArray = stringArray(parola,lunghezza);
    for(String stringa:stringsArray){
        System.out.println(stringa);
    }
}

public static String[] stringArray(String parola,int lunghezza) {
    String[] array = new String[lunghezza];
    Arrays.fill(array, parola);

    return array;
}

}

// scrivere un metodo che ritorni un array
// di stringhe basato su una lunghezza e una parola passata





