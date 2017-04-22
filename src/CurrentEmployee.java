/**
 * Created by Connor on 4/21/2017.
 */
public abstract class CurrentEmployee implements Employee {
    private String firstName;
    private String lastName;
    private String employeeID;

    public CurrentEmployee(String firstName, String lastName, String employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName+" "+ this.lastName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public boolean isEmployed() {
        return true;
    }

    public String toString() {
        return "Employee " + getEmployeeID() + ": Name: " + getName() + " Position: " + getTitle() + " Employed: " + isEmployed();
    }

    public abstract int getAnnualEarnings();
    public abstract String getEarningInfo();
    public abstract void giveRaise(int amount);
}
