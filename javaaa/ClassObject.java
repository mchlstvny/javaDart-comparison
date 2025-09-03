package javaaa;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayInfo() {
        System.out.println(name + ": $" + price);
    }

    void use() {
        System.out.println(name + " is being used");
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 2000);
        laptop.displayInfo();
    }
}
