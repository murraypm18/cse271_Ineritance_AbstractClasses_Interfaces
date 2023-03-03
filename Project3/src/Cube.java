/*
* Patrick Murray
* CSE 271-C
* Project 3
* Inheritance, Abstract Classes, and Interfaces
*/
public class Cube extends Square implements Volume{
	
	/**
	 * workhorse constructor
	 * @param length
	 * @param name
	 */
	public Cube(double length, String name)
	{
		//sets the length and name using super constructor
		super(length, name);
	}
	
	/**
	 * returns the volume 
	 * @return double
	 */
	public double getVolume()
	{
		//formula for volume of a cube
		return Math.pow(super.getLength(), 3);
	}
	
	/**
	 * overrides toString method
	 * @return String
	 */
	@Override
	public String toString()
	{
		return "Cube [Name: " + super.getName() + ", Length: " + super.getLength() + "]"; 
	}
	
}
