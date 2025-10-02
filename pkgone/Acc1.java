package pkgone;

public class Acc1 {
    public static void main(String args[]) {
        Acc2 a = new Acc2();
        a.insert(4, "Jhon", 5400000.0f);
        a.deposit(1000000.0f);
        a.withdraw(1500000.0f);
        a.checkBalance();
        System.out.println("the account details : " + a.toString());

        Acc2 a2 = new Acc2();
        a2.insert(5, "diana", 1000000.0f);
        a2.deposit(500000.0f);
        a2.withdraw(600000.0f);
        a2.checkBalance();
        System.out.println("the account details : " + a2.toString());
    }
}
