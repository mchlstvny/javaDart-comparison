package javaaa;

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

// Subclass Phone
class iPad extends Product {
    String brand;

   iPad(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    void use() {
        System.out.println(name + " is browsing the internet from " + brand);
    }
}

// Main class
public class Polymorphism {
    public static void main(String[] args) {
        Product[] product = {
            new iPad("iPad Gen 11", 2000, "Apple"),  
            new Phone("iPhone 15", 549, "Apple")
        };

        for (Product p : product) {
            p.use();
        }
    }
}


