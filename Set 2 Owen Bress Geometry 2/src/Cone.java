import java.lang.Math;
//class name: Cone
//written by: Owen Bress
//date: Oct 21, 2021
//description: Class that provides the implementation for the Cone object. There is two object variables which are Circle base and double height.
public class Cone {
	private Circle base;
	private double height;

	public Cone() {
		this(new Circle(4), 8);
	}
	public Cone(Circle base, double height) {
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
	// description: returns the surface area of the cone
	public double getSurfaceArea() {
		return Math.PI*(double)Math.pow(base.getRadius(), 2)+(Math.PI*base.getRadius()*Math.sqrt((double)Math.pow(base.getRadius(), 2)+(double)Math.pow(height, 2)));
	}
	// method: getVolume
	// parameters: none
	// return type: double
	// description: returns the volume of the cone
	public double getVolume() {
		return 1/3.0*Math.PI*(double)Math.pow(base.getRadius(), 2)*height;
	}
	
	public String toString() {
		return "Cylinder [base=" + base.getRadius() + " height=" + height + "]";
	}
}
