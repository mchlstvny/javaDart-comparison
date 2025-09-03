abstract class Payment {
  void pay(double amount);
}

class CreditCard extends Payment {
  void pay(double amount) {
    print("Paid \$$amount using Credit Card");
  }
}

class DebitCard extends Payment {
  void pay(double amount) {
    print("Paid \$$amount using Debit Card");
  }
}

void main() {
  Payment p1 = CreditCard();
  p1.pay(250.0);
  Payment p2 = DebitCard();
  p2.pay(350.0);
}