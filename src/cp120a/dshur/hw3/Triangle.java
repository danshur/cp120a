package cp120a.dshur.hw3;

public class Triangle extends Shape {

	private Point p1, p2, p3; // points

	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	@Override
	public double getArea() {
		
		// Math.abs((a.getX()-c.getX())*(b.getY()-a.getY())-(a.getX()-b.getX())*(c.getY()-a.getY()))*0.5;
		double area = Math.abs((p1.getX()-p3.getX())*(p2.getY()-p1.getY())-
		         (p1.getX()-p2.getX())*(p3.getY()-p1.getY()))*0.5;
		return area;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Rectangle getMinimumBoundingRectangle() {
		// TODO Auto-generated method stub
		return null;
	}
}
