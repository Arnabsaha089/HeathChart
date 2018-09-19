package com.cg.test;

import org.junit.Assert;
import org.junit.Test;




import com.cg.demo.MaveenSampleDemo.Calculator;

public class TestCalculator {
	
	@Test
	public void test_add()
	{
		Calculator c=new Calculator();
		int res=c.add(3,4);
		Assert.assertEquals(7, res);
	}
	

	@Test
	public void test_sub()
	{
		Calculator c=new Calculator();
		int res=c.substract(10,5);
		Assert.assertEquals(5, res);
	}
		
	@Test
	public void test_mul()
	{
		Calculator c=new Calculator();
		int res=c.multiply(10,5);
		Assert.assertEquals(50, res);
	}
	
	@Test
	public void test_sq()
	{
		Calculator c=new Calculator();
		int res=c.calcSquare(10);
		Assert.assertEquals(100, res);
	}
}
