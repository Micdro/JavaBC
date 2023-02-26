public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public BankAccount() {
        this(56789, 2.50, "Default name", "default Email", "default phone");
        System.out.println("Empty Constructor called\n");

    }

    public BankAccount(int number, double balance, String customerName, String customerEmail,
                       String phoneNumber) {
        System.out.println("Account constructor with parameters called\n");
        this.accountNumber = number;
        this.accountBalance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String phoneNumber) {
        this(59523, 100.55, customerName, customerEmail, phoneNumber);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNUmber() {
        return phoneNumber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNumber = phoneNUmber;
    }

    public void depositFunds(double amount) {
        this.accountBalance = this.accountBalance + amount;
    }

    public void withdrawFunds(double amount){
    if (this.accountBalance - amount < 0)
    {
        System.out.println("Not enough Money in account");
    }
    else {
        this.accountBalance = this.accountBalance - amount;
    }
    }

}
