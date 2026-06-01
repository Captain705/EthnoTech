interface UpiPayment {
    void upi(double amount);
}
interface CashPayment {
    void cash(double amount);
}
class Interface implements UpiPayment, CashPayment {
    public void upi(double amount) {
        System.out.println("Payment of Rs." + amount + " made through UPI.");
    }
    public void cash(double amount) {
        System.out.println("Payment of Rs." + amount + " made through Cash.");
    }
    public static void main(String[] args) {
        Interface p = new Interface();
        p.upi(1000);
        p.cash(500);
    }
}