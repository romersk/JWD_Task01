package by.training.task01.main;

import org.junit.Assert;
import org.junit.Test;

public class TestTask01 {
	@SuppressWarnings("static-access")
	@Test
	public void test1Task01()
	{
		int num = 0;
		int expected = 0;
		
		Task01 p = new Task01();
		
		int actual;
		actual = p.getLastNum(num);
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test2Task01()
	{
		int num = 1;
		int expected = 1;
		
		Task01 p = new Task01();
		
		int actual;
		actual = p.getLastNum(num);
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test3Task01()
	{
		int num = 999;
		int expected = 1;
		
		Task01 p = new Task01();
		
		int actual;
		actual = p.getLastNum(num);
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test4Task01()
	{
		int num = -145;
		int expected = 5;
		
		Task01 p = new Task01();
		
		int actual;
		actual = p.getLastNum(num);
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test5Task01()
	{
		int num = -12;
		int expected = 4;
		
		Task01 p = new Task01();
		
		int actual;
		actual = p.getLastNum(num);
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test6Task01()
	{
		int num = 43;
		int expected = 9;
		
		Task01 p = new Task01();
		
		int actual;
		actual = p.getLastNum(num);
		
		Assert.assertEquals(expected, actual);
		
	}
}
