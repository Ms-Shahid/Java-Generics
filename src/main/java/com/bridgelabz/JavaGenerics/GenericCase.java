package com.bridgelabz.JavaGenerics;

public class GenericCase{
	
	public <G extends Comparable<G>> G maximum(G x, G y, G z) {
		G max = x;
		if( y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}
	
	public static String testMaximum(String x, String y, String z) {
		String max = x;
		if( y.compareTo(max) > 0 ) {
			max = y;
			System.out.println(max);
		}
		if ( z.compareTo(max) > 0 ) {
			max = z;
			System.out.println(max);
		}
		return max;
	}
	
}
