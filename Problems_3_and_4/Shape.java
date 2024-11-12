package Problems_3_and_4;

public abstract class Shape implements Scalable {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }

}