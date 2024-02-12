public class StringBuilderUno {
    public static void main(String[] args){
        String textOne = "La mela è matura!";
        String textTwo = "La mela è matura!";

        boolean comparazione = textOne.equals(textTwo);

        System.out.println(comparazione);

        if(comparazione == true){
            System.out.println("Le due stringhe sono uguali");
        } else {
            System.out.println("Le due stringhe sono differenti");
        }
    }
}


//Scrivi un programma Java che abbia un metodo
// che prenda due stringhe e le compari lessico-graficamente.
//Il metodo dovrà restituire "Le due stringhe sono uguali"
// o "Le due stringhe sono differenti" basandosi sul risultato del confronto.
//Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.