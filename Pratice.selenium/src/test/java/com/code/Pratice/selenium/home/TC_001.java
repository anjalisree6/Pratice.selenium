package com.code.Pratice.selenium.home;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_001 {

	
	@BeforeClass
	
	public void login()
	{
		System.out.println("functional");
	}
	
	@Test
	
	public void test()
	{
		System.out.println("non-functional");
	}
	
	@AfterClass
	public void end()
	{
		System.out.println("non-functional");
	}
}
