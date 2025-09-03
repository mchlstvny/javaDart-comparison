class Product {
    String name;
    double price;
  
    Product(this.name, this.price);

    void display() {
      print("$name: \$$price");
  }
  
    void use() {
    print('$name is being used');
  }
}

void main() {
  Product laptop = Product("Laptop", 2000.0);
  laptop.display();
}


