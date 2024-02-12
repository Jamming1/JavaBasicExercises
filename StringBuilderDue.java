public class StringBuilderDue {
    public static void main(String[] args) {
        String risultato = getUnicode("ciao",3);
        System.out.println(risultato);

    }

    public static String getUnicode(String stringa,int posizione){
        StringBuilder stringBuilder = new StringBuilder();
        if(posizione<stringa.length()){
            char c = stringa.toCharArray()[posizione];
            return stringBuilder.append("il carattere scelto è: ").append(c).append(" in unicode: ").append((int)c).toString();
        } else {
            return "il carattere non è compreso";
        }
    }
}
//Scrivi un programma Java che abbia un metodo che
// prenda il carattere in Unicode in un indice specifico
// all'interno di una stringa e lo stampi.
//Il metodo dovrà avere nel costruttore una stringa
// ed una posizione e dovrà resituire il carattere
// in unicode o una stringa di errore.
//Per la creazione della stringa di risultato dovrebbe
// essere utilizzato StringBuilder