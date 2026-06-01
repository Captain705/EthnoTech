import java.util.*;
public class Arraylist {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    ArrayList<String> songs=new ArrayList<>();
    String song1=s.nextLine();
    String song2=s.nextLine();
    String song3=s.nextLine();
    songs.add(song1);
    songs.add(song2);
    songs.add(song3);
    for(String song:songs) {
      System.out.println(song);
    }
    songs.remove(song1);
    System.out.println("After removing song1:");
    for(String song:songs) {
      System.out.println(song);
    }
    songs.contains(song3);
    System.out.println("Does the list contain song3? "+songs.contains(song3));

  }
}
