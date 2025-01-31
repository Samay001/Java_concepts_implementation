class Employee{
    void displayMessage(){
        System.out.println("Hello from Anonymous");
    }
}

class Manager extends Employee{
    void displayMessage(){
        System.out.println("Hello from Manager");
        super.displayMessage();
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.displayMessage();
    }
}
