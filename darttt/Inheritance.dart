import 'ClassObject.dart';

// Subclass Laptop
class Laptop extends Product {
  int ram;
  int storage;

  Laptop(String name, double price, this.storage, this.ram) : super(name, price);

  void displayInfo() {
    print("$name: \$$price, RAM ${ram}GB");
  }
}

void main() {
  var laptop = Laptop("MacBook Pro", 2000, 512, 16);
  laptop.displayInfo();
}