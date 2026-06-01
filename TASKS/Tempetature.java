import java.util.*;
public class Tempetature {
  public static void main(String[] args) { 
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] array=new int[n];
    for(int i=0;i<n;i++) {
      array[i]=s.nextInt();
    }
    int max=array[0];
    for(int i=0;i<n;i++) {
      if(array[i]>max) {
        max=array[i];
      }
    }
    System.out.println("Maximum temperature is "+max);
    int min=array[0];
    for(int i=0;i<n;i++) {
      if(array[i]<min) {
        min=array[i];
      }
    }
    System.out.println("Minimum temperature is "+min);
    int sum=0;
    for(int i=0;i<n;i++) {
       sum+=array[i];
     }
     System.out.println("Average temperature is "+(sum/n));
     for(int i=0;i<n;i++) {
      if(array[i]>=35) {
        System.out.println("Hot day at "+i+"th day");
      }
     }

 }

}
