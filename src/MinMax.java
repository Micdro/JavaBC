import java.util.Scanner;

public class MinMax {
    /**
     * This will loop and prompt the user for a number. As long as the
     * input is a number it will be compared to min/max values. Once a
     * non number is input, the program will exit.
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double min = Double.MAX_VALUE;
        double max = 0;
        double number = 0;
        boolean isNumber = true;
        do {
            try {
                System.out.println("Enter a number: ");
                number = Double.parseDouble(scanner.nextLine());
                if (number < min) min = number;
                if (number > max) max = number;
            } catch (NumberFormatException nfe) {
                isNumber = false;
            }

        }
        while (isNumber);
        System.out.println("The min number is " + min + ", and the max number is " + max);
    }
}
