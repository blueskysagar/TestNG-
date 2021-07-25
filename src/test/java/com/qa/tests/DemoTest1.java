package com.qa.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {

	@Test
	public void sum() {
		System.out.println("sum");
		
		int a = 10;
		int b = 5;
		Assert.assertEquals(15, a+b);
	}
	@Test
	public void sub() {
		System.out.println("sub");
		
		int a = 10;
		int b = 5;
		Assert.assertEquals(5, a-b);
	}
	@Test
	public void mul() {
		System.out.println("mul");
		
		int a = 10;
		int b = 5;
		Assert.assertEquals(50, a*b);
	}
	@Test
	public void div() {
		System.out.println("div");
		
		int a = 10;
		int b = 5;
		Assert.assertEquals(2, a/b);
	}
	
}
