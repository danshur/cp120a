package cp120a.dshur.hw3;

public class Square extends Rectangle{
	private Point center;
	private double sideLength;
	
	
// problem here trying to use point
	public Square(Point center, double sideLength){
		this.sideLength = sideLength;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
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
