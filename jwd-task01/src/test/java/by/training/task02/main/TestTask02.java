package by.training.task02.main;

import org.junit.Test;
import junit.framework.Assert;

public class TestTask02 {

	@SuppressWarnings("static-access")
	@Test
	public void test1Task02()
	{
		int month = 12;
		int year = 2000;
		
		int expected = 31;
		int actual;
		
		Task02 p = new Task02();
		actual = p.getDaysInMonth(month, year);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test2Task02()
	{
		int month = 11;
		int year = 2020;
		
		int expected = 30;
		int actual;
		
		Task02 p = new Task02();
		actual = p.getDaysInMonth(month, year);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test3Task02()
	{
		int month = 2;
		int year = 2000;
		
		int expected = 29;
		int actual;
		
		Task02 p = new Task02();
		actual = p.getDaysInMonth(month, year);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test4Task02()
	{
		int month = 2;
		int year = 2001;
		
		int expected = 28;
		int actual;
		
		Task02 p = new Task02();
		actual = p.getDaysInMonth(month, year);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test5Task02()
	{
		int month = 1;
		int year = 200;
		
		int expected = 31;
		int actual;
		
		Task02 p = new Task02();
		actual = p.getDaysInMonth(month, year);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test6Task02()
	{
		int month = 8;
		int year = 1999;
		
		int expected = 31;
		int actual;
		
		Task02 p = new Task02();
		actual = p.getDaysInMonth(month, year);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test7Task02()
	{
		int month = 5;
		int year = 2004;
		
		int expected = 31;
		int actual;
		
		Task02 p = new Task02();
		actual = p.getDaysInMonth(month, year);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test8Task02()
	{
		int month = 9;
		int year = 2040;
		
		int expected = 30;
		int actual;
		
		Task02 p = new Task02();
		actual = p.getDaysInMonth(month, year);
		
		Assert.assertEquals(expected, actual);
	}
}
