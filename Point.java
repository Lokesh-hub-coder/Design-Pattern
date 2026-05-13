// create a class having a factory() method that returns a point 
// depending on the input arguments passed provide the class 
// diagram for your solution and write main program to invoke 
// the factory method twice . once for a 2D point and once for 3D point .
// also find the length between those two points.
class Main {
    public static void main(String[] args) {
        Point point2D = Point.factory(3.0, 4.0);
        Point point3D = Point.factory(1.0, 2.0, 2.0);

        System.out.println("2D Point: (" + point2D.getX() + ", " + point2D.getY() + ")");
        System.out.println("3D Point: (" + point3D.getX() + ", " + point3D.getY() + ", " + point3D.getZ() + ")");

        double distance = Point.calculateDistance(point2D, point3D);
        System.out.println("Distance between 2D and 3D point: " + distance);
    }
}



public class Point {
    private double x;
    private double y;
    private double z;

    //2-D Point constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    //3-D Point constructor
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Factory method
    public static Point factory(double... coordinates) {
        if (coordinates.length == 2) {
            return new Point(coordinates[0], coordinates[1]);
        } else if (coordinates.length == 3) {
            return new Point(coordinates[0], coordinates[1], coordinates[2]);
        } else {
            throw new IllegalArgumentException("Invalid number of coordinates");
        }
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    public static double calculateDistance(Point p1, Point p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        double dz = p2.getZ() - p1.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}