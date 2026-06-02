
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        int password = 1234;
        int choice;

        System.out.println("===== WELCOME TO ATM =====");

        System.out.print("Enter ATM Password: ");
        int enteredPassword = sc.nextInt();

        if (enteredPassword != password) {
            System.out.println("Incorrect Password!");
            return;
        }

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change Password");
            System.out.println("5. Reset Password");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Available Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ₹");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("₹" + deposit + " Deposited Successfully.");
                    } else {
                        System.out.println("Invalid Amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("₹" + withdraw + " Withdrawn Successfully.");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Current Password: ");
                    int currentPassword = sc.nextInt();

                    if (currentPassword == password) {
                        System.out.print("Enter New Password: ");
                        password = sc.nextInt();
                        System.out.println("Password Changed Successfully.");
                    } else {
                        System.out.println("Wrong Current Password!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Security PIN (9999): ");
                    int pin = sc.nextInt();

                    if (pin == 9999) {
                        System.out.print("Create New Password: ");
                        password = sc.nextInt();
                        System.out.println("Password Reset Successfully.");
                    } else {
                        System.out.println("Invalid Security PIN!");
                    }
                    break;

                case 6:
                    System.out.println("Thank You For Using ATM.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}