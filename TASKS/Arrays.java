import java.util.Scanner;
class Arrays { 
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] array=new int[n];
    int[] newarray=new int[n];
      for(int i=0;i<n;i++) {
        array[i]=s.nextInt();
      }
      int k=0;
      for(int i=0;i<n;i++) {
        int mult=1;
        for(int j=0;j<n;j++) {
          if(i!=j) {
            mult=mult*array[j];
          }

        }
        newarray[k++]=mult;
      }
      for(int num:newarray) {
        System.out.print(num+" ");
      }
  }
}
