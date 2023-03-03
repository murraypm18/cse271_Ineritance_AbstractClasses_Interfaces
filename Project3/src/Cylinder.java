/*
* Patrick Murray
* CSE 271-C
* Project 3
* Inheritance, Abstract Classes, and Interfaces
*/
public class Cylinder extends Circle implements Volume {
	
	private double height;
	
	/**
	 * workhorse constructor
	 * @param height
	 * @param radius
	 * @param name
	 */
	public Cylinder(double height, double radius, String name)
	{
		//sets radius and name using super constructor
		super(radius, name);
		this.height = height;
	}
	
	/**
	 * returns the volume of the cylinder
	 * @return double
	 */
	public double getVolume()
	{
		//formula for finding the volume of a cylinder
		return Math.PI*(Math.pow(super.getRadius(), 2)*height);
	}
	
	/**
	 * overrides the equals method
	 */
	@Override
	public boolean equals(Object o)
	{
		//checks if object is an instance of cylinder
		if(!(o instanceof Cylinder))
			return false;
		
		//sets object to a cylinder
		Cylinder c = (Cylinder)o;
		//checks if it is equal
		return super.equals(c) &&
				this.getHeight() == c.getHeight();
	}
	
	/**
	 * overrides the toString method
	 * @return String
	 */
	public String toString()
	{
		return "Cylinder [Name: " + super.getName() + ", Height: " + height + ", Radius: " + super.getRadius() + "]"; 
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	
}
