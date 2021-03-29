package ee.bcs.java.demo.tasks.lesson1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lesson4 {
    private static double amount;
    private static ArrayList<Account> accountList = new ArrayList<>();
    private static Account selectedAccount;
    private static Account ToAccount;
    private static boolean flag = false;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Bank:");
        System.out.println("1) createAccount");
        System.out.println("2) getBalance");
        System.out.println("3) depositMoney");
        System.out.println("4) withdrawMoney");
        System.out.println("5) transfer");
        System.out.println("6) selectAccount");
        System.out.println("7) deleteAccount");
        System.out.println("8) exit");
        Account account = null;
        String myname = "Not selected account, select";
        while (true){
            boolean Toflag = false;
            System.out.print(myname +": "); // indicator for user input
            String choice = input.next();
            // Options
            switch (choice) {
                case "createAccount":{
                    // Create new account
                    int accNo = 0;
                    int bal = 0;
                    String iban = "";
                    String name = "";
                    System.out.println("Enter new account number : ");
                    accNo = input.nextInt();
                    System.out.println("Enter new account name : ");
                    name = input.next();
                    System.out.println("Enter new IBAN: ");
                    iban = input.next();
                    System.out.println("Enter initial balance: € ");
                    bal = input.nextInt();
                    System.out.println("Created account: " + accNo + ", Name: " + name + ", IBAN: " + iban +
                            ", Balance: " + bal+ " €");
                    account = new Account(bal, accNo, name, iban);
                    accountList.add(account);
                    break;}
                case "getBalance":{
                    // check balance in selected account
                    if (flag) {
                        System.out.println("Your current account balance : "
                                + selectedAccount.getBalance());
                    } else {
                        System.out.println("Please select account number.");
                    }
                    break;
                }
                case "depositMoney": {
                    // Deposit amount
                    if(flag) {
                        System.out.println("Enter amount to deposit :  ");
                        amount = scan.nextDouble();
                        if (amount <= 0) {
                            System.out
                                    .println("You must deposit an amount greater than 0.");
                        } else {
                            if (flag) {
                                selectedAccount.deposit(amount);
                                System.out.println("You have deposited " + amount
                                        + ". Total balance : "
                                        + (selectedAccount.getBalance()));
                            } else {
                                System.out.println("Please select account number.");
                            }
                        }
                        break;
                    }
                    else{
                        System.out.println("Please select account number.");
                    }
                    break;
                }
                case "withdrawMoney": {
                    // Withdraw amount
                    if (flag) {
                        System.out.println("Enter amount to be withdrawn: ");
                        amount = scan.nextDouble();
                        if (amount > account.getBalance() && amount <= 0) {
                            System.out.println("You can't withdraw that amount!");
                        } else if (amount <= selectedAccount.getBalance()) {
                            if (flag) {
                                selectedAccount.withdraw(amount);
                                System.out.println("You have withdraw : " + amount
                                        + " NewBalance : "
                                        + selectedAccount.getBalance());
                            } else {
                                System.out.println("Please select account number.");
                            }
                        }
                    }
                    else{
                        System.out.println("Please select account number.");
                    }
                    break;
                }
                case "transfer": {
                    // transfer amount
                    if (flag) {
                        System.out.println("Enter amount to be transfer: ");
                        amount = scan.nextDouble();
                        if (amount > account.getBalance() && amount <= 0) {
                            System.out.println("You can't transfer that amount!");
                            break;
                        } else if (amount <= selectedAccount.getBalance()) {
                            if (flag) {
                                System.out.println("Enter to account number: ");
                                int toAcc = scan.nextInt();
                                for (Object object : accountList) {
                                    ToAccount = (Account) object;
                                    if (ToAccount.getAccNumber() == toAcc) {
                                        Toflag = true;
                                        String toname = ToAccount.getName();
                                        selectedAccount.withdraw(amount);
                                        ToAccount.transfer(amount);
                                        System.out.println("Transfering to "+ ToAccount.getName()+" " + amount + " €. Done!"  );
                                        break;
                                    }
                                }
                                if (!Toflag) {
                                    System.out.println("No found to account.");

                                }
                            }
                        } else {
                            System.out.println("Please select account number.");
                            break;
                        }
                    }
                    else {
                        System.out.println("Please select account number.");
                        break;
                    }
                    break;
                }
                case "selectAccount": {
                    // select account
                    System.out.println("Enter to select account number: ");
                    int selectedAcc = scan.nextInt();
                    System.out.println("Selected account : " + selectedAcc);
                    for (Object object : accountList) {
                        selectedAccount = (Account) object;
                        if (selectedAccount.getAccNumber() == selectedAcc) {
                            myname = selectedAccount.getName();
                            flag = true;
                            break;
                        }
                        else {
                            flag = false;
                        }
                    }
                    if (!flag) {
                        System.out.println("Account doesn't exists.");
                    }
                    if (accountList.size() == 0) {
                        System.out.println("Zero account exists.");
                    }
                    break;
                }
                case "deleteAccount": {
                    // close account
                    System.out
                            .println("Enter to select account number: : ");
                    int selectedAcc1 = scan.nextInt();
                    System.out.println("Selected account : " + selectedAcc1);
                    Iterator<Account> iterator = accountList.iterator();
                    while (iterator.hasNext()) {
                        selectedAccount = (Account) iterator.next();
                        if (selectedAccount.getAccNumber() == selectedAcc1) {
                            iterator.remove();
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("Account doesn't exists.");
                        break;
                    }
                    System.out.println("Account " + selectedAcc1 + " deleted.");
                    break;
                }
                case "exit": {
                    // quit
                    System.out.println("Thank You. Visit Again!");
                    flag = false;
                    input.close();
                    scan.close();
                    System.exit(0);
                    break;
                }
            }
        }
    }
}

            // TODO 1
            // Add command: "createAccount ${accountNr}"
            // this has to store accountNr with 0 balance
            // TODO 2
            // Add command: "getBalance ${accountNr}"
            // this has to display account balance of specific acount
            // TODO 3
            // Add command: "depositMoney ${accountNr} ${amount}
            // this has to add specified amount of money to account
            // You have to check that amount is positive number
            // TODO 4
            // Add command: "withdrawMoney ${accountNr} ${amount}
            // This has to remove specified amount of money from account
            // You have to check that amount is positive number
            // You may not allow this transaction if account balance would become negative
            // TODO 5
            // Add command: "transfer ${fromAccount} ${toAccount} ${amount}
            // This has to remove specified amount from fromAccount and add it to toAccount
            // Your application needs to check that toAccount is positive
            // And from account has enough money to do that transaction