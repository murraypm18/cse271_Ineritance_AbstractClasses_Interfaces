import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTester {
	
	Circle circle =  new Circle(6, "Circle1");
	double delta = 0.00001;

	
	/**
	 * tests the workhorse constructor
	 */
	@Test
	public final void testCircleDoubleString()
	{
		assertTrue(6 == circle.getRadius());
		assertEquals("Circle1", circle.getName());
	}
	
	/**
	 * tests the getArea method
	 * @return double
	 */
	@Test
	public final void testGetArea()
	{
		assertEquals(113.09733, circle.getArea(), delta);
	}
	
	/**
	 * tests the getName method
	 */
	@Test
	public final void testGetName()
	{
		assertEquals("Circle1", circle.getName());
	}
	
	/**
	 * tests the equals method 
	 * returns true if all info matches
	 */
	@Test
	public final void testEqualsObject()
	{
		Circle c = new Circle(6, "Circle1");
		assertEquals(true, circle.equals(c));
	}
	
	/**
	 * tests the toString method
	 */
	@Test
	public final void testToString()
	{
		assertEquals("Circle [Name: Circle1, Radius: 6.0]", circle.toString());
	}
	
	
	
	

}
