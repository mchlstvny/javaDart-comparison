package javaaa;

class EncapsulatedProduct {
    private String name;
    private double price;

    EncapsulatedProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name; 
    }

    double getPrice() { 
        return price; 
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        EncapsulatedProduct p = new EncapsulatedProduct("Laptop", 2000);
        System.out.println(p.getName() + ": $" + p.getPrice());
    }
}
