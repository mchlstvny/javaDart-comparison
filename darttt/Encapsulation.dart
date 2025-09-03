class EncapsulatedProduct {
  String _name;   
  double _price; 

  EncapsulatedProduct(this._name, this._price);

  String get name => _name;
  double get price => _price;
}

void main() {
  var p = EncapsulatedProduct("Laptop", 2000);
  print("${p.name}: \$${p.price}");
}
