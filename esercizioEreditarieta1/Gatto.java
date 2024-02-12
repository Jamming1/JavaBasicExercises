package esercizioEreditarieta1;

public class Gatto extends Animal {

    //override del metodo faiIlVerso()
    @Override
    public String toString() {
        return "miao miao <3";
    }

}
/*
Scrivere un programma che contenga una classe
chiamata Animale ed
un metodo chiamato
faiIlVerso() che stampi il verso dell'animale.
Crea poi una sottoclasse
chiamata Gatto che fa override del metodo
faiIlVerso() per miagolare. Prova quindi a far
stampare il verso di Animale e di Gatto.*/
