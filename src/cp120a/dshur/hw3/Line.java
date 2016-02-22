package cp120a.dshur.hw3;

import java.util.ArrayList;

public class Line extends Shape{

	private ArrayList<Point> coords;

	Line(ArrayList<Point> coords){
		 this.coords = coords;
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
		if (coords == null || coords.size() < 2) return null;
		double xmin,ymin,xmax,ymax;
		xmin = xmax = coords.get(0).getX();
		ymin = ymax = coords.get(0).getY();
		for (Point p : coords) {
			xmin = Math.min(xmin, p.getX());
			xmax = Math.max(xmax, p.getX());
			ymin = Math.min(ymin, p.getY());
			ymax = Math.max(ymax, p.getY());
		}
		return new Rectangle(xmin, ymin, xmax, ymax);
	}
}
