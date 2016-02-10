package cp120a.dshur.hw3;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {

		// test point
		Point p1 = new Point(1, 2);
		System.out.println("Point test coords: " + "x=" + p1.getX() + " and y=" + p1.getY());

		// test circle with a new point
		Point p2 = new Point(5, 5);
		Shape c1 = new Circle(p2, 5); // need to check if its out of bounds for
										// point
		System.out.println("Circle test (rounded): " + "x=" + p2.getX() + " and y=" + p2.getY() + " Area="
				+ c1.getArea() + " Perimeter=" + c1.getPerimeter());

		// Rectangle test
		// Rectangle(double xmin, double ymin, double xmax, double ymax)
		Rectangle r1 = new Rectangle(0, 0, 5, 5);
		System.out.println("Rectangle test: " + "Width=" + r1.getWidth() + " Lenght=" + r1.getLenght() + " Area="
				+ r1.getArea() + " Perimeter=" + r1.getPerimeter());

		// square test
		/*Point sp1 = new Point(10, 10);
		Square s1 = new Square(sp1, 5); // Square(Point center, double
										// sideLength)
		System.out.println("Square test: " + "x=" + sp1.getX() + " and y=" + sp1.getY() + " Area=" + s1.getArea()
				+ " Perimeter=" + s1.getPerimeter());*/
		
		//triangle test
		Point tp1 = new Point(1, 1);
		Point tp2 = new Point(1, 10);
		Point tp3 = new Point(5, 5);
		Triangle t1 = new Triangle(tp1, tp2, tp3);
		System.out.println("Triangle area=" + t1.getArea());
		
		//line test
		ArrayList<Point> lp = new ArrayList<Point>();
		lp.add(new Point(5, 5));
		lp.add(new Point(15, 15));
		lp.add(new Point(55, 25));
		for (Point p : lp) {
		    System.out.println(p.getX() + "x" + p.getY());
		}
	}

}
