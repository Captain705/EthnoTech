public class GETSET {
    private int id;
    public void setid(int id) {
        this.id=id;
    }
    public int getid() {
        return id;
    }
    public static void main(String[] args) {
        GETSET obj=new GETSET();
        obj.setid(45);
        System.out.println(obj.getid());
    }
  
}
