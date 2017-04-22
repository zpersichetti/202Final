/**
 * Created by Connor on 4/21/2017.
 */
public abstract class HourlyEmployee extends CurrentEmployee {
    private int hourlyWage;
    private int hoursPerWeek;

    public HourlyEmployee(String firstName, String lastName, String employeeID, int hourlyWage) {
        super(firstName, lastName, employeeID);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = 40;
    }

    public int getHourlyWage() {
        return this.hourlyWage;
    }

    public int getHoursPerWeek() {
        return this.hoursPerWeek;
    }
    public int getAnnualEarnings() {
        return this.hourlyWage * this.hoursPerWeek * 52;
    }

    public String getEarningInfo() {
        return String.format("Hourly employee earning $%d per hour, and %d hours per week. Average annual earnings of $%d.",
                    getHourlyWage(), getHoursPerWeek(), getAnnualEarnings());
    }

    public void giveRaise(int amount) {
        hourlyWage += amount;
    }
}
