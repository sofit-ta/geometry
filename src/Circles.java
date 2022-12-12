import java.lang.Math;

public class Circles {
    private float r;
    private double Perimeter;
    private double Square;
    public Circles(float r) {
        this.r = r;
        if (r == 0) {
            throw new RuntimeException("There is no circle with such parameters.");
        }
        this.Perimeter = 2 * r * Math.PI;
        this.Square = Math.pow(r,2) * Math.PI;
    }
    public double getSquare() {
        return Square;
    }

    public double getPerimeter() {
        return Perimeter;
    }
}
