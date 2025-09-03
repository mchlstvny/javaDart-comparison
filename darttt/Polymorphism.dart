class Product {
  String name;
  double price;

  Product(this.name, this.price);

  void use() {
    print('$name is being used');
  }
}

class Laptop extends Product {
  int ram;

  Laptop(String name, double price, this.ram) : super(name, price);

  @override
  void use() {
    print('$name is running programs with $ram GB RAM');
  }
}

class Phone extends Product {
  String brand;

  Phone(String name, double price, this.brand) : super(name, price);

  @override
  void use() {
    print('$name is making a call from $brand');
  }
}

void main() {
  List<Product> products = [
    Laptop('MacBook Pro', 2000, 16),
    Phone('iPhone 15', 1200, 'Apple')
  ];

  for (var p in products) {
    p.use();
  }
}
