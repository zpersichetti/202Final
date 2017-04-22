import java.util.ArrayList;
import java.util.Scanner;
/**
 Name(s): Connor Accorsi and Zach Persichetti
 Due Date: 4/22/2017
 ITI 202-02 Object Oriented Programming
 Team Assignment 3
 Description: Employee interface interacts with different positions in company.
 */
/**
 * Created by Connor on 4/21/2017.
 */
public class Company {

    public static void main(String[] args) {
        int nextID = 1;
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.print("\n\t1) Hire employee\n\t2) Fire employee\n\t3) Give employee raise\n\t4) Get employee information\n\t5) list active employees\n\t6) list all employees\n\t7) exit\nEnter a number selection from above: ");
            if (!myScanner.hasNextInt()) {
                System.out.println("Invalid input");
                myScanner.next();
                continue;
            }

            int value = myScanner.nextInt();

            switch (value) {
                case 1:
                    System.out.print("First name: ");
                    String firstName = myScanner.next();
                    System.out.print("Last name: ");
                    String lastName = myScanner.next();
                    System.out.print("\n\t1) Sales Employee\n\t2) Accountant\n\t3) Manager\nEnter employee type: ");
                    int type = myScanner.nextInt();
                    CurrentEmployee employee;
                    if (type == 1) {
                        System.out.print("Enter annual salary: ");
                        employee = new SalesEmployee(firstName, lastName, "EMPS" + nextID++, myScanner.nextInt());
                    } else if (type == 2) {
                        System.out.print("Enter hourly wages: ");
                        employee = new Accountant(firstName, lastName, "EMPA" + nextID++, myScanner.nextInt());
                    } else {
                        System.out.print("Enter annual salary: ");
                        employee = new Manager(firstName, lastName, "EMPM" + nextID++, myScanner.nextInt());
                    }
                    employees.add(employee);
                    System.out.println("Added " + employee.toString());
                    break;
                case 2:
                    System.out.print("Enter employee ID of employee to fire: ");
                    String id = myScanner.next();
                    Employee e = findEmployee(id, employees);
                    if (e == null) {
                        System.out.println("Could not find employee");
                        break;
                    }
                    employees.remove(e);
                    employees.add(new PastEmployee(e.getFirstName(), e.getLastName(), e.getEmployeeID(), e.getTitle()));
                    System.out.println("Removed employee: " + e.getName());
                    break;
                case 3:
                    System.out.print("Enter employee ID of employee to give raise to: ");
                    id = myScanner.next();
                    e = findEmployee(id, employees);
                    if (e == null) {
                        System.out.println("Could not find employee");
                        break;
                    }

                    if (e instanceof SalariedEmployee) {
                        employee = (SalariedEmployee) e;
                        System.out.print("Enter amount to raise annual salary by: ");
                        int amount = myScanner.nextInt();
                        employee.giveRaise(amount);
                    } else if (e instanceof HourlyEmployee) {
                        employee = (HourlyEmployee) e;
                        System.out.print("Enter amount to raise hourly salary by: ");
                        int amount = myScanner.nextInt();
                        employee.giveRaise(amount);
                    } else if (e instanceof PastEmployee) {
                        System.out.println("Employee no longer works for company");
                        break;
                    } else {
                        break;
                    }

                    System.out.println("New salary: " + employee.getEarningInfo());
                    break;
                case 4:
                    System.out.print("Enter employee ID of employee: ");
                    id = myScanner.next();
                    e = findEmployee(id, employees);
                    if (e == null) {
                        System.out.println("Could not find employee");
                        break;
                    }

                    System.out.println(e.toString());
                    if (e instanceof CurrentEmployee) {
                        employee = (CurrentEmployee) e;
                        System.out.println(employee.getEarningInfo());
                    }
                    break;
                case 5:
                    for (Employee employee1 : employees) {
                        if (employee1.isEmployed()) {
                            System.out.println(employee1.toString());
                        }
                    }
                    break;
                case 6:
                    for (Employee employee1 : employees) {
                        System.out.println(employee1.toString());
                    }
                    break;
                case 7:
                    running = false;
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }

    public static Employee findEmployee(String id, ArrayList<Employee> employees) {
        for (Employee e : employees) {
            if (e.getEmployeeID().equalsIgnoreCase(id)) {
                return e;
            }
        }
        return null;
    }
}
