public class ThreeDPoint extends Point{
private int z;
    public ThreeDPoint(String l, int xx, int yy, int zz) {
        super(l, xx, yy);
        z = zz;
    }
    public String toString() {
        return "Point " + super.getLabel()+ " is at x = " + super.getX() + ", " + "y = " + super.getY()+", " + "z = " + z;
    }

    public int getZ() {
        return z;
    }
    public boolean equals(Object ob) {
        if (ob == null || !(ob instanceof ThreeDPoint)) {
            return false;
        }
        ThreeDPoint oo = (ThreeDPoint) ob;
        return (super.getX() == oo.getX() ) && super.getY() == oo.getY() && this.z == oo.z;


    }

}
