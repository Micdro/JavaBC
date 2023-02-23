public class BankAccount {
    private int accountNumber = 0;
    private double acountBalance = 0;
    private String customerName = "";
    private String customerEmail = "";
    private int phoneNUmber = 0;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAcountBalance() {
        return acountBalance;
    }

    public void setAcountBalance(double acountBalance) {
        this.acountBalance = acountBalance;
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

    }

    public void withdrawFunds(double amount){

    }

}
