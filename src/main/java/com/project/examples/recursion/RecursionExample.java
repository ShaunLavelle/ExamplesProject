package com.project.examples.recursion;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class RecursionExample {
	
	public static void main(String[] args) {
		
		
		calculateExpressions("123", 6);
		
	}
	
	
	private static void calculateExpressions(String digits, int target) {
		
		List<Character> numbers = digits.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
		
//		findExpression(numbers, target)
		
		
		
	}
	
	

}
