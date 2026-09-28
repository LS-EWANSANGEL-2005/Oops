package oops;

public class BankAccount {

    String name;
    long accno;
    double balance;

    // Constructor
    BankAccount(String name, long accno, double balance) {
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }

    // Setter methods
    void setName(String name) {
        this.name = name;
    }

    void setAccno(long accno) {
        this.accno = accno;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter methods
    String getName() {
        return name;
    }

    long getAccno() {
        return accno;
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount n = new BankAccount("Angel", 712523205, 20000.0);

        
        System.out.println("Username: " + n.getName());
        System.out.println("Account Number: " + n.getAccno());
        System.out.println("Balance: " + n.getBalance());

        
        n.setName("Princy");
        n.setBalance(25000.0);

        System.out.println("\nAfter changing:");
        System.out.println("Username: " + n.getName());
        System.out.println("Balance: " + n.getBalance());
    }
}