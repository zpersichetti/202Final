/**
 * Created by Connor on 4/21/2017.
 */
public class Accountant extends HourlyEmployee {
    public Accountant(String firstName, String lastName, String employeeID, int hourlyWage) {
        super(firstName, lastName, employeeID, hourlyWage);
    }

    public String getTitle() {
        return "Accountant";
    }
}
