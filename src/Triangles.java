import java.lang.Math;

public class Triangles {
    private float a;
    private float b;
    private float c;
    private double Perimeter;
    private double Square;


    public Triangles(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if ((a == 0) || (b == 0) || (c == 0)) {
            throw new RuntimeException("There is no triangle with such parameters.");
        } else if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new RuntimeException("There is no triangle with such parameters.");
        }
        this.Perimeter = a + b + c;
        double halfperimeter = Perimeter / 2;
        this.Square = Math.sqrt(halfperimeter * (halfperimeter - a) * (halfperimeter - b) * (halfperimeter - c));

    }

    public double getSquare() {
        return Square;
    }

    public double getPerimeter() {
        return Perimeter;
    }
}
