// class name: Circle
//written by: Owen Bress
//date: Oct 21, 2021
// description: Class that provides the implementation for the circle object. There is one object variable which is radius.
public class Circle {
	private double radius;

	public Circle() {
		this(1.0);
	}
	public Circle(double radius) {
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	// method: getArea
	// parameters: none
	// return type: double
	// description: returns the area of the circle
	public double getArea() {
		return Math.PI*(double)Math.pow(radius, 2);
	}
	// method: getCircumference
	// parameters: none
	// return type: double
	// description: returns the circumference of a circle
	public double getCircumference() {
		return (Math.PI*2)*radius;
	}
	
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
