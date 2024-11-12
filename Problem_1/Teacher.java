package Problem_1;

public class Teacher extends Person{

    // Instance Variables
    protected String subject;
    protected double salary;

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Methods for "Set" and "Get" instance variables
    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", subject: " + this.subject + ", salary: " + this.salary;
    }
}
