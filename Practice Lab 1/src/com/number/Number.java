package com.number;
import java.util.ArrayList;

public class Number {
	
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		static int sum(ArrayList<Integer> nums) {
			int sum = 0;
			for(Integer e : nums) {
				sum += e;
			}
			
			return sum;
		}
}