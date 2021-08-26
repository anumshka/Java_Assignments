public class Account {

    String name;
    int balance;

    Account()
    {
        balance=1000;
    }
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount)
    {
        balance=balance-amount;
    }

}
