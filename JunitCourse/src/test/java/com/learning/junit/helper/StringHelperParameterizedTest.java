package com.learning.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	
	StringHelper helper;
	private String input;
	private String expectedOutput;
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection testConditions(){
		String expectedResult [][] = {{"AACD", "CD"}, {"ACD", "D"}, {"CDEF", "CDEF"}, {"CDAA", "CDAA"}};
		return Arrays.asList(expectedResult);	
	}

	@Before
	public void setup(){
		helper = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Positions(){
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

}
