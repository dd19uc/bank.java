package pkgone;

public class Acc2 {
    private int accountNo;
    private String name;
    private float amount;

    public void insert(int a, String n, float amt) {
        this.accountNo = a;
        this.name = n;
        this.amount = amt;
    }

    public void deposit(float amt) {
        this.amount = this.amount + amt;
        System.out.println(amt + " deposited successfully ");
    }

    public void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("not enough Balance");
        } else {
            this.amount = this.amount - amt;
            System.out.println(amt + " withdrawn ");
        }
    }

    public void checkBalance() {
        System.out.println("Balance is: " + this.amount);
    }

    @Override
    public String toString() {
        return "acc {" + " accountNo = " + accountNo + ", name = " + name + ", amount = " + amount + '}';
    }
}