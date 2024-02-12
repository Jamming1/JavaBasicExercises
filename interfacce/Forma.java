package interfacce;

interface Forma {
public default float calcolaArea(){
    return 0;
}
}
//Scrivere un programma che contenga una
//interfaccia Forma ed un metodo chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo
//che implementano Forma ed implementano il metodo per il calcolo dell'area.