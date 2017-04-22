/**
 * Created by Connor on 4/21/2017.
 */
public class PastEmployee implements Employee {

    private String firstName;
    private String lastName;
    private String employeeID;
    private String position;

    public PastEmployee(String firstName, String lastName, String employeeID, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.position = title;
    }

    public String toString() {
        return "Employee " + getEmployeeID() + ": Name: " + getName() + " Position: " + getTitle() + " Employed: " + isEmployed();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + " "+this.lastName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public boolean isEmployed() {
        return false;
    }

    public String getTitle() {
        return position;
    }
}
