package com.learning.junit.helper;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper;
	
	@Before
	public void Setup(){
		helper = new StringHelper();
	}
	

	/*--------- Testing truncateAInFirst2Positions() method. 
	 * Test Cases: //AACD ==> CD; ACD ==> CD;  CDEF ==> CDEF; CDAA ==> CDAA;
	 */
	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Pos() {
		//fail("Not yet implemented");
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD")); // ExpectedValue ActualValue
		
	}
	
	
	@Test
	public void testTruncateAInFirst2Positions_AInFirstPos(){
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions_NoA(){
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AInLast2Pos(){
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
	
	/*--------- Testing areFirstAndLastTwoCharactersTheSame() method. 
	 * Test Cases: ABCD ==> false; ABAB ==> true; AB ==> true; A ==> false;
	 */
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegScenario(){
		//assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPosScenario(){
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_SpecialPosScenario(){
		assertTrue("SpecialPosScenario failed", helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_SpecialNegScenario(){
		assertFalse("SpecialNegScenario failed", helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	

}
