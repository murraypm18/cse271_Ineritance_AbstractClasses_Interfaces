import static org.junit.Assert.*;

import org.junit.Test;

public class CubeTester {

	Cube c = new Cube(4, "Cube1");
	
	/**
	 * tests the workhorse constructor
	 */
	@Test
	public final void testCubeDoubleString()
	{
		assertTrue(4.0 == c.getLength());
		assertEquals("Cube1", c.getName());
	}
	
	/**
	 * tests getVolume method
	 * @return double
	 */
	@Test
	public final void testGetVolume()
	{
		assertTrue(64.0 == c.getVolume());
	}
	
	/**
	 * tests the toString method
	 * @return String
	 */
	@Test
	public final void testToString()
	{
		assertEquals("Cube [Name: Cube1, Length: 4.0]", c.toString());
	}

}
