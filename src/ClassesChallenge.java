import java.util.Random;
import java.util.Scanner;

/**
 * This class displays and runs the menu for the BankAccount class. It creates an account for a user,
 * and lets them interact with their new bank account.
 */
public class ClassesChallenge {
    public static void main(String[] args){
        boolean inMenu = true;
        Scanner scanner = new Scanner(System.in);
        BankAccount personalAccount = new BankAccount();
        int accountNumber = new Random().nextInt(90000) + 10000;
        personalAccount.setAccountNumber(accountNumber);
        double amount;
        int option;
        System.out.println("Please Enter your name");
        personalAccount.setCustomerName(scanner.nextLine());
        System.out.println("\nGreat!, nice to meet you " + personalAccount.getCustomerName() +
                " next, can you enter your email?: ");
        personalAccount.setCustomerEmail(scanner.nextLine());
        System.out.println("Finally, please enter your phone number");
        personalAccount.setPhoneNUmber((scanner.nextLine()));
        while (inMenu){

            System.out.println("Please select a menu option\n 1: Account Balance \t 2: Deposit funds \n 3: Withdraw Funds \t\t 4: Account info \n 5: Exit");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1 -> System.out.println("Account balance = $" + personalAccount.getAccountBalance());
                case 2 -> {
                    System.out.println("Please enter an amount to deposit: ");
                    amount = Double.parseDouble(scanner.nextLine());
                    personalAccount.depositFunds(amount);
                    System.out.println("New Account balance = $" + personalAccount.getAccountBalance());
                }

                case 3 -> {
                    System.out.println("Please select an amount to withdraw");
                    amount = Double.parseDouble(scanner.nextLine());
                    personalAccount.withdrawFunds(amount);
                    System.out.println("New Account balance = $" + personalAccount.getAccountBalance());
            }
                case 4 ->{
                System.out.println("Accound number " + personalAccount.getAccountNumber());
                System.out.println("Account Holders name: " + personalAccount.getCustomerName());
                System.out.println("Account holders phone number: " + personalAccount.getPhoneNUmber());
                System.out.println("Account holders email: " + personalAccount.getCustomerEmail());
            }
                case 5 ->{
                    System.out.println("Have a great day!");
                    inMenu = false;
                }
                default ->
                    System.out.println("Invalid selection");
            }
            System.out.println("\n");
        }
    }
}
