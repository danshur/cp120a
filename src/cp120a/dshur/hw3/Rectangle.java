package cp120a.dshur.hw3;

public class Rectangle extends Shape {
	private double xmin;
	private double ymin;
	private double xmax;
	private double ymax;
	private double lenght;
	private double width;
	//private Point center;

	public double getLenght() {
		Rectangle.this.lenght = Rectangle.this.xmax - Rectangle.this.xmin;
		return Rectangle.this.lenght;
	}

	public double getWidth() {
		Rectangle.this.width = Rectangle.this.ymax - Rectangle.this.ymin;
		return Rectangle.this.width;
	}

	
	// setters for rectangle
	public Rectangle(double xmin, double ymin, double xmax, double ymax) {
		this.xmin = xmin;
		this.xmax = xmax;
		this.ymin = ymin;
		this.ymax = ymax;
	}

	@Override
	public double getArea() {
		// double area = length * width;
		// Rectangle.this.length = Rectangle.this.xmax - Rectangle.this.xmin;
		// Rectangle.this.width = Rectangle.this.ymax - Rectangle.this.ymin;
		return (lenght * width);
	}

	@Override
	public double getPerimeter() {
		// P=2(l+w)
		return 2 * (lenght + width);
	}

	@Override
	public Rectangle getMinimumBoundingRectangle() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
