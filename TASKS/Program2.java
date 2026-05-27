import java.util.Scanner;
class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units: ");
        int units = sc.nextInt();

        int bill = 0;
        if (units <= 250) {
            bill = 0;
        } 
        else if (units <= 300) {
            bill = 50;
        } 
        else {
            bill = 50 + (units - 300);
        }
        System.out.println("Total Bill = ₹" + bill);
    }
}