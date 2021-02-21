package com.project.examples.predicates;

import java.util.Arrays;

public class PredicateExamples {

	public static void main(String[] args) {

		int[] nums = { 2, 3, 1, 5, 6, 7, 8, 9, 12 };

		Arrays.stream(nums).filter(n -> n > 5).forEach(System.out::println);
	}
}
