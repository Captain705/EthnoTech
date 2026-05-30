abstract class Foodorder {
    String customerName;
    int quantity;
    double price;
    // Parameterized constructor
    Foodorder(String name, int quantity, double price) {
        this.customerName = name;
        this.quantity = quantity;
        this.price = price;
    }

    abstract void orderFood();
    void generateBill() {
        double total = quantity * price;

        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price per item: " + price);
        System.out.println("Total Bill    : " + total);
    }
}

class PizzaOrder extends Foodorder {

    PizzaOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }
    void orderFood() {
        System.out.println("Pizza order placed successfully!");
    }
}
class dosaorder extends Foodorder{
    dosaorder(String name,int quantity,double price){
        super(name,quantity,price);
    }
    void orderFood(){
        System.out.println("dosa order placed successfully!");
    }
}
class shawarma extends Foodorder{
    shawarma(String name,int quantity,double price){
        super(name,quantity,price);
    }
    void orderFood(){
        System.out.println("dosa order placed successfully!");
    }
}
class idly extends Foodorder{
    idly(String name,int quantity,double price){
        super(name,quantity,price);
    }
    void orderFood(){
        System.out.println("Idly oder placed successfully");
    }
}

class pongal extends Foodorder{
    pongal(String name,int quantity,double price){
        super(name,quantity,price);
    }
    void orderFood(){
        System.out.println("Pongal oder placed successfully");
    }
}
public class Abstraction {
    public static void main(String[] args) {

        PizzaOrder p = new PizzaOrder("Rev", 2, 250);
        dosaorder q=new dosaorder("loki",7,350);
        shawarma w=new shawarma("tinku",3,150);
        idly e=new idly("Raja",3,150);
        pongal r=new pongal("Ravi",2,150);
        p.orderFood();
        p.generateBill();
        q.orderFood();
        q.generateBill();
        w.orderFood();
        w.generateBill();
        e.orderFood();
        e.generateBill();
        r.orderFood();
        r.generateBill();
    }

    }