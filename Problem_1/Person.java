package Problem_1;

public class Person {

    protected String myName;
    protected int myAge;
    protected String myGender;   // "M" or "F"

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }

    //Methods to "Set" and "Get" Instance variables in Person class
    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }
}
