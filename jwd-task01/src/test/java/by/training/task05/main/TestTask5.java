package by.training.task05.main;

import org.junit.Assert;
import org.junit.Test;

public class TestTask5 {

	@SuppressWarnings("static-access")
	@Test
	public void test1Task5()
	{
		int num;
		num = 123434;
		
		boolean expected;
		boolean actual;
		
		expected = false;
		
		Task5 p = new Task5();
		actual = p.isNumPerfect(num);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test2Task5()
	{
		int num;
		num = 1424;
		
		boolean expected;
		boolean actual;
		
		expected = false;
		
		Task5 p = new Task5();
		actual = p.isNumPerfect(num);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test3Task5()
	{
		int num;
		num = 57442;
		
		boolean expected;
		boolean actual;
		
		expected = false;
		
		Task5 p = new Task5();
		actual = p.isNumPerfect(num);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test4Task5()
	{
		int num;
		num = 7524575;
		
		boolean expected;
		boolean actual;
		
		expected = false;
		
		Task5 p = new Task5();
		actual = p.isNumPerfect(num);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test5Task5()
	{
		int num;
		num = 1;
		
		boolean expected;
		boolean actual;
		
		expected = false;
		
		Task5 p = new Task5();
		actual = p.isNumPerfect(num);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test6Task5()
	{
		int num;
		num = 120000;
		
		boolean expected;
		boolean actual;
		
		expected = false;
		
		Task5 p = new Task5();
		actual = p.isNumPerfect(num);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test7Task5()
	{
		int num;
		num = 87897994;
		
		boolean expected;
		boolean actual;
		
		expected = false;
		
		Task5 p = new Task5();
		actual = p.isNumPerfect(num);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test8Task5()
	{
		int num;
		num = 6;
		
		boolean expected;
		boolean actual;
		
		expected = true;
		
		Task5 p = new Task5();
		actual = p.isNumPerfect(num);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test9Task5()
	{
		int num;
		num = 28;
		
		boolean expected;
		boolean actual;
		
		expected = true;
		
		Task5 p = new Task5();
		actual = p.isNumPerfect(num);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test10Task5()
	{
		int num;
		num = 496;
		
		boolean expected;
		boolean actual;
		
		expected = true;
		
		Task5 p = new Task5();
		actual = p.isNumPerfect(num);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test11Task5()
	{
		int num;
		num = 8128;
		
		boolean expected;
		boolean actual;
		
		expected = true;
		
		Task5 p = new Task5();
		actual = p.isNumPerfect(num);
		
		Assert.assertEquals(expected, actual);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void test12Task5()
	{
		int num;
		num = 33550336;
		
		boolean expected;
		boolean actual;
		
		expected = true;
		
		Task5 p = new Task5();
		actual = p.isNumPerfect(num);
		
		Assert.assertEquals(expected, actual);
	}
	
}
