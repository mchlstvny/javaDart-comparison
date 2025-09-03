class Product {
    String name;
    double price;
  
    Product(this.name, this.price);

    void display() {
      print("Product Name: $name");
      print("Product Price: \$${price.toStringAsFixed(2)}");
    }
}

void main() {
  Product laptop = Product("Laptop", 1000.00);
  laptop.display();
}

