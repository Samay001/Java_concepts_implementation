abstract class Payment{
    abstract void processpayment(double amount);
}

class Paypal_Payment extends Payment{
    @Override
    void processpayment(double amount) {
        System.out.println("Payment Successfully Through Paypal " + amount);
    }
}

class Credit_Card extends Payment{
    @Override
    void processpayment(double amount) {
        System.out.println("Payment Successfully Through Credit Card " + amount);
    }
}

public class Abstraction {
    public static void main(String[] args){
        Paypal_Payment payment1 = new Paypal_Payment();
        payment1.processpayment(1000);

        Credit_Card payment2 = new Credit_Card();
        payment2.processpayment(2000);

    }
}
