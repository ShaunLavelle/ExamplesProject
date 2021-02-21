package com.project.examples.design.patterns.creational.builder;

public class Phone {

	private String os;
	private double screenSize;
	private int ram;
	private int battery;
	private String processor;

	public Phone(String os, double screenSize, int ram, int battery, String processor) {
		this.os = os;
		this.screenSize = screenSize;
		this.ram = ram;
		this.battery = battery;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", screenSize=" + screenSize + ", ram=" + ram + ", battery=" + battery
				+ ", processor=" + processor + "]";
	}

}
