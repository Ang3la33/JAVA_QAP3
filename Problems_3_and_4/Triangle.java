package Problems_3_and_4;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        //Check if sides can form a valid triangle
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        else {
            System.out.println("Error: The provided sides do not form a valid triangle.");
            System.exit(1); // Terminate program if sides are invalid
        }
    }

    @Override
    public double getPerimeter() {
       return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}
