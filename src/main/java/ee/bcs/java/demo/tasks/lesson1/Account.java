package ee.bcs.java.demo.tasks.lesson1;

public class Account {
    private int accNumber;
    private double balance;
    private String iban;
    private String name;

    public Account(double initialBalance, int accNo, String newName, String newIban) {
        balance = initialBalance;
        accNumber = accNo;
        name = newName;
        iban = newIban;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return amount;
    }

    public double transfer(double amount) {
        balance += amount;
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }
}