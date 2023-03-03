import static org.junit.Assert.*;

import org.junit.Test;

public class SphereTester {

	Sphere s = new Sphere(15, "Sphere1");
	double delta = 0.00001;
	
	/**
	 * tests the workhorse constructor
	 */
	@Test
	public final void testSphere()
	{
		assertEquals("Sphere1", s.getName());
		assertTrue(15.0 == s.getRadius());
	}
	
	/**
	 * tests getVolume method
	 * @return double
	 */
	@Test
	public final void testGetVolume()
	{
		assertEquals(14137.16694, s.getVolume(), delta);
	}
	
	/**
	 * tests the toString method
	 * @return String
	 */
	@Test
	public final void testToString()
	{
		assertEquals("Sphere [Name: Sphere1, Radius: 15.0]", s.toString());
	}

}
