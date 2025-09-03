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
}

public class ClassObject {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 2000);
        laptop.displayInfo();
    }
}
