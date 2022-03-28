public class Point {
    private int x;
    private int y;
    private String label;

    public Point( String l, int xx, int yy) {
        x = xx;
        y = yy;
        label = l;
    }

    public String toString() {
        return "Point " + label+ " is at x = " + x + ", " + "y = " + y;
    }

    public boolean equals(Object ob) {
        if (ob == null || !(ob instanceof Point)) {
            return false;
        }
        Point oo = (Point) ob;
        return (this.x == oo.x ) && this.y == oo.y;


    }
    public String getLabel()
    {
        return label;
    }
    public int getX() {

        return x;

    }
    public int getY()
    {
        return y;
    }
}
