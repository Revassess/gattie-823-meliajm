package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {

		int sum = 0;
		if (arr.length>0 && arr!=null) {
				
			for (int i=0; i<arr.length; i++) {
	//			System.out.println(arr[i]);
	
				sum += arr[i];
			}
			System.out.println(sum);
			return sum;
		} else {
			return 0;
		}
	}
}
