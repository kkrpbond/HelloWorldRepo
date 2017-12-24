package com.learning.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	@BeforeClass //executes once everytime QuickBeforeAfterTest class is run. Used for operations that might have performance significance
	public static void beforeClass(){
		System.out.println("Before Class is executed");
	}
	
	@Before //executes before every test method in this class. So if you have 2 Test, then Before executes 2 times
	public void Setup(){
		System.out.println("Before Test: You can set up Parameters and Resources that are needed for the test");
	}
	
	@Test
	public void test1(){
		System.out.println("Test 1 executed");
	}
	
	@Test
	public void test2(){
		System.out.println("Test 2 executed");
	}
	
	
	@After //executes after every test method in this class. So if you have 2 Test, then After executes 2 times
	public void teardown(){
		System.out.println("Afer Test: you can release resources after every test");
	}
	
	@AfterClass // executes once everytime QuickBeforeAfterTest class is run. Used for operations that might have performance significance
	public static void afterClass(){
		System.out.println("After Class is executed");
	}

}
