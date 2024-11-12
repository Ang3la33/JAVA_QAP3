package Problems_3_and_4;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side); //All sides are equal in equilateral triangle
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void scale(double factor) {
        super.scale(factor);
    }
}
