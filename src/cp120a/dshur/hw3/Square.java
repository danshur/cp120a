package cp120a.dshur.hw3;

public class Square extends Rectangle {
	// private Point center;
	private double sideLength;

	public double getSideLength() {
		return sideLength;
	}

	// problem here trying to use point
	public Square(Point center, double sideLength) {
		// this.center = center;
		this.sideLength = sideLength;
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
