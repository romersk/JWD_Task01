package by.training.task10.main;

import org.junit.Test;
import junit.framework.Assert;

public class TestTask10 {

	private static final double DELTA = 1e-15;
	
	@SuppressWarnings("static-access")
	@Test
	public void test1Task10()
	{
		double x;
		
		x = 0.1;
		
		double expected;
		double actual;
		
		expected = 0.100334672085451;
		
		Task10 p = new Task10();
		actual = p.getTg(x);
		
		Assert.assertEquals(expected, actual, DELTA);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test2Task10()
	{
		double x;
		
		x = 25.56;
		
		double expected;
		double actual;
		
		expected = 0.455307380802902;
		
		Task10 p = new Task10();
		actual = p.getTg(x);
		
		Assert.assertEquals(expected, actual, DELTA);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test3Task10()
	{
		double x;
		
		x = 22.2;
		
		double expected;
		double actual;
		
		expected = 0.211941983185885;
		
		Task10 p = new Task10();
		actual = p.getTg(x);
		
		Assert.assertEquals(expected, actual, DELTA);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test4Task10()
	{
		double x;
		
		x = 22;
		
		double expected;
		double actual;
		
		expected = 0.008851656041684;
		
		Task10 p = new Task10();
		actual = p.getTg(x);
		
		Assert.assertEquals(expected, actual, DELTA);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test5Task10()
	{
		double x;
		
		x = 100;
		
		double expected;
		double actual;
		
		expected = -0.587213915156929;
		
		Task10 p = new Task10();
		actual = p.getTg(x);
		
		Assert.assertEquals(expected, actual, DELTA);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test6Task10()
	{
		double x;
		
		x = -15.55;
		
		double expected;
		double actual;
		
		expected = 0.159290369166487;
		
		Task10 p = new Task10();
		actual = p.getTg(x);
		
		Assert.assertEquals(expected, actual, DELTA);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test7Task10()
	{
		double x;
		
		x = -100;
		
		double expected;
		double actual;
		
		expected = 0.587213915156929;
		
		Task10 p = new Task10();
		actual = p.getTg(x);
		
		Assert.assertEquals(expected, actual, DELTA);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test8Task10()
	{
		double x;
		
		x = 55.22;
		
		double expected;
		double actual;
		
		expected = -4.049010589334386;
		
		Task10 p = new Task10();
		actual = p.getTg(x);
		
		Assert.assertEquals(expected, actual, DELTA);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test9Task10()
	{
		double x;
		
		x = -1.2;
		
		double expected;
		double actual;
		
		expected = -2.572151622126319;
		
		Task10 p = new Task10();
		actual = p.getTg(x);
		
		Assert.assertEquals(expected, actual, DELTA);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test10Task10()
	{
		double x;
		
		x = -5555;
		
		double expected;
		double actual;
		
		expected = -0.782838161144654;
		
		Task10 p = new Task10();
		actual = p.getTg(x);
		
		Assert.assertEquals(expected, actual, DELTA);
		
	}
	
}
