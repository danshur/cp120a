package cp120a.dshur.hw3;

public class Circle extends Shape{
	private Point center;
	private double radius;
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Circle(Point center, double radius){
		//center.getX();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		radius = Circle.this.radius;
		double area = Math.PI * (radius * radius);
		return round(area);
	}

	@Override
	public double getPerimeter() {
		double perimeter= Math.PI * 2*radius;
		return round(perimeter);
	}
	
	public double round(double num){
		num = Math.round(num * 100);
		return num = num/100;
		
	}

	@Override
	public Rectangle getMinimumBoundingRectangle() {
		// TODO Auto-generated method stub
		return null;
	}
}
