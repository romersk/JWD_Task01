package by.training.task09.main;

import org.junit.Test;
import junit.framework.Assert;

public class TestTask9 {

	private static final double DELTA = 1e-15;
	
	@SuppressWarnings("static-access")
	@Test
	public void test1Task9()
	{
		double r;
		
		r = 10;
		
		double expected;
		double actual;
		
		expected = 62.83185307179586;
		
		Task9 p = new Task9();
		actual = p.lengthR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test2Task9()
	{
		double r;
		
		r = 14.2;
		
		double expected;
		double actual;
		
		expected = 89.22123136195012;
		
		Task9 p = new Task9();
		actual = p.lengthR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test3Task9()
	{
		double r;
		
		r = 0.25;
		
		double expected;
		double actual;
		
		expected = 1.570796326794897;
		
		Task9 p = new Task9();
		actual = p.lengthR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test4Task9()
	{
		double r;
		
		r = 25;
		
		double expected;
		double actual;
		
		expected = 157.07963267948966;
		
		Task9 p = new Task9();
		actual = p.lengthR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test5Task9()
	{
		double r;
		
		r = 89;
		
		double expected;
		double actual;
		
		expected = 559.2034923389832;
		
		Task9 p = new Task9();
		actual = p.lengthR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test6Task9()
	{
		double r;
		
		r = 33.1221;
		
		double expected;
		double actual;
		
		expected = 208.112292062933;
		
		Task9 p = new Task9();
		actual = p.lengthR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test7Task9()
	{
		double r;
		
		r = 54.44;
		
		double expected;
		double actual;
		
		expected = 342.0566081228567;
		
		Task9 p = new Task9();
		actual = p.lengthR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test8Task9()
	{
		double r;
		
		r = 11;
		
		double expected;
		double actual;
		
		expected = 69.11503837897544;
		
		Task9 p = new Task9();
		actual = p.lengthR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test9Task9()
	{
		double r;
		
		r = 111.11;
		
		double expected;
		double actual;
		
		expected = 698.1247194807238;
		
		Task9 p = new Task9();
		actual = p.lengthR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test10Task9()
	{
		double r;
		
		r = 10.02;
		
		double expected;
		double actual;
		
		expected = 62.95751677793945;
		
		Task9 p = new Task9();
		actual = p.lengthR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test11Task9()
	{
		double r;
		
		r = 10;
		
		double expected;
		double actual;
		
		expected = 314.1592653589793;
		
		Task9 p = new Task9();
		actual = p.squareR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test12Task9()
	{
		double r;
		
		r = 14.2;
		
		double expected;
		double actual;
		
		expected = 633.4707426698458;
		
		Task9 p = new Task9();
		actual = p.squareR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test13Task9()
	{
		double r;
		
		r = 0.25;
		
		double expected;
		double actual;
		
		expected = 0.196349540849362;
		
		Task9 p = new Task9();
		actual = p.squareR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test14Task9()
	{
		double r;
		
		r = 25;
		
		double expected;
		double actual;
		
		expected = 1963.4954084936207;
		
		Task9 p = new Task9();
		actual = p.squareR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test15Task9()
	{
		double r;
		
		r = 89;
		
		double expected;
		double actual;
		
		expected = 24884.555409084755;
		
		Task9 p = new Task9();
		actual = p.squareR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test16Task9()
	{
		double r;
		
		r = 33.1221;
		
		double expected;
		double actual;
		
		expected = 3446.558074468837;
		
		Task9 p = new Task9();
		actual = p.squareR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test17Task9()
	{
		double r;
		
		r = 54.44;
		
		double expected;
		double actual;
		
		expected = 9310.780873104159;
		
		Task9 p = new Task9();
		actual = p.squareR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test18Task9()
	{
		double r;
		
		r = 11;
		
		double expected;
		double actual;
		
		expected = 380.1327110843649;
		
		Task9 p = new Task9();
		actual = p.squareR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test19Task9()
	{
		double r;
		
		r = 111.11;
		
		double expected;
		double actual;
		
		expected = 38784.31879075161;
		
		Task9 p = new Task9();
		actual = p.squareR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test20Task9()
	{
		double r;
		
		r = 10.02;
		
		double expected;
		double actual;
		
		expected = 315.4171590574766;
		
		Task9 p = new Task9();
		actual = p.squareR(r);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
}
