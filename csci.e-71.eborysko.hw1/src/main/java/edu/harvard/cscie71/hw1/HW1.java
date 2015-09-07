/**
 * 
 */
package edu.harvard.cscie71.hw1;

import org.eclipse.jdt.annotation.NonNull;

/**
 * @author eborysko
 *
 */
public class HW1 {
	
	public int sum(int x, int y) {
		
		return x + y;
	}
	

	public int sum( @NonNull Integer x,  @NonNull Integer y) {

		return sum(x.intValue(), y.intValue() );
	
	}

}
