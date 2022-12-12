import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat( "#.##" );
        float side1 = 0;
        float side2 = 0;
        float side3 = 0;
        System.out.println("Треугольник");
        System.out.println("1 сторона:");
        side1= scanner.nextFloat();
        System.out.println("2 сторона:");
        side2= scanner.nextFloat();
        System.out.println("3 сторона:");
        side3= scanner.nextFloat();
        Triangles treugolnic = new Triangles(side1,side2,side3);
        System.out.println("Периметр будет: "+ dF.format(treugolnic.getPerimeter()));
        System.out.println("Площадь будет: "+ dF.format(treugolnic.getSquare()));
        System.out.println("Прямоугольник");
        System.out.println("1 сторона:");
        side1= scanner.nextFloat();
        System.out.println("2 сторона:");
        side2= scanner.nextFloat();
        Rectangles pryamougolnic = new Rectangles(side1,side2);
        System.out.println("Периметр будет: "+ dF.format(pryamougolnic.getPerimeter()));
        System.out.println("Площадь будет: "+ dF.format(pryamougolnic.getSquare()));
        System.out.println("Окружность");
        System.out.println("Радиус:");
        side1= scanner.nextFloat();
        Circles okrugnost = new Circles(side1);
        System.out.println("Периметр будет: "+ dF.format(okrugnost.getPerimeter()));
        System.out.println("Площадь будет: "+ dF.format(okrugnost.getSquare()));
    }
}