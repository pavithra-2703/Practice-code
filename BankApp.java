import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000; // starting balance

        try {
            System.out.print("Enter deposit: ");
            double deposit = sc.nextDouble();
            if (deposit <= 0) throw new Exception("Deposit must be positive!");
            balance += deposit;

            System.out.print("Enter withdrawal: ");
            double withdraw = sc.nextDouble();
            if (withdraw <= 0) throw new Exception("Withdrawal must be positive!");
            if (withdraw > balance) throw new Exception("Insufficient funds!");
            balance -= withdraw;

            System.out.println("Final Balance: " + balance);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}


