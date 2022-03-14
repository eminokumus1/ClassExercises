package MyCircleAndMyPoint;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle() {
        setCenter(new MyPoint(0, 0));
    }

    public MyCircle(int x, int y, int radius) {
        setCenter(new MyPoint(x, y));
        this.setRadius(radius);
    }

    public MyCircle(MyPoint center, int radius) {
        this.setCenter(center);
        this.setRadius(radius);
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    public String toString() {
        return "MyCircleAndMyPoint.MyCircle[radius=" + radius + ",center=" + center.toString();
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double distance(MyPoint another){
//        int xDiff = another.getX()-getCenterX();
//        int yDiff = another.getY()-getCenterY();
        return center.distance(another);
    }



}
