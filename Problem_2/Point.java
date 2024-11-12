package Problem_2;

public class Point {

    //Instance Variables
    private float x;
    private float y;

    //Constructors
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Getters and Setters
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        return new float[] {x, y};
    }

    //toString() method
    public String toString() {
        return "Point = (" + this.x + ", " + this.y + ")";
    }
}
