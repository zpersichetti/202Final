/**
 * Created by Connor on 4/21/2017.
 */
public class SalesEmployee extends CommissionedEmployee {
    public SalesEmployee(String firstName, String lastName, String employeeID, int annualSalary) {
        super(firstName, lastName, employeeID, annualSalary, 0.3f);
    }

    public String getTitle() {
        return "Sales Associate";
    }
}
