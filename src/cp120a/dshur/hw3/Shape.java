package cp120a.dshur.hw3;

/***
 * The Shape base class has the following abstract methods getArea() returns
 * double getPerimeter() returns double getMinimumBoundingRectangle() returns
 * Rectangle
 */

public abstract class Shape {

	Shape() {

	}

	public abstract double getArea();

	public abstract double getPerimeter();

	public abstract Rectangle getMinimumBoundingRectangle();

}
