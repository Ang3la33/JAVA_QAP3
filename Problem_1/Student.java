package Problem_1;

public class Student extends Person{

    protected String myIdNum;  // Student Id Number
    protected double myGPA;  // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    //Methods to "Set" and "Get" Instance variables in Student class
    public String getMyIdNum() {
        return myIdNum;
    }

    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public double getMyGPA() {
        return myGPA;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }
}
