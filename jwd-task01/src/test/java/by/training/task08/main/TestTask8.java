package by.training.task08.main;

import org.junit.Test;
import junit.framework.Assert;

public class TestTask8 {
	
	private static final double DELTA = 1e-15;
	
	@SuppressWarnings("static-access")
	@Test
	public void test1Task8()
	{
		double x;
		
		x = 1000;
		
		double expected;
		double actual;
		
		expected = -996991;
		
		Task8 p = new Task8();
		actual = p.funcX(x);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test2Task8()
	{
		double x;
		
		x = 456.2;
		
		double expected;
		double actual;
		
		expected = -206740.84;
		
		Task8 p = new Task8();
		actual = p.funcX(x);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test3Task8()
	{
		double x;
		
		x = 12.5;
		
		double expected;
		double actual;
		
		expected = -109.75;
		
		Task8 p = new Task8();
		actual = p.funcX(x);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test4Task8()
	{
		double x;
		
		x = 45555;
		
		double expected;
		double actual;
		
		expected = -2075121351;
		
		Task8 p = new Task8();
		actual = p.funcX(x);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test5Task8()
	{
		double x;
		
		x = 17.1;
		
		double expected;
		double actual;
		
		expected = -232.11;
		
		Task8 p = new Task8();
		actual = p.funcX(x);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test6Task8()
	{
		double x;
		
		x = 0.2;
		
		double expected;
		double actual;
		
		expected = -0.166889185580774;
		
		Task8 p = new Task8();
		actual = p.funcX(x);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test7Task8()
	{
		double x;
		
		x = -5;
		
		double expected;
		double actual;
		
		expected = -0.00763358778626;
		
		Task8 p = new Task8();
		actual = p.funcX(x);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	public void test8Task8()
	{
		double x;
		
		x = -1.12;
		
		double expected;
		double actual;
		
		expected = -0.135045202330124;
		
		Task8 p = new Task8();
		actual = p.funcX(x);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test9Task8()
	{
		double x;
		
		x = -100;
		
		double expected;
		double actual;
		
		expected = -0.000000999994;
		
		Task8 p = new Task8();
		actual = p.funcX(x);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test10Task8()
	{
		double x;
		
		x = 2.3;
		
		double expected;
		double actual;
		
		expected = 0.16215339711367;
		
		Task8 p = new Task8();
		actual = p.funcX(x);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
}
