class Vehicles {
  void car() {
    System.out.println("car");
  }
}
class Bike {
  void bike() {
    System.out.println("bike");
  }
}
class Bus {
  void bus() {
    System.out.println("bus");
  }
}

class Polymorphism {
  public static void main(String[] args) {
    Vehicles v = new Vehicles();
    v.car();
    Bike b = new Bike();
    b.bike();
    Bus bs = new Bus();
    bs.bus();
  }
}