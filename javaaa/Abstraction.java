package javaaa;

abstract class Payment {
    abstract void pay(double amount);
}

class CreditCard extends Payment {
    void pay(double amount) {
        System.out.println("Paid $" + amount + " with Credit Card");
    }
}

class DebitCard extends Payment {
    void pay(double amount) {
        System.out.println("Paid $" + amount + " with Debit Card");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Payment p = new CreditCard();
        p.pay(250);
        Payment p2 = new DebitCard();
        p2.pay(350);
    }
}
