/*
* Patrick Murray
* CSE 271-C
* Project 3
* Inheritance, Abstract Classes, and Interfaces
*/
public class Sphere extends Circle implements Volume{
	
	/**
	 * workhorse constructor
	 * @param radius
	 * @param name
	 */
	public Sphere(double radius, String name)
	{
		//sets radius and name using super constructor
		super(radius, name);
	}
	
	/**
	 * returns the volume 
	 * @return double
	 */
	public double getVolume()
	{
		//formula for finding the volume of a sphere
		return (4.0/3.0 * Math.pow(super.getRadius(), 3)) * Math.PI;
	}
	
	/**
	 * overrides toString method
	 * @return String
	 */
	@Override
	public String toString()
	{
		return "Sphere [Name: " + super.getName() + ", Radius: " + super.getRadius() + "]"; 
	}
}
