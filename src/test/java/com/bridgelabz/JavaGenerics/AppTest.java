package com.bridgelabz.JavaGenerics;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void maximumValue() {
    	int result1 = GenericCase.toPrint(5, 4, 3);
    	int result2 = GenericCase.toPrint(5, 10, 3);
    	int result3 = GenericCase.toPrint(5, 4, 9);
    	assertEquals(5,result1);
    	assertEquals(10,result2);
    	assertEquals(9,result3);
    }
}
