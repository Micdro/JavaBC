public class BankAccount {
    private int accountNumber = 0;
    private double accountBalance = 0;
    private String customerName = "";
    private String customerEmail = "";
    private int phoneNUmber = 0;

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

    public int getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(int phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
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
