/*
* Patrick Murray
* CSE 271-C
* Project 3
* Inheritance, Abstract Classes, and Interfaces
*/
public class Glome extends Sphere implements Volume {

	/**
	 * workhorse constructor 
	 * @param radius
	 * @param name
	 */
	public Glome(double radius, String name)
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
		//formula for finding the volume of a glome
		return 0.5 * (Math.pow(Math.PI, 2)) * (Math.pow(super.getRadius(), 4));
	}
	
	/**
	 * overrides toString method
	 * @return String
	 */
	@Override
	public String toString()
	{
		return "Glome [Name: " + super.getName() + ", Radius: " + super.getRadius() + "]";
	}
}
