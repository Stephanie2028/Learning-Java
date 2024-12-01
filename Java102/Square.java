package Java102;

public class Square implements Shape{
	public final Point corner;
	public final double sideLength;

	public Square(Point corner, double sideLength) {
		this.corner = corner;
		this.sideLength = sideLength;
	}

	public double area() {
        return sideLength * sideLength;
	}
	
	public double perimeter() {
		return sideLength + sideLength + sideLength + sideLength;
	}
	
	public boolean isInside(Point p) {
		double xDist = p.x - corner.x;
		double yDist = p.y - corner.y;
		return 0 < xDist && xDist < sideLength &&
			   0 < yDist && yDist < sideLength;
	}

	public boolean isOn(Point p) {
        double xDist = p.x - corner.x;
        double yDist = p.y - corner.y;

        return (xDist == 0 || xDist == sideLength) && (yDist >= 0 && yDist <= sideLength) || 
               (yDist == 0 || yDist == sideLength) && (xDist >= 0 && xDist <= sideLength);
    }
	
	public Square translate(double x, double y) {
        Point newCorner = new Point(corner.x + x, corner.y + y);
        return new Square(newCorner, sideLength);
    }

	public Square scale(double k) {
		return new Square(corner, sideLength * k);
	}

	public Point[] corners() {
        Point[] corners = new Point[4];
        corners[0] = corner;
        corners[1] = new Point(corner.x + sideLength, corner.y);
        corners[2] = new Point(corner.x, corner.y + sideLength);
        corners[3] = new Point(corner.x + sideLength, corner.y + sideLength);
        return corners;
    }

	@Override
	public String toString() {
		return "(corner: " + corner + "; side length: " + sideLength + ")";
	}
}
