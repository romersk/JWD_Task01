package by.training.task06.main;

import org.junit.Test;
import junit.framework.Assert;

public class TestTask6 {

	@SuppressWarnings("static-access")
	@Test
	public void test1Task6()
	{
		int n;
		n = 12324;
		
		String expected;
		String actual;
		
		expected = "3h25m24s";
		
		Task6 p = new Task6();
		actual = p.timeSeconds(n);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test2Task6()
	{
		int n;
		n = 1;
		
		String expected;
		String actual;
		
		expected = "0h0m1s";
		
		Task6 p = new Task6();
		actual = p.timeSeconds(n);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test3Task6()
	{
		int n;
		n = 1000;
		
		String expected;
		String actual;
		
		expected = "0h16m40s";
		
		Task6 p = new Task6();
		actual = p.timeSeconds(n);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test4Task6()
	{
		int n;
		n = 757575;
		
		String expected;
		String actual;
		
		expected = "210h26m15s";
		
		Task6 p = new Task6();
		actual = p.timeSeconds(n);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test5Task6()
	{
		int n;
		n = 757560;
		
		String expected;
		String actual;
		
		expected = "210h26m0s";
		
		Task6 p = new Task6();
		actual = p.timeSeconds(n);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test6Task6()
	{
		int n;
		n = 100000;
		
		String expected;
		String actual;
		
		expected = "27h46m40s";
		
		Task6 p = new Task6();
		actual = p.timeSeconds(n);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test7Task6()
	{
		int n;
		n = 7474722;
		
		String expected;
		String actual;
		
		expected = "2076h18m42s";
		
		Task6 p = new Task6();
		actual = p.timeSeconds(n);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test8Task6()
	{
		int n;
		n = 12;
		
		String expected;
		String actual;
		
		expected = "0h0m12s";
		
		Task6 p = new Task6();
		actual = p.timeSeconds(n);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test9Task6()
	{
		int n;
		n = 3600;
		
		String expected;
		String actual;
		
		expected = "1h0m0s";
		
		Task6 p = new Task6();
		actual = p.timeSeconds(n);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test10Task6()
	{
		int n;
		n = 3601;
		
		String expected;
		String actual;
		
		expected = "1h0m1s";
		
		Task6 p = new Task6();
		actual = p.timeSeconds(n);
		
		Assert.assertEquals(expected, actual);
	}
}
