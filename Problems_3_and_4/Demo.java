package Problems_3_and_4;

public class Demo {

    public static void main(String[] args) {

        //Create Shape objects
        Shape circle = new Circle("Circle",3);
        Shape ellipse = new Ellipse("Ellipse",6,4);
        Shape triangle = new Triangle("Triangle", 3,6,8);
        Shape equilateralTriangle = new EquilateralTriangle("Equilateral Triangle",2);

        //Store shapes in an array
        Scalable[] shapes = {circle,ellipse,triangle,equilateralTriangle};

        System.out.println("Original Shape objects before scaling:");
        //Loop through array and print details for each shape
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        //Scale shapes
        scaleShapes(shapes, 2);

        //Print shapes after scaling
        System.out.println();
        System.out.println("Shapes after scaling by a factor of 2:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}
