import java.security.PublicKey;
import java.util.Scanner;
import java.time.*;

public class ReadingUserInputChallenge {
    /**
     * This function will ask for input from the user, and will provide the sum
     * @param args n/a
     */
    public static void main(String[] args)
    {
        int sum = 0;
        int number = 0;
        int totalNumbers;
        boolean valid = true;
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Please enter the total amount of numbers to input ");
            valid = isValid(number);
            sum += number;
        }
        catch (Exception e)
        {
            System.out.println("Characters not allowed! Try again.");
        }

        totalNumbers = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < totalNumbers + 1; i++)
        {
            valid = false;
            System.out.println("Enter number " + i + ":");
            do
            {
                try{
                    number = Integer.parseInt(scanner.nextLine());
                    valid = isValid(number);
                    sum += number;
                }
                catch (Exception e)
                {
                    System.out.println("Characters not allowed! Try again.");
                }

            }
            while(!valid);
        }
        System.out.println("Sum = " + sum);
    }

    /**
     * This will determine whether the number is valid or not
     * @param number is the number that the user input
     * @return true if between the parameters
     */
    public static boolean isValid(int number)
    {
        return (number > 0 && number < Year.now().getValue());
    }
}
