package Problem_2;

public class MovablePoint extends Point{

    //Instance Variables
    private float xSpeed;
    private float ySpeed;

    //Constructors
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    //Getters and Setters
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    //toString() method
    @Override
    public String toString() {
        return super.toString() + ", Speed = (" + this.xSpeed + ", " + this.ySpeed + ")";
    }

    //move() method
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
