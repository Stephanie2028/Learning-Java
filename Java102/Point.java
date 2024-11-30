package Java102;
  
public class Point {
	public final double x;
	public final double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point translateX(double t) {
		return new Point(x + t, y);
	}
	
	public Point translateY(double t) {
		return new Point(x, y + t);
	}

    @Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

    public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}

    // Practice 1) Center of Mass
    public static Point centerOfMass(Point[] points) {
        double pointX = 0;
        double pointY = 0;

        for(Point p : points){
            pointX = pointX + p.x; 
            pointY = pointY + p.y; 
        }
        return new Point(pointX/points.length, pointY/points.length);
    } 
    // Practice 2) Angles 
    public double angle(){
        double Radians = Math.atan2(y, x);
        double Degrees = Math.toDegrees(Radians);
        double finalRadians = Math.toRadians(Degrees);
        return finalRadians;
    }

    }

