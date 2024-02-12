public class ArrayDue {

    public static void main(String[] args) {

        char[] characters = createCharArray();
        char charToFind = 'a';
        System.out.println("Numero occorrenze di: " + charToFind + " è di: " + findOccurencies(charToFind, characters ));
    }

    public static char[] createCharArray(){
        char[] characters = new char[5];
        characters[0]= 'a';
        characters[1]= 'b';
        characters[2]= 'c';
        characters[3]= 'd';
        characters[4]= 'e';
        return characters;
    }

    public static int findOccurencies(char toFind, char[] characters){
        int occurencies = 0;
        for(char characters1: characters){
            if(characters1 == toFind){
                occurencies++;
            }
        }
        return occurencies;

    }

}


//Scrivi un programma che contenga un metodo che crea un array e
//lo riempie con dei caratteri. Questo metodo dovrà poi stampare tutte le
//occorrenze del carattere a o 0 in caso non ce ne siano.