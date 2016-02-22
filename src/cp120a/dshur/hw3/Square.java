package cp120a.dshur.hw3;

public class Square extends Rectangle {
	// private Point center;
	private double sideLength;	

	// problem here trying to use point
	public Square(Point center, double sideLength) {
		super(center.getX() - sideLength / 2.0, center.getY() - sideLength / 2.0, center.getX() + sideLength / 2.0, center.getY() + sideLength / 2.0); 
		this.sideLength = sideLength;
	}
	
	public double getSideLength() {
		return sideLength;
	}

	@Override
	public double getArea() {
		// return (lenght * width);
		return sideLength * sideLength;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return sideLength * 4;
	}

	@Override
	public Rectangle getMinimumBoundingRectangle() {
		// TODO Auto-generated method stub
		return null;
	}
}
