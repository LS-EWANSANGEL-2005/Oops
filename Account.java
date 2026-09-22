package oops;

public class Account {

    String name;
    long AccNo;
    double balance;

    Account(String name, long AccNo, double balance) {
        this.name = name;
        this.AccNo = AccNo;
        this.balance = balance;
    }

    public static void main(String[] args) {

        Account n = new Account("Angel", 712523205022L, 1000000.0);

        System.out.println("UserName: " + n.name);
        System.out.println("AccNo: " + n.AccNo);
        System.out.println("Balance: " + n.balance);
    }
}