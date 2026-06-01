import java.util.*;
public class Jaggedarray {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a[][]=new int[3][];
    a[0]=new int[3];
    a[1]=new int[4];
    a[2]=new int[2];
    for(int i=0;i<a.length;i++) {
      for(int j=0;j<a[i].length;j++) {
        a[i][j]=s.nextInt();
      }
    }
    System.out.println("The marks of the Students");
    for(int i=0;i<a.length;i++) {
      int sum=0;
      for(int j=0;j<a[i].length;j++) {
        System.out.println("Student "+(i+1) +" Subject "+(j+1) +"Marks: "+a[i][j]+" ");
        sum+=a[i][j];
      }
      System.out.println("Total Marks of Student "+(i+1)+" is "+sum);
      System.out.println();

    }

  }
}
