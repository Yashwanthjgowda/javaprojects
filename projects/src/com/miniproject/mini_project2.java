package com.miniproject;
import java.util.Scanner;

public class mini_project2 {
    private static int pin = 1234;
    private static int balance = 500;
    private static int enteredPIN;

    public static void bank() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your PIN:");
        enteredPIN = scanner.nextInt();

        if (enteredPIN == pin) {
            System.out.println("PIN correct");
            while (true) {
                System.out.println("Choose an option:");
                System.out.println("1. DEPOSIT");
                System.out.println("2. WITHDRAWAL");
                System.out.println("3. CHECK BALANCE");
                System.out.println("4. EXIT");

                int select = scanner.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("Enter the amount to deposit:");
                        double depositAmount = scanner.nextDouble();
                        deposit(depositAmount);
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdrawal:");
                        double withdrawalAmount = scanner.nextDouble();
                        withdrawal(withdrawalAmount);
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;//helps in coming out of program.
                    default:
                        System.out.println("Invalid choice");
                }
            }
        } else {
            System.out.println("Invalid PIN");
        }
    }

    private static void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of Rs:" + amount + " Successful");
    }

    private static void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of Rs:" + amount + " Successful");
        } else {
            System.out.println("Insufficient amount");
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance is Rs:" + balance);
    }

    public static void main(String[] args) {
        mini_project2.bank();
    }
}
