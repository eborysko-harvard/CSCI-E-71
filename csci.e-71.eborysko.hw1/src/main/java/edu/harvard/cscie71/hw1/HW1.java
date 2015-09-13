/**
 * 
 */
package edu.harvard.cscie71.hw1;

import org.eclipse.jdt.annotation.NonNull;

/**
 * @author eborysko
 * Homework 1
 */
public class HW1 {
	
	public int sum(int x, int y) {
		// Simply added two ints
		return x + y;
	}
	

	public int sum( @NonNull Integer x,  @NonNull Integer y) {
		// Get int values from Integer then sum()
		return sum(x.intValue(), y.intValue() );
	
	}

}
