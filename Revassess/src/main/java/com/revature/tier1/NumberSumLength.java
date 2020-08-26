package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		
		int[]digits= Long.toString(num).chars().map(c -> c-'0').toArray();
		int sum = 0;
		for( int i : digits) {
//		    System.out.println(i);
		}
		
		for( int i : digits) {
		    sum += Math.pow(i, digits.length);
		}
	    System.out.println(sum);

		if (sum == num) {
			return true;
		}
		return false;
	}
}
