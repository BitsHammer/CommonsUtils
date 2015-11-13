/**
 * 
 */
package test.com.bitshammer.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bitshammer.utils.NumberUtils;

/**
 * All test cases of {@link NumberUtils}
 * functionalities
 * 
 * @author bruno.martins
 *
 */
public class NumberUtilsTest {
	
	@Test
	public void isZeroOrNullCT01ZeroTrue(){
		Double n = 0.0d;
		assertTrue(NumberUtils.isZeroOrNull(n));
	}
	
	@Test
	public void isZeroOrNullCT01NullTrue(){
		Double n = null;
		assertTrue(NumberUtils.isZeroOrNull(n));
	}
	
	@Test
	public void isZeroOrNullCT01ValueFalse(){
		float f = 546f;
		assertFalse(NumberUtils.isZeroOrNull(f));
	}
	
	@Test
	public void getValueOrZeroCT02ValueNull(){
		assertEquals(0, NumberUtils.getValueOrZero(null));
	}
	
	@Test
	public void getValueOrZeroCT02ValueNotNull(){
		assertEquals(56, NumberUtils.getValueOrZero(56));
	}
	
	

}
