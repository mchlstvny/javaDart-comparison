package javaaa;

// Parent class
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void use() {
        System.out.println(name + " is being used");
    }
}

// Subclass Laptop
class Laptop extends Product {
    int ram;

    Laptop(String name, double price, int ram) {
        super(name, price);
        this.ram = ram;
    }

    @Override
    void use() {
        System.out.println(name + " is running programs with " + ram + "GB RAM");
    }
}

// Subclass Phone
class Phone extends Product {
    String brand;

    Phone(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    void use() {
        System.out.println(name + " is making a call from " + brand);
    }
}

// Main class
public class Polymorphism {
    public static void main(String[] args) {
        Product[] products = {
            new Laptop("MacBook Pro", 2000.0, 16),  
            new Phone("iPhone 15", 1200.0, "Apple")
        };

        for (Product p : products) {
            p.use();
        }
    }
}
