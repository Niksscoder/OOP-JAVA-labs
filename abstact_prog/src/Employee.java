public class Employee extends Person {

    private String bank;
    public Employee(String name, String company){
        super(name);
        this.bank = company;
    }

    // method
    public void display(){
        // use super.getName because we have method String = return
        System.out.println("Employee name is: " + super.getName() + ", bank: " + bank);
    }
}

