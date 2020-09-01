package com.number;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(40);
		
		System.out.println(Number.sum(nums));
	}

}
