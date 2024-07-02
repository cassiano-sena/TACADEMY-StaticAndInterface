//5. Crie uma classe BankAccount com atributos accountNumber, accountHolder e
//balance. Crie uma classe Bank com uma lista estática de contas bancárias e
//métodos estáticos para abrir uma conta, fechar uma conta, depositar, sacar e
//transferir dinheiro entre contas.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Methods for deposit and withdraw
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

class Bank {
    private static List<BankAccount> accounts = new ArrayList<>();
    private static int nextAccountNumber = 1;

    public static BankAccount createAccount(String accountHolder, double initialBalance) {
        BankAccount newAccount = new BankAccount(nextAccountNumber++, accountHolder, initialBalance);
        accounts.add(newAccount);
        System.out.println("Account created successfully! Account Number: " + newAccount.getAccountNumber());
        return newAccount;
    }

    public static void closeAccount(int accountNumber) {
        Iterator<BankAccount> iterator = accounts.iterator();
        while (iterator.hasNext()) {
            BankAccount account = iterator.next();
            if (account.getAccountNumber() == accountNumber) {
                iterator.remove();
                System.out.println("Account closed successfully! Account Number: " + accountNumber);
                return;
            }
        }
        System.out.println("Account not found: " + accountNumber);
    }

    public static void deposit(int accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    public static void withdraw(int accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    public static void transfer(int fromAccountNumber, int toAccountNumber, double amount) {
        BankAccount fromAccount = findAccount(fromAccountNumber);
        BankAccount toAccount = findAccount(toAccountNumber);
        if (fromAccount != null && toAccount != null) {
            if (fromAccount.getBalance() >= amount) {
                fromAccount.withdraw(amount);
                toAccount.deposit(amount);
                System.out.println("Transfer of " + amount + " from " + fromAccountNumber + " to " + toAccountNumber + " completed successfully.");
            } else {
                System.out.println("Insufficient balance for transfer.");
            }
        } else {
            System.out.println("Account(s) not found.");
        }
    }

    private static BankAccount findAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public static void listAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            for (BankAccount account : accounts) {
                System.out.println("Account No: " + account.getAccountNumber() + ", Holder: " + account.getAccountHolder() + ", Balance: " + account.getBalance());
            }
        }
    }
}
