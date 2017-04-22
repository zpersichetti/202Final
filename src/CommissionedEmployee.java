/**
 * Created by Connor on 4/21/2017.
 */
public abstract class CommissionedEmployee extends SalariedEmployee {

    private float percentSales;
    private int commission;

    public CommissionedEmployee(String firstName, String lastName, String employeeID, int annualSalary, float percentSales) {
        super(firstName, lastName, employeeID, annualSalary);
        this.percentSales = percentSales;
    }

    public int updateCommission(int sales) {
        commission = (int) (sales * percentSales);
        return commission;
    }

    public int getAnnualEarnings() {
        return super.getAnnualEarnings() + commission;
    }
}
