package com.bridgelabz.JavaGenerics;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest 
{
	GenericCase genericCase = new GenericCase();
	
    @Test
    public void maximumValue() {
    	int result1 = genericCase.maximum(5, 4, 3);
    	int result2 = genericCase.maximum(5, 10, 3);
    	int result3 = genericCase.maximum(5, 4, 9);
    	assertEquals(5,result1);
    	assertEquals(10,result2);
    	assertEquals(9,result3);
    }
    
    private static final double DELTA = 1e-15;
    
	@Test
    public void maximumFloatValue() {
		float test1 = genericCase.maximum(3.05f, 2.5f, 2.45f);
    	float test2 = genericCase.maximum(2.45f, 3.05f, 2.5f);
    	float test3 = genericCase.maximum(2.45f, 2.5f, 3.05f);
    	assertEquals(3.05f, test1, DELTA);
    	assertEquals(3.05f, test2, DELTA);
    	assertEquals(3.05f, test3, DELTA);
    }
	
	@Test
	public void maximumString() {
		String xStr = "Banana", yStr = "Apple" , zStr = "Peach";
		String test1 = GenericCase.testMaximum(xStr,yStr,zStr);
		String test2 = GenericCase.testMaximum(yStr,xStr,zStr);
		String test3 = GenericCase.testMaximum(zStr,yStr,xStr);
		assertEquals(xStr,test1);
		assertEquals(xStr,test2);
		assertEquals(xStr,test3);
	}
}
