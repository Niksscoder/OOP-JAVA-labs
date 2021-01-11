package com.company;

public class Main {

    public static void main(String[] args) {
        double a,b,c,x1,x2;
        String opisR;
        RK rownanie1 = new RK(1, 4, 1);
        // odlowywanie do metody (.rozwiazanie()) klasy RK
        rownanie1.rozwiazanie();
        System.out.println(rownanie1.getOpisR() + " " + rownanie1.getX1() + " " + rownanie1.getX2());

        RK rownanie2 = new RK(1, 4, 5);
        // odlowywanie do metody (.rozwiazanie()) klasy RK
        rownanie2.rozwiazanie();
        System.out.println(rownanie2.getOpisR() + " " + rownanie2.getX1() + " " + rownanie2.getX2());
    }
}

// konstruktor nazywa sie tak samo jak klasa
class RK {
    private double a, b, c, x1,x2;
    private String opisR;

    // Konstruktor
    RK(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // metod
    int rozwiazanie() {

        if (a == 0) {
            opisR = "To nie jest rownanie kwadratowe !";
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                opisR = "Brak rozwiazan rzeczywistych !";
            } else {
                if (delta == 0) {
                    x1 = x2 = -b / 2 / a;
                    opisR = "Pierwiastek podwojny ";

                } else {
                    x1 = (-b + Math.sqrt(delta)) / 2 / a;
                    x2 = (-b - Math.sqrt(delta)) / 2 / a;
                    opisR = "2 pierwistki ";

                }
            }
        }
        return 0;
    }
        // metoda get dla otrzymania danych z privat
        double getX1() {return x1;}
        double getX2() {return x2;}
        String getOpisR() {return opisR;}

}