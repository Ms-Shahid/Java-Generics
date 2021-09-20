package com.bridgelabz.JavaGenerics;

public class GenericCase{
	
	public Integer toPrint(Integer x, Integer y , Integer z) {
		
		Integer max = x;
		if( y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}
	
	public Float toPrint(Float x, Float y , Float z) {
			
			Float max = x;
			if( y.compareTo(max) > 0)
				max = y;
			if (z.compareTo(max) > 0)
				max = z;
			return max;
		}
}
