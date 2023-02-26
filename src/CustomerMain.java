public class CustomerMain {
    public static void main(String[] args)
    {
        Customer michael = new Customer("Michael", 850, "maol@yahoo.com");
        System.out.println(michael.getName() + "\n" + michael.getCreditLimit() + "\n" + michael.getEmail());

        Customer alice = new Customer();
        System.out.println(alice.getName() + "\n" + alice.getCreditLimit() + "\n" + alice.getEmail());

        Customer amelia = new Customer("Amelia", "amelia@aol.com");
        System.out.println(amelia.getName() + "\n" + amelia.getCreditLimit() + "\n" + amelia.getEmail());
    }
}

