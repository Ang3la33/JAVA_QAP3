package Problems_3_and_4;

public class Ellipse extends Shape {

    private double a;  //Major axis
    private double b;  //Minor axis

    public Ellipse(String name, double a, double b) {
        super(name);
        this.a = Math.max(a, b); //Ensure a is the major axis
        this.b = Math.min(a, b); //Ensure b is the minor axis
    }

    @Override
    public double getPerimeter() {
        // If it's a circle, use the circle perimeter formula
        if (a == b) {
            return 2 * Math.PI * a;
        }
        else { // Else use the ellipse perimeter formula
            return Math.PI * 2 * (Math.pow(a, 2) + Math.pow(b, 2)) - (Math.pow(a - b, 2) / 2);
        }
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}
