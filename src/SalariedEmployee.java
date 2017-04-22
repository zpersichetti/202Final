/**
 * Created by Connor on 4/21/2017.
 */
public abstract class SalariedEmployee extends CurrentEmployee {

    private int annualSalary;

    public SalariedEmployee(String firstName, String lastName, String employeeID, int salary) {
        super(firstName, lastName, employeeID);
        annualSalary = salary;
    }
    public int getAnnualEarnings() {
        return annualSalary;
    }

    public String getEarningInfo() {
        return String.format("Salaried employee earning $%d per year", annualSalary);
    }

    public void giveRaise(int amount) {
        annualSalary += amount;
    }
}
