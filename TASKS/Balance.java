class Balance {
    private int balance;
    public void setbalance(int balance) {
        this.balance=balance;
    }
    public int getbalance() {
        return balance;
    }
    public static void main(String[] args) {
        Balance obj=new Balance();
        obj.setbalance(45000);
        System.out.println(obj.getbalance());
    }
}