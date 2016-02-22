package cp120a.dshur.hw3;

public class Triangle extends Shape {

	private Point p1, p2, p3; // points
	private double side1;
	private double side2;
	private double side3;

	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	@Override
	public double getArea() {

		// Math.abs((a.getX()-c.getX())*(b.getY()-a.getY())-(a.getX()-b.getX())*(c.getY()-a.getY()))*0.5;
		double area = Math.abs(
				(p1.getX() - p3.getX()) * (p2.getY() - p1.getY()) - (p1.getX() - p2.getX()) * (p3.getY() - p1.getY()))
				* 0.5;
		return area;
	}

	@Override
	public double getPerimeter() {
		// Perimeter of triangle=(s1+s2+s3) s1=x,y
		// side1 = Math.pow(Math.pow((side2x - side1x), 2) + Math.pow((side2y -
		// side1y), 2) * .05, side1);
		// double side1 = Math.pow(Math.pow((p2.getX() - p1.getX()), 2) +
		// Math.pow((p2.getY() - p1.getY()), 2) * .05);
		side1 = Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
		side2 = Math.sqrt(Math.pow((p3.getX() - p2.getX()), 2) + Math.pow((p3.getY() - p2.getY()), 2));
		side3 = Math.sqrt(Math.pow((p1.getX() - p3.getX()), 2) + Math.pow((p1.getY() - p3.getY()), 2));
		double perim = side1 + side2 + side3;
		return round(perim);
	}

	public double round(double num) {
		num = Math.round(num * 100);
		return num = num / 100;

	}

	@Override
	public Rectangle getMinimumBoundingRectangle() {
		double xmin,ymin,xmax,ymax;
		//xmin=Math.min(this.pointA, b);
		return null;
	}
}
