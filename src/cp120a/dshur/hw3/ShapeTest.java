package cp120a.dshur.hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ShapeTest {

	public static void main(String[] args) {

		// test point
		Point p1 = new Point(1, 2);
		System.out.println("Point test coords: " + "x=" + p1.getX() + " and y=" + p1.getY() + " Area=" + p1.getArea()
				+ " Min rect=" + p1.getMinimumBoundingRectangle());

		// test circle with a new point
		Point p2 = new Point(5, 5);
		Shape c1 = new Circle(p2, 5);
		System.out.println("Circle test (rounded): " + "x=" + p2.getX() + " and y=" + p2.getY() + " Area="
				+ c1.getArea() + " Perimeter=" + c1.getPerimeter() + " Min rect=" + c1.getMinimumBoundingRectangle());

		// test Rectangle(double xmin, double ymin, double xmax, double ymax)
		Rectangle r1 = new Rectangle(0, 0, 5, 5);
		System.out.println("Rectangle test: " + "Width=" + r1.getWidth() + " Lenght=" + r1.getLenght() + " Area="
				+ r1.getArea() + " Perimeter=" + r1.getPerimeter() + " Min rect=" + r1.getMinimumBoundingRectangle());

		// square test errors out
		Point sp1 = new Point(10, 10);
		Square s1 = new Square(sp1, 2.5); // Square(Point center, double
											// sideLength)
		System.out.println("Square test: " + "x=" + sp1.getX() + " and y=" + sp1.getY() + " Side=" + s1.getSideLength()
				+ " Area=" + s1.getArea() + " Perimeter=" + s1.getPerimeter() + " Min rect="
				+ p1.getMinimumBoundingRectangle());

		// triangle test
		Point tp1 = new Point(1, 1);
		Point tp2 = new Point(1, 10);
		Point tp3 = new Point(5, 5);
		Triangle t1 = new Triangle(tp1, tp2, tp3);
		System.out.println("Triangle area=" + t1.getArea() + " Perimeter=" + t1.getPerimeter() + " Min rect="
				+ p1.getMinimumBoundingRectangle());

		// line test
		
		ArrayList<Point> lp = new ArrayList<Point>();
		lp.add(new Point(5, 5));
		lp.add(new Point(15, 15));
		lp.add(new Point(55, 25));
		//Collections.sort(lp, (a, b) -> ((double) a).compare(b));
		//lp.sort();
		//Collections.sort(lp, lp); // (lp, (Point a, Point b) -> a.compareTo(b));
		Collections.sort(lp, new Comparator<Point>() {
			
			@Override
			public int compare(Point arg0, Point arg1) {
				// TODO Auto-generated method stub
			    return Double.compare(arg0.getX(), arg1.getX());
			}
		});
		
		int i = 1;
		for (Point p : lp) {
			System.out.println("Line point " + i++ + "=" + p.getX() + " and " + p.getY()+ " Min rect="
					+ p1.getMinimumBoundingRectangle());
		}
	}

}
