import java.time.LocalDate;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public static void main(String[] args) {
        Employee michael = new Employee("Michael", "03/22/1989",  "01/01/2021");
        System.out.println(michael);
        System.out.println("Age = " + michael.getAge());
        System.out.println("Pay = " + michael.collectPay());

        Employee alice = new Employee("Alice", "04/23/2020", "01/01/2022");
        System.out.println(alice);
        SalariedEmployee alexis = new SalariedEmployee("Alexis", "04/20/1989", 10023,
                "06/31/2019", 90000, false);
        System.out.println("Alexis's paycheck = $" + alexis.collectPay());
        alexis.retire();
        System.out.println("Alexis's pension check = $" + alexis.collectPay());
        HourlyEmployee amelia = new HourlyEmployee("Amelia", "04/23/2021", 1232231, "03/10/2023", 15);
        System.out.println("Amelia's paycheck = $" + amelia.collectPay());
        System.out.println("Amelia's double pay = $" + amelia.getDoublePay());
    }
    public int getAge(){
        int currentYear =  LocalDate.now().getYear();
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear - birthYear);
    }
    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
    this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    private static int employeeNumber = 1;
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNumber++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate,  hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay(){
        double paycheck = annualSalary/26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;

        return (int)adjustedPay;
    }

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
    }
}

class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
        return hourlyPayRate * 40;
    }
    public double getDoublePay(){
        return collectPay() * 2;
    }
}
