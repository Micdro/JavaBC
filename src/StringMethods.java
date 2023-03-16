public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "03/24/1990";
        int startingIndex = birthDate.indexOf("1990");
        System.out.println("Starting index = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(0, 2));
        System.out.println("Day = " + birthDate.substring(3,5));

        String newDate = String.join("/", "03", "24", "1990");
        System.out.println("New date = " + newDate);

        //Inefficient code
        newDate = "24";
        newDate = newDate.concat("/");
        newDate = newDate.concat("03");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1986");
        System.out.println("newDate = " + newDate);

        // Slightly less inefficient
        newDate = "24" + "/" + "12" + "/" + "1991";
        System.out.println("newDate " + newDate);

        //Method chaining
        newDate = "25" .concat("/").concat("11").concat("/").concat("1993");
        System.out.println("NewDate = " + newDate);

        //Replace
        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
