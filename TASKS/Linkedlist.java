class Node {
  int data;
  Node next;
  Node(int data) {
    this.data=data;
    this.next=null;
  }
}
public class Linkedlist {
  public static void main(String[] args) {
    Node n1=new Node(10);
    Node n2=new Node(20);
    Node n3=new Node(30);
    n1.next=n2;
    n2.next=n3;
    Node newnode=new Node(5);
    newnode.next=n1;
    n1=newnode;
    Node temp=n1;
    while(temp!=null) {
      System.out.println("Data in Linked list: "+temp.data);
      temp=temp.next;

    }
    
  }
}