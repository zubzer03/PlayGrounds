package JavaOPP.studentManagement;

import java.util.Date;

public class Staff extends Person{

    
    private double salary;
    private String department;
    
    public Staff(String id, String firstName, String lastName, Date birthDate, String email, String phoneNumber,
            double salary, String department) {
        super(id, firstName, lastName, birthDate, email, phoneNumber);
        this.salary = salary;
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void print(){
        super.print();
        System.out.println("Total Salary "+ String.format("%.2f",this.getSalary()));
        System.out.println("From Department "+this.getDepartment());
    }


    
}
