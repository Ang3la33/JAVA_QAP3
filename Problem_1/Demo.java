package Problem_1;

public class Demo {

    public static void main(String[] args) {

        Person bob = new Person("Coach Bob",27,"M");
        System.out.println(bob);

        Person tom = new Person("Major Tom",57,"M");
        System.out.println(tom);

        Student lynne = new Student("Lynne Brooke",16,"F","HS95129",3.5);
        System.out.println(lynne);

        Student bart = new Student("Bart Simpson", 15,"M","S9177711",2.0);
        System.out.println(bart);

        Teacher mrJava = new Teacher("Duke Java",34,"M","Computer Science",50000);
        System.out.println(mrJava);

        Teacher msFrizzle = new Teacher("Ms Frizzle",40,"F","Biology",60000);
        System.out.println(msFrizzle);

        CollegeStudent ima = new CollegeStudent("Ima Frosh",18,"F","UCB123",4.0,"English",1);
        System.out.println(ima);

        CollegeStudent gaga = new CollegeStudent("Lady Gaga",38,"F","GAGA129922", 4.0,"Music",4);
        System.out.println(gaga);
    }
}
