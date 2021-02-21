package com.project.examples.design.patterns.creational.builder;

public class BuilderPattern {

	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setOs("Android").setScreenSize(5.5).getPhone();
		System.out.println(phone);
	}
	
}
