package Problems_3_and_4;

public class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void scale(double factor) {
        radius *= factor;
    }

}
