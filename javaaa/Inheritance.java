package javaaa;

class Laptop extends Product {
    int ram;
    int storage;
    Laptop(String name, double price, int storage, int ram) { 
        super(name, price); 
        this.storage = storage;
        this.ram = ram;  
    }
    void displayInfo() { 
        System.out.println(name + ": $" + price + ", Storage " + storage + "GB" + ", RAM " + ram + "GB"); 
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("MacBook Pro", 2000, 512, 16);
        laptop.displayInfo();
    }
}
