/*
*
*
* */



import java.util.*;

class UD{
    int p;
    int q;
    UD (int p, int q){
        this.p = p;
        this.q = q;
    }
    // method
    void rozwin(){
        int cyfra, reszta;

        //create arraylist s
        ArrayList <Integer> cyfry = new ArrayList <Integer> (); //() - metoda konstruktora
        ArrayList <Integer> reszty = new ArrayList <Integer> ();

        cyfra = p/q;
        reszta = p%q;

        System.out.print(cyfra+".");
        if (reszta == 0) System.out.print(0);
            else {
                boolean koniec = false, okres = false;

                while(!koniec && !okres){
                    reszty.add(reszta);  // dodanie do listy
                    reszta = reszta * 10;
                    // nowa reszta ktora powstaje
                    cyfra = reszta / q;
                    cyfry.add(cyfra);  // dodanie do listy
                    reszta = reszta%q;

                    // czy nie jest ta reszta zero :
                    if (reszta == 0){
                        koniec = true;
                        for (int i=0; i<cyfry.size();i++) System.out.print(cyfry.get(i));
                        System.out.println(" ");
                    }
                    if (reszty.contains(reszta)){ // odloowanie sie do listy
                        okres = true;
                        int indeks = reszty.indexOf(reszta); // znalezenie elementu reszty przez metode indexOf
                        for (int i=0; i<indeks; i++) {
                            System.out.print(cyfry.get(i));
                        }
                            System.out.print("(");
                        for (int i=indeks; i<cyfry.size();i++) {
                            System.out.print(cyfry.get(i));
                        }
                            System.out.print(")");

                    }
                }
        }
     }
}

public class UDTest {
    public static void main(String[] args) {
        int p, q;
        // wpisz dowolne (int) liczby
        p = 13;
        q = 97;
        UD ulamek = new UD(p, q);
        ulamek.rozwin(); // create in klass UD jako
    }
}
