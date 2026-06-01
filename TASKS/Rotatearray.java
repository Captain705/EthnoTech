

import java.util.*;
public class Rotatearray {
  void rotate(int[] array,int k) { 
    reverse(0,array.length-1,array);
    reverse(0,k-1,array);
    reverse(k,array.length-1,array);
    for(int i=0;i<array.length;i++) {
      System.out.print(array[i]+" ");
    }
  }
  void reverse(int start,int end,int[] array) { 
    while(start<end) { 
      int temp=array[start];
      array[start]=array[end];
      array[end]=temp;
      start++;
      end--;
    }
  }
  public static void main(String[] args) { 
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] array=new int[n];
    for(int i=0;i<n;i++) {
      array[i]=s.nextInt();
    }
    int k=s.nextInt();
    Rotatearray r=new Rotatearray();
    r.rotate(array, k);
  }
}
