package by.training.task07.main;

import org.junit.Test;
import junit.framework.Assert;

public class TestTask7 {

	@SuppressWarnings("static-access")
	@Test
	public void test1Task7()
	{
		double x1, y1;
		double x2, y2;
		
		x1 = 0;
		y1 = 0;
		
		x2 = 1;
		y2 = 1;
		
		String expected;
		String actual;
		
		expected = "A";
		
		Task7 p = new Task7();
		actual = p.pointDist(x1, y1, x2, y2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test2Task7()
	{
		double x1, y1;
		double x2, y2;
		
		x1 = 100;
		y1 = 100;
		
		x2 = 1;
		y2 = 1;
		
		String expected;
		String actual;
		
		expected = "B";
		
		Task7 p = new Task7();
		actual = p.pointDist(x1, y1, x2, y2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test3Task7()
	{
		double x1, y1;
		double x2, y2;
		
		x1 = 0.23;
		y1 = 0.123;
		
		x2 = 1;
		y2 = 1;
		
		String expected;
		String actual;
		
		expected = "A";
		
		Task7 p = new Task7();
		actual = p.pointDist(x1, y1, x2, y2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test4Task7()
	{
		double x1, y1;
		double x2, y2;
		
		x1 = 1414.23;
		y1 = 0.123;
		
		x2 = 1;
		y2 = 1;
		
		String expected;
		String actual;
		
		expected = "B";
		
		Task7 p = new Task7();
		actual = p.pointDist(x1, y1, x2, y2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test5Task7()
	{
		double x1, y1;
		double x2, y2;
		
		x1 = 1414.23;
		y1 = 0.123;
		
		x2 = 1;
		y2 = 0.123;
		
		String expected;
		String actual;
		
		expected = "B";
		
		Task7 p = new Task7();
		actual = p.pointDist(x1, y1, x2, y2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test6Task7()
	{
		double x1, y1;
		double x2, y2;
		
		x1 = 1414.23;
		y1 = 1442.123;
		
		x2 = 145;
		y2 = 0.123;
		
		String expected;
		String actual;
		
		expected = "B";
		
		Task7 p = new Task7();
		actual = p.pointDist(x1, y1, x2, y2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test7Task7()
	{
		double x1, y1;
		double x2, y2;
		
		x1 = 1414.23;
		y1 = 1442.123;
		
		x2 = 145;
		y2 = 145.123;
		
		String expected;
		String actual;
		
		expected = "B";
		
		Task7 p = new Task7();
		actual = p.pointDist(x1, y1, x2, y2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test8Task7()
	{
		double x1, y1;
		double x2, y2;
		
		x1 = -141.23;
		y1 = 1442.123;
		
		x2 = 145;
		y2 = 145.123;
		
		String expected;
		String actual;
		
		expected = "B";
		
		Task7 p = new Task7();
		actual = p.pointDist(x1, y1, x2, y2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test9Task7()
	{
		double x1, y1;
		double x2, y2;
		
		x1 = -141.23;
		y1 = 142.123;
		
		x2 = 145;
		y2 = 145.123;
		
		String expected;
		String actual;
		
		expected = "A";
		
		Task7 p = new Task7();
		actual = p.pointDist(x1, y1, x2, y2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test10Task7()
	{
		double x1, y1;
		double x2, y2;
		
		x1 = -9999.23;
		y1 = 19999.123;
		
		x2 = 999;
		y2 = 99999.123;
		
		String expected;
		String actual;
		
		expected = "A";
		
		Task7 p = new Task7();
		actual = p.pointDist(x1, y1, x2, y2);
		
		Assert.assertEquals(expected, actual);
	}
	
}
