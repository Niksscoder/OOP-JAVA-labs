class A{
    A(){
        System.out.println("Dziala konstruktor A");
    }
}


class B extends A{
    B(){
        System.out.println("Konstruktor dziala z klasy B!");

    }
}
// dziedziczenie klasy b
class C extends B{
    C(){
        System.out.println("Konstruktor dziala z klasy C!");
    }
}

public class DemoDziedziczenie {
    public static void main(String[] args) {
        C c = new C();
    }
}
