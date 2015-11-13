package com.bitshammer.utils;

/**
 * This class will provide some methods
 * to use on any object that is children
 * from {@link Number} class
 * 
 * @author bruno.martins
 *
 */
public class NumberUtils {
	
	/**
	 * Verify if a giver {@link Number} has a Zero
	 * value, or is null
	 * 
	 * @param n The given number
	 * @return <code>true</code> if Zero or Null, <code>false</code> otherwise
	 */
	public static boolean isZeroOrNull(Number n){
		if(n == null){
			return true;
		}
		
		byte byteValue = n.byteValue();
		if(byteValue == 0){
			return true;
		} else{
			return false;			
		}
	}
	
	/**
	 * Get the value of a Number. If this number is
	 * <code>null</code>, then, the return will be Zero.
	 * 
	 * @param n The giver {@link Number}
	 * @return 0, or the value
	 */
	public static Number getValueOrZero(Number n){
		if(n == null){
			return 0;
		} else {
			return n;
		}
	}

}
