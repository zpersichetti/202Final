/**
 * Created by Connor on 4/21/2017.
 */
public class Manager extends SalariedEmployee {
    public Manager(String firstName, String lastName, String employeeID, int annualSalary) {
        super(firstName, lastName, employeeID, annualSalary);
    }

    public String getTitle() {
        return "Manager";
    }
}
