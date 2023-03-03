import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTester {

	Square s = new Square(12, "Square1");
	
	/**
	 * tests the workhorse constructor
	 */
	@Test
	public final void testSquareDoubleString()
	{
		assertTrue(12 == s.getLength());
		assertEquals("Square1", s.getName());
	}
	
	/**
	 * tests the getArea method
	 * @return double
	 */
	@Test
	public final void testGetArea()
	{
		assertTrue(144.0 == s.getArea());
	}
	
	/**
	 * tests the getName method
	 */
	@Test
	public final void testGetName()
	{
		assertEquals("Square1", s.getName());
	}
	
	/**
	 * tests the equals method 
	 * returns true if all info matches
	 */
	@Test
	public final void testEqualsObject()
	{
		Square square = new Square(12, "Square1");
		assertEquals(true, s.equals(square));
	}
	
	/**
	 * tests the toString method
	 */
	@Test
	public final void testToString()
	{
		assertEquals("Square [Name: Square1, Length: 12.0]", s.toString());
	}

}
