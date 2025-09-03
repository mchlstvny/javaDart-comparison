import 'ClassObject.dart';
// import 'Inheritance.dart';

// class Laptop extends Product {
//   int ram;

//   Laptop(String name, double price, this.ram) : super(name, price);

//   @override
//   void use() {
//     print('$name is running programs with $ram GB RAM');
//   }
// }

class Phone extends Product {
  String brand;

  Phone(String name, double price, this.brand) : super(name, price);

  @override
  void use() {
    print('$name is making a call from $brand');
  }
}

class iPad extends Product {
  String brand;

  iPad(String name, double price, this.brand) : super(name, price);

  @override
  void use() {
    print('$name is browsing the internet from $brand');
  }
}

void main() {
  List<Product> products = [
    iPad('iPad Gen 11', 2000, 'Apple'),
    Phone('iPhone 15', 1200, 'Apple')
  ];

  for (var p in products) {
    p.use();
  }
}
