/*
* Patrick Murray
* CSE 271-C
* Project 3
* Inheritance, Abstract Classes, and Interfaces
*/
abstract class Shape {
	protected String name;
	
	/**
	 * workhorse constructor to set the name
	 * @param name
	 */
	public Shape(String name)
	{
		//uses the set name method to set the name of the shape
		setName(name);
	}
	
	/**
	 * returns the name 
	 * all shapes inherit getName
	 * @return String
	 */
	//all shapes inherit getName
	public abstract String getName();

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
