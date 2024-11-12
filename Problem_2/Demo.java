package Problem_2;

public class Demo {

    public static void main(String[] args) {

        System.out.println("Create p1");
        Point p1 = new Point(2,2);
        System.out.println(p1);

        System.out.println("Create p2");
        Point p2 = new Point(3,3);
        System.out.println(p2);

        System.out.println();

        System.out.println("Create mp1");
        MovablePoint mp1 = new MovablePoint(p1.getX(), p1.getY(), 2,2);
        System.out.println(mp1);
        System.out.println("Move mp1");
        mp1.move();
        System.out.println(mp1);
        System.out.println("Create mp2");
        MovablePoint mp2 = new MovablePoint(p2.getX(), p2.getY(), 4,4);
        System.out.println(mp2);
        System.out.println("Move mp2");
        mp2.move();
        System.out.println(mp2);

    }
}
