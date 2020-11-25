package by.training.task04.main;

import org.junit.Test;

import junit.framework.Assert;

public class TestTask4 {

	@SuppressWarnings("static-access")
	@Test
	public void test1Task4()
	{
		int a, b, c, d;
		a = 1;
		b = 1;
		c = 1;
		d = 1;
		
		boolean expected;
		boolean actual;
		
		expected = false;
		
		Task4 p = new Task4();
		actual = p.getResultOfNum(a, b, c, d);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test2Task4()
	{
		int a, b, c, d;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		
		boolean expected;
		boolean actual;
		
		expected = true;
		
		Task4 p = new Task4();
		actual = p.getResultOfNum(a, b, c, d);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test3Task4()
	{
		int a, b, c, d;
		a = 1;
		b = 0;
		c = 0;
		d = 1;
		
		boolean expected;
		boolean actual;
		
		expected = true;
		
		Task4 p = new Task4();
		actual = p.getResultOfNum(a, b, c, d);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test4Task4()
	{
		int a, b, c, d;
		a = 1222;
		b = 1111;
		c = 1111;
		d = 12222;
		
		boolean expected;
		boolean actual;
		
		expected = true;
		
		Task4 p = new Task4();
		actual = p.getResultOfNum(a, b, c, d);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test5Task4()
	{
		int a, b, c, d;
		a = 111;
		b = 1111;
		c = 1111;
		d = 12222;
		
		boolean expected;
		boolean actual;
		
		expected = false;
		
		Task4 p = new Task4();
		actual = p.getResultOfNum(a, b, c, d);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test6Task4()
	{
		int a, b, c, d;
		a = -1;
		b = 111;
		c = -1110;
		d = 12222;
		
		boolean expected;
		boolean actual;
		
		expected = true;
		
		Task4 p = new Task4();
		actual = p.getResultOfNum(a, b, c, d);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test7Task4()
	{
		int a, b, c, d;
		a = -1;
		b = -111;
		c = -1110;
		d = -12222;
		
		boolean expected;
		boolean actual;
		
		expected = true;
		
		Task4 p = new Task4();
		actual = p.getResultOfNum(a, b, c, d);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test8Task4()
	{
		int a, b, c, d;
		a = -1000001;
		b = -111;
		c = -1111;
		d = -12222;
		
		boolean expected;
		boolean actual;
		
		expected = false;
		
		Task4 p = new Task4();
		actual = p.getResultOfNum(a, b, c, d);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test9Task4()
	{
		int a, b, c, d;
		a = -1000001;
		b = 0;
		c = 0;
		d = 0;
		
		boolean expected;
		boolean actual;
		
		expected = true;
		
		Task4 p = new Task4();
		actual = p.getResultOfNum(a, b, c, d);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test10Task4()
	{
		int a, b, c, d;
		a = 1021212;
		b = 12121212;
		c = 45454545;
		d = 75757575;
		
		boolean expected;
		boolean actual;
		
		expected = true;
		
		Task4 p = new Task4();
		actual = p.getResultOfNum(a, b, c, d);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test11Task4()
	{
		int a, b, c, d;
		a = 102121245;
		b = 12121212;
		c = 45454545;
		d = 75757575;
		
		boolean expected;
		boolean actual;
		
		expected = false;
		
		Task4 p = new Task4();
		actual = p.getResultOfNum(a, b, c, d);
		
		Assert.assertEquals(expected, actual);
	}
}
