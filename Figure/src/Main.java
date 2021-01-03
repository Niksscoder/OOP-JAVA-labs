/*
Laba_3 :

Z zastosowaniem, różnych metod i klas,posługujac : interfejs i extend, zbudować program.
Utworz klasę Figura, która ma atrybuty wymiaru dim1 i dim2 oraz metode pole(), obliczajace pole powirzchni figury.
Utwórz klase dziedziczace po klasie Figura odpowiednio Prostokat, trojkat, Kolo, ktore beda wykorzystywaly atrybuty
z klasy Figura i przesłaniały metodę pole().

*/

class Figura{
    double dim1;
    double dim2;

    // konstruktora klasy Figura
    Figura(double x, double y){
        dim1 = x;
        dim2 = y;
    }

    // tworzymy metode
    double pole(){
        System.out.println("Pole figury nie jest okreslone !");
        return 0.0;
    }
}


class Prostokat extends Figura{ // extends czyli dziedziczenie klasy Figura
    Prostokat(double a, double b) {
        super(a, b); // otrzymanie danych przez zmienne x i y
    }
    // metoda klasy
    double pole(){
        System.out.println("W klasie prostokat !");
        return dim1 * dim2;
    }
}

class Trojkat extends Figura{

    // konstruktor
    Trojkat(double a, double b){
        super(a, b);
    }
    // metoda klasy
    double pole(){
        System.out.println("w klasie Trojkat !");
        return dim1 * dim2 / 2;
    }
}

class Trapez extends Figura {
    // create new
    double DrugiBock;

    // konstruktor klasy Trapez
    Trapez(double podstawa, double wysokosc, double DrugiBock){
        super(podstawa,  wysokosc);
        this.DrugiBock = DrugiBock;
    }
    double pole(){
        System.out.println("W klasie Trapez !");
        return (dim1 + DrugiBock) * dim2 / 2;
    }
}

class Main {

    public static void main(String[] args) {
        Figura fig = new Figura(10.0, 10.0);
        Prostokat prostokat = new Prostokat(5.0, 7.0);
        Trojkat trojkat = new Trojkat(11.0, 4.5);
        Trapez trapez = new Trapez(10, 5,6);

        // referencjaF
        Figura figura;

        figura = fig;
        System.out.println("Pole figura: " + figura.pole());

        figura = prostokat;
        System.out.println("Pole prostokata : " + figura.pole());

        figura = trojkat;
        System.out.println("Pole trojkata : " + figura.pole());

        figura = trapez;
        System.out.println("Pole Trapezy : " + figura.pole());
    }
}
