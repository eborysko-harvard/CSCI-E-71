/**
 * 
 */
package edu.harvard.cscie71.hw1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author eborysko
 *
 */
public class TestHW1 {
	
	HW1 tester;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		tester = new HW1();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
		tester = null;
	}

	/**
	 * Test method for {@link edu.harvard.cscie71.hw1.HW1#sum(int, int)}.
	 */
	@Test
	public void testSumIntInt() {
		
		assertEquals("0 + 0 = 0", 0, tester.sum(0, 0) );
		assertEquals("1 + 0 = 1", 1, tester.sum(1, 0) );
		assertEquals("2 + 1 = 3", 3, tester.sum(2, 1) );
		assertEquals("4 + 3 = 7", 7, tester.sum(4, 3) );
		
		assertEquals("4 + -7 = -3", -3, tester.sum(4, -7) );
	}

	/**
	 * Test method for {@link edu.harvard.cscie71.hw1.HW1#sum(java.lang.Integer, java.lang.Integer)}.
	 */
	@Test
	public void testSumIntegerInteger() {
		
		assertEquals("0 + 0 = 0", 0, tester.sum(new Integer(0), new Integer(0)) );
		assertEquals("0 + 1 = 1", 1, tester.sum(new Integer(0), new Integer(1)) );
		assertEquals("1 + 2 = 3", 3, tester.sum(new Integer(1), new Integer(2)) );
		assertEquals("3 + 4 = 7", 7, tester.sum(new Integer(3), new Integer(4)) );
		
		assertEquals("4 + -7 = -3", -3, tester.sum(new Integer(4), new Integer(-7)) );
		assertEquals("-3 + -7 = -10", -10, tester.sum(new Integer(-3), new Integer(-7)) );
		
	}

}
