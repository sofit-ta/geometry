
public class Rectangles {
    private float a;
    private float b;
    private double Perimeter;
    private double Square;

    public Rectangles(float a, float b) {
        this.a = a;
        this.b = b;
        if ((a == 0) || (b == 0)) {
            throw new RuntimeException("There is no rectangle with such parameters.");
        }
        this.Perimeter = a*2 + b*2;
        this.Square = a*b;
    }
    public double getSquare() {
        return Square;
    }

    public double getPerimeter() {
        return Perimeter;
    }
}
