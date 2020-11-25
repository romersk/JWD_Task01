package by.training.task03.main;

import org.junit.Assert;
import org.junit.Test;


public class TestTask3 {

	private static final double DELTA = 1e-15;
	
	@SuppressWarnings({ "static-access" })
	@Test
	public void test1Task3()
	{
		double square;
		double expected;
		double actual;
		
		square = 145.2;
		expected = 72.6;
		
		Task3 p = new Task3();
		actual = p.getSquare(square);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings({ "static-access" })
	@Test
	public void test2Task3()
	{
		double square;
		double expected;
		double actual;
		
		square = 14;
		expected = 7;
		
		Task3 p = new Task3();
		actual = p.getSquare(square);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings({ "static-access" })
	@Test
	public void test3Task3()
	{
		double square;
		double expected;
		double actual;
		
		square = 100;
		expected = 50;
		
		Task3 p = new Task3();
		actual = p.getSquare(square);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	
	@SuppressWarnings({ "static-access" })
	@Test
	public void test4Task3()
	{
		double square;
		double expected;
		double actual;
		
		square = 11651.5;
		expected = 5825.75;
		
		Task3 p = new Task3();
		actual = p.getSquare(square);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings({ "static-access" })
	@Test
	public void test5Task3()
	{
		double square;
		double expected;
		double actual;
		
		square = 4754452.64454;
		expected = 2377226.32227;
		
		Task3 p = new Task3();
		actual = p.getSquare(square);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings({ "static-access" })
	@Test
	public void test6Task3()
	{
		double square;
		double expected;
		double actual;
		
		square = 0.98959465;
		expected = 0.494797325;
		
		Task3 p = new Task3();
		actual = p.getSquare(square);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings({ "static-access" })
	@Test
	public void test7Task3()
	{
		double square;
		double expected;
		double actual;
		
		square = 1.333;
		expected = 0.6665;
		
		Task3 p = new Task3();
		actual = p.getSquare(square);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings({ "static-access" })
	@Test
	public void test8Task3()
	{
		double square;
		double expected;
		double actual;
		
		square = 5.555;
		expected = 2.7775;
		
		Task3 p = new Task3();
		actual = p.getSquare(square);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@SuppressWarnings({ "static-access" })
	@Test
	public void test9Task3()
	{
		double square;
		double expected;
		double actual;
		
		square = 145725745;
		expected = 72862872.5;
		
		Task3 p = new Task3();
		actual = p.getSquare(square);
		
		Assert.assertEquals(expected, actual, DELTA);
	}
}
