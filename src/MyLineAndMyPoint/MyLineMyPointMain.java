package MyLineAndMyPoint;

public class MyLineMyPointMain {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(1,1,2,2);
        System.out.println(l1);

        MyPoint p1 = new MyPoint(3,3);
        MyPoint p2 = new MyPoint(4,4);
        MyLine l2 = new MyLine(p1,p2);
        System.out.println(l2);

        System.out.println("begin is:"+l2.getBegin());
        System.out.println("end is:"+l2.getEnd());
        System.out.println("x of begin is:"+ l2.getBeginX());
        System.out.println("y of begin is:"+ l2.getBeginY());
        System.out.println("x of end is:"+ l2.getEndX());
        System.out.println("y of end is:"+ l2.getEndY());

        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());

    }
}
