package MyLineAndMyPoint;

public class MyLine {
    private MyPoint begin = new MyPoint();
    private MyPoint end = new MyPoint();

    public MyLine(int x1, int y1, int x2, int y2) {
        begin.setXY(x1, y1);
        end.setXY(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.setBegin(begin);
        this.setEnd(end);
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        double length = Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
        return length;
    }

    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    public String toString() {
        return "Myline[begin=" + begin.toString() + ",end=" + end.toString() + "]";
    }


}
