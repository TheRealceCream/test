// class name: Cylinder
//written by: Owen Bress
//date: Oct 21, 2021
// description: Class that provides the implementation for the Cylinder object. There are two object variables which are Circle base and double height.
public class Cylinder {
	private Circle base;
	private double height;

	public Cylinder() {
		this(new Circle(4), 8);
	}
	public Cylinder(Circle base, double height) {
		this.base = base;
		this.height = height;
	}

	public void setBase(Circle base) {
		this.base = base;
	}
	public void setHeight(Double height){
		this.height = height;
	}
	
	public Circle getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	// method: getSurfaceArea
	// parameters: none
	// return type: double
	// description: returns the surface area of the cylinder
	public double getSurfaceArea() {
		return (2*Math.PI*(double)Math.pow(base.getRadius(), 2))+(2*Math.PI*base.getRadius()*height);
	}
	// method: getVolume
	// parameters: none
	// return type: double
	// description: returns the volume of the cylinder
	public double getVolume() {
		return Math.PI*(double)Math.pow(base.getRadius(), 2)*height;
	}
	
	public String toString() {
		return "Cylinder [base=" + base.getRadius() + " height=" + height + "]";
	}
}
