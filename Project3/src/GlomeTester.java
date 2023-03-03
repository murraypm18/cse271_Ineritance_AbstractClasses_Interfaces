import static org.junit.Assert.*;

import org.junit.Test;

public class GlomeTester {

	Glome g = new Glome(4, "Glome1");
	double delta = 0.00001;
	
	/**
	 * tests the workhorse constructor
	 */
	@Test
	public final void testCubeDoubleString()
	{
		assertEquals("Glome1", g.getName());
		assertTrue(4.0 == g.getRadius());
	}
	
	/**
	 * tests getVolume method
	 * @return double
	 */
	@Test
	public final void testGetVolume()
	{
		assertEquals(1263.30936, g.getVolume(), delta);
	}
	
	/**
	 * tests the toString method
	 * @return String
	 */
	@Test
	public final void testToString()
	{
		assertEquals("Glome [Name: Glome1, Radius: 4.0]", g.toString());
	}
}
