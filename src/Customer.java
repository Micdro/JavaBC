public class Customer {
    private String name;
    private int creditLimit;
    private String email;

    public Customer(){
        this("Default", 750, "Default Email");
    }

    public Customer(String name, String email){
        this(name, 700, email);
    }

    public Customer(String name, int creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
