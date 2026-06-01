import java.util.*;
class Factorial {
    public static int factorial(int num) {
        if(num==0||num==1) {
            return 1;
        }
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
       int result=factorial(num);
       System.out.println("Factorial: "+result);
    }
}