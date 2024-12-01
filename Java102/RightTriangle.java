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

}
