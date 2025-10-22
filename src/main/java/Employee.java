public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double punchIn;
    private double punchOut;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    private double payRate;
    private int hoursWorked;

    public double getTotalPay(){
        return hoursWorked * payRate;
    }
    public void getRegularHours(){

    }
    public void getOvertimeHours(){

    }

    public void punchIn(double time){

    }

    public void punchOut(double time){

    }
}
