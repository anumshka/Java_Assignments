public class Account {

//    Attributes:
//    1. balance
//    2. name

    int balance;
    String name;

    //Constructor to initialise balance as 1000
    Account() {
        balance = 1000;
    }

    //getter and setter methods:
    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Method to withdraw a particular amount
    public void withdraw(int amount) {
        balance = balance - amount;
    }

}
