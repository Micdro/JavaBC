import java.util.Scanner;

public class ClassesChallenge {
    public static void main(String[] args){
        boolean inMenu = true;
        Scanner scanner = new Scanner(System.in);
        BankAccount personalAccount = new BankAccount();
        double amount;
        int option;
        while (inMenu){

            System.out.println("Please select a menu option\n 1: Account Balance \t 2: Deposit funds \n 3: Withdraw Funds \t\t 4: Exit");
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
