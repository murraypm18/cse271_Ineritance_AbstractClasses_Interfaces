/*
* Patrick Murray
* CSE 271-C
* Project 3
* Inheritance, Abstract Classes, and Interfaces
*/
public class Project3Driver {

	public static void main(String[] args) {
		//shows circle class and methods
		Circle circle = new Circle(2, "Circle1");
		Circle circle2 = new Circle(2, "Circle1");
		System.out.println(circle.getArea());
		System.out.println(circle.getName());
		System.out.println(circle.equals(circle2));
		System.out.println(circle.toString());
		circle.setRadius(5);
		System.out.println(circle.getRadius() + "\n");
		
		//shows square class and methods
		Square square = new Square(12, "square1");
		Square square2 = new Square(12, "square1");
		System.out.println(square.getArea());
		System.out.println(square.getName());
		System.out.println(square.equals(square2));
		System.out.println(square.toString());
		square.setLength(6);
		System.out.println(square.getLength() + "\n");
		
		//shows cylinder class and methods
		Cylinder c  = new Cylinder(8, 6, "cylinder1");
		Cylinder c2  = new Cylinder(8, 6, "cylinder1");
		System.out.println(c.getVolume());
		System.out.println(c.getName());
		System.out.println(c.equals(c2));
		System.out.println(c.toString());
		c.setHeight(7);
		System.out.println(c.getHeight() + "\n");
		
		//shows sphere class and methods
		Sphere s = new Sphere(4, "Sphere1");
		Sphere s2 = new Sphere(4, "Sphere1");
		System.out.println(s.getVolume());
		System.out.println(s.getName());
		System.out.println(s.equals(s2));
		System.out.println(s.toString() + "\n");
		
		//shows cube class and methods
		Cube cube = new Cube(11, "Cube1");
		Cube cube2 = new Cube(11, "Cube1");
		System.out.println(cube.getVolume());
		System.out.println(cube.getName());
		System.out.println(cube.equals(cube2));
		System.out.println(cube.toString() + "\n");
		
		//shows glome class and methods
		Glome g = new Glome(9, "Glome1");
		Glome g2 = new Glome(9, "Glome1");
		System.out.println(g.getVolume());
		System.out.println(g.getName());
		System.out.println(g.equals(g2));
		System.out.println(g.toString() + "\n");		
	}

}
