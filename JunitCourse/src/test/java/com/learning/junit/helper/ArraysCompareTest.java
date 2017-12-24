package com.learning.junit.helper;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ArraysCompareTest {
	
	ArraysCompare arr;
	
	@Before
	public void setup(){
		arr = new ArraysCompare();
	}
	
	
	@Test
	public void testArraySort_RandomArray(){
		int [] actual= { 1,5,2,7,4};
		int [] expected= { 1,2,4,5,7};
		assertArrayEquals(expected, arr.ArraySort(actual));
	}
	
	/*
	@Test
	public void testArraySort_NullArray(){
		int[] actual = null;
		try{
			arr.ArraySort(actual);
		}
		catch(NullPointerException ex){
			
		} 
	*/
		
	@Test (expected = NullPointerException.class) //This method will throw NullPointerException. Hence the test will pass
	public void testArraySort_NullArray(){
		int[] actual = null;
		arr.ArraySort(actual);
	}
	
	@Test (expected = NullPointerException.class) //This method will not throw NullPointerException. Hence the test will fail
	public void testArraySort_EmptyArray(){
		int[] actual = {};
		arr.ArraySort(actual);
	}
	
	@Test(timeout =100) // This method check whether its execution is performed within 100 miliseconds
	public void testArraySort_Performance(){
		int[] numbers = {23,5,1,7,9};
		for (int i=1; i<1000000; i++){
			numbers[0] = i;
			arr.ArraySort(numbers);
		}
	}
	

}
