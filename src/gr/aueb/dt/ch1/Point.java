package gr.aueb.dt.ch1;

/**
 * Java Bean - POJO class
 * Data class
 */
public class Point {
    private int x;
    private int y;

    // Default constructor = parameterless constructor
    public Point() {
    }

    // Overloaded constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
