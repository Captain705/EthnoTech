public class Booking {
  void booking() {
    int price=180;
    System.out.println("Auto Price per KM is "+price);
  }
}
class Bike extends Booking {
  void booking() {
    int cost=80;
    System.out.println("Bike price per KM is "+cost);
  }
}

class Car extends Booking {
  void booking() {
    int amount=250;
    System.out.println("Car price per KM is "+amount);
  }
}

class Uber {
  public static void main(String[] args) {
    Booking b=new Booking();
    b.booking();
    Bike bk=new Bike();
    bk.booking();
    Car c=new Car();
    c.booking();
  }
}