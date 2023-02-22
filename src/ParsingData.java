import java.util.Scanner;

public class ParsingData {

    public static void main(String[] args)
    {
        int currentYear = 2023;
        try{
            System.out.println(getInputFromConsole(currentYear));
        }
        catch (Exception e)
        {
            System.out.println(getInputFromScanner(currentYear));
        }
//        String usersDOB = "1999";
//        System.out.println("Age = " + ((Integer.parseInt(currentYear) - Integer.parseInt(usersDOB))));
//
//        String userAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
//        System.out.println("The user says he's " + ageWithPartialYear);
    }

    public static String getInputFromConsole(int currentYear)
    {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = Integer.parseInt(dateOfBirth);
        return "You are " + age;
    }

    public static String getInputFromScanner(int currentYear)
    {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        //String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

        boolean validDOB = false;
//        String dateOfBirth = System.console().readLine("What year were you born? ");
        do {

            System.out.println("What year were you born? ");
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            }
            catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed! Try again.");
            }
        }
        while (!validDOB);
        return "You are " + age;
    }

    public static int checkData(int currentYear, String dateOfBirth)
    {
        int dob = Integer.parseInt(dateOfBirth);
        int minYear = currentYear - 125;

        if (dob < minYear || dob > currentYear)
        {
            return -1;
        }
        return (currentYear - dob);
    }
}