package gr.aueb.dt.ch4;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(5.0);
        Point2D p2 = new Point2D(3.0, 4.0);
        Point3D p3 = new Point3D(1.0, 2.0, 3.0);

        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);
    }

    // Polymorphism
    public static void doMovePlus10(Point p) {
        p.movePlus10();
    }
}
