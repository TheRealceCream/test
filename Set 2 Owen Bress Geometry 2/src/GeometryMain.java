import java.util.Scanner;
//class name: GeometryMain
//written by: Owen Bress
//date: Oct 21, 2021
//description: Geometry Main class
public class GeometryMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice = 1;
		int choice2 = 0;
		while (choice >= 1) {
			System.out.println("Enter 1 if you would like to make a Circle\nEnter 2 if you would like to make a Cone\nEnter 3 if you would like to make a Cylinder\nEnter 0 to end the loop\n");
			choice = s.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter the radius of the circle");
					Circle c1 = new Circle(s.nextDouble());
					System.out.println("What would you like to know about the circle?: for area type 1, for circumference type 2.");
					choice2 = s.nextInt();
					if (choice2 == 1) {
						System.out.println("The area of the circle is: " + c1.getArea());
					}
					else if (choice2 == 2) {
						System.out.println("The circumference of the circle is: " + c1.getCircumference());
					}
					break;
					
				case 2: 
					System.out.println("Enter the base radius and height of the cone");
					Cone o1 = new Cone(new Circle(s.nextDouble()),s.nextDouble());
					System.out.println("What would you like to know about the Cone? \nType 1 for volume \nType 2 for surface area.");
					choice2 = s.nextInt();
					if (choice2 == 1) {
						System.out.println("The volume of the cone is: " + o1.getVolume());
					}
					else if (choice2 == 2) {
						System.out.println("The surface area of the cone is: " + o1.getSurfaceArea());
					}
					break;
					
				case 3:
					System.out.println("Enter the base radius and height of the Cylinder");
					Cylinder cy1 = new Cylinder(new Circle(s.nextDouble()),s.nextDouble());
					System.out.println("What would you like to know about the Cylinder? \nType 1 for volume \nType 2 for surface area.");
					choice2 = s.nextInt();
					if (choice2 == 1) {
						System.out.println("The volume of the cylinder is: " + cy1.getVolume());
					}
					else if (choice2 == 2) {
						System.out.println("The surface area of the cylinder is: " + cy1.getSurfaceArea());
					}
					break;
					
				default:
					System.out.println("Bye Bye");
			}
			System.out.println();
		}
	}

}