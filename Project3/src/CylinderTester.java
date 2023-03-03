import static org.junit.Assert.*;

import org.junit.Test;

public class CylinderTester {

	Cylinder c = new Cylinder(20, 14, "Cylinder2");
	double delta = 0.00001;
	
	/**
	 * test workhorse constructor
	 */
	@Test
	public final void testCylinderDoubleDoubleString()
	{
		assertTrue(20 == c.getHeight());
		assertTrue(14 == c.getRadius());
		assertEquals("Cylinder2", c.getName());
	}
	
	/**
	 * test getVolume method
	 */
	@Test
	public final void testGetVolumeDouble()
	{
		assertEquals(12315.04320, c.getVolume(), delta);
	}
	
	/**
	 * tests the equals method
	 */
	@Test
	public final void testEqualsObject()
	{
		Cylinder c2 = new Cylinder(20, 14, "Cylinder2");
		assertEquals(true, c.equals(c2));
	}
	
	/**
	 * tests the toSting method
	 */
	@Test
	public final void testToStringString()
	{
		assertEquals("Cylinder [Name: Cylinder2, Height: 20.0, Radius: 14.0]", c.toString());
	}

}
