/*
* Patrick Murray
* CSE 271-C
* Project 3
* Inheritance, Abstract Classes, and Interfaces
*/
public class Square extends Shape implements Area {

	private double length;
	
	/**
	 * workhorse constructor
	 * @param length
	 * @param name
	 */
	public Square(double length, String name)
	{
		//uses super constructor to set the name
		super(name);
		this.length = length;
	}
	
	/**
	 * returns the area of the square
	 * @return double
	 */
	public double getArea()
	{
		//formula to set the area of the Square
		return length*length;
	}
	
	/**
	 * overrides the getName method
	 */
	@Override
	public String getName()
	{
		return name;
	}
	
	/**
	 * overrides the equals method
	 */
	@Override
	public boolean equals(Object o)
	{
		//checks if object is an instance of square
		if(!(o instanceof Square))
			return false;
		
		//sets object to a square
		Square s = (Square)o;
		//checks if it is equal
		return this.getLength() == s.getLength() &&
				this.getName().equals(s.getName());
	}

	/**
	 * overrides the toString method
	 * @return String
	 */
	@Override
	public String toString()
	{
		return "Square [Name: " + name + ", Length: " + length + "]";
	}
	
	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
}
