// create construct of class and use
class Fruit{
    String name;
    String color;
    public Fruit(String name, String color){
        this.name = name;
        this.color = color;
    }
    public void intro(){
        System.out.println("The fruit is: " + name + ", the color is " + color + ".");

    }
}

// create class Car
class Car{
    String name;
    int year;

    //create contruct
    public Car(String name, int year){
        this.name = name;
        this.year = year;
    }
    //create method
    public void describe(){
        System.out.println("Car name is: " + name + " nad cars year : " + year + ".");

    }

}

// create class for car
class BMW extends Car{
    String color;

    // create construct
    public BMW(String name, int year,String color){
        // take pola from superclass
        super(name, year);
        // create new pole only for class BMW
        this.color = color;
    }

    // create methods
    public void print_color(){
        System.out.println(name + " has a " + color + " color.");
    }
    public void print_year(){
        System.out.println("Year of this car = " + year);
    }


}

public class Main {

    public static void main(String[] args) {
        // for Fruit(objects)
	Fruit strawberry = new Fruit("Strawberry", "red");
	strawberry.intro();
	// For cars (objects)
        BMW bmw = new BMW("BMW", 2010, "red");
        bmw.print_color();
        bmw.print_year();
        bmw.describe();
    }
}
