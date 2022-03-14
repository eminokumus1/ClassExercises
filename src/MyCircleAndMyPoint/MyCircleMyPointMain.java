package MyCircleAndMyPoint;

public class MyCircleMyPointMain {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(1, 1, 2);

        MyPoint p1 = new MyPoint(2, 2);
        MyCircle c3 = new MyCircle(p1, 3);
        MyPoint p3 = new MyPoint(2,2);

        System.out.println(c1);// MyCircleAndMyPoint.MyCircle ToString
        System.out.println(c2);
        System.out.println(c3);
        //Getter Setter
        c1.setCenter(p3);
        c2.setRadius(5);
        c3.setCenterX(4);
        c3.setCenterY(4);
        System.out.println("c1 center:" + c1.getCenter());
        System.out.println("c2 radius:" + c2.getRadius());
        System.out.println("c3 x:" + c3.getCenterX());
        System.out.println("c3 y:" + c3.getCenterY());
        System.out.println("c1 area:" + c1.getArea());
        System.out.println("c2 circumference:" + c2.getCircumference());

        MyPoint p2 = new MyPoint(5, 6);
        System.out.println("Distance between c1 and p2: " + c1.distance(p2));


    }
}
