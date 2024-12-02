package Java102;
// Practice 6) RightTriangle 
public class RightTriangle implements Shape {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height;
    }

    public double perimeter() {
        double hypotenuse = Math.sqrt(height * height + base * base);
        return base + height + hypotenuse;
    }

    @Override
    public String toString() {
        return "RightTriangle[base=" + base + ", height=" + height + "]";
    }

    public static boolean similar(RightTriangle triangle1, RightTriangle triangle2) {
        double hypotenuse1 = Math.sqrt(triangle1.base * triangle1.base + triangle1.height * triangle1.height);
        double hypotenuse2 = Math.sqrt(triangle2.base * triangle2.base + triangle2.height * triangle2.height);
        
        boolean ratioHypotenuse = hypotenuse1 == hypotenuse2;
        boolean ratioHeight = triangle1.height == triangle2.height;
        boolean ratioBase = triangle1.base == triangle2.base;

        return ratioBase == ratioHeight && ratioHeight == ratioHypotenuse;


    }

}
