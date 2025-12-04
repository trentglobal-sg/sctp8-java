public class Employee {
    private String firstName;
    private String lastName;
    private int daysEmployed;
    private double salary;
    private int annualLeaveLeft;

    // Default Constructor
    public Employee() {
        // usually the default constructor
        // is meant for setting default values
        firstName="N/A";
        lastName="N/A";
        daysEmployed = 0;
        salary = 0;
        annualLeaveLeft = 14;
        // return this
    }

    // overloaded constructors
    public Employee(String firstName, String lastName, 
        int daysEmployed, double salary, int annualLeaveLeft ) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
            this.annualLeaveLeft = annualLeaveLeft;
        }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDaysEmployed() {
        return daysEmployed;
    }

    public void setDaysEmployed(int daysEmployed) {
        this.daysEmployed = daysEmployed;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAnnualLeaveLeft() {
        return annualLeaveLeft;
    }

    public void setAnnualLeaveLeft(int left) {
        annualLeaveLeft = left;
    }
}