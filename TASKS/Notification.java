interface MailMessage {
  public void email(String str);
}
interface InstaMessage {
  public void insta(String str1);
}
interface FBMessage {
  public void Job(String str2);
}
interface JobMessage {
  public void FB(String str3);
}
class Notifications implements MailMessage,InstaMessage,FBMessage,JobMessage {
  public void email(String str) {
    System.out.println("Email: "+str);
  }
  public void insta(String str1) {
    System.out.println("Insta: "+str1);
  }
  public void FB(String str2) {
    System.out.println("FB: "+str2);
  }
  public void Job(String str3) {
    System.out.println("Job: "+str3);
}

}
public class Notification {
  public static void main(String[] args) {
    Notifications n = new Notifications();
    n.email("You have a new email!");
    n.insta("You have a new Instagram message!");
    n.FB("You have a new Facebook notification!");
    n.Job("You have a new job alert!");
  }
}