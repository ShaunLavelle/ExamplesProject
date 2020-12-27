package com.project.examples.interfaces;

// A Functional interface is an interface with only 1 abstract unimplemented method.
@FunctionalInterface
public interface FunctionalInterfaceExample {

	// Unimplemented abstract method
	public void method1();

	default void method2() {
		System.out.println("default method");
	}

	public static void method3() {
		System.out.println("static method");
	}

	// As of Java 9, functional interfaces can now have private methods.
	// Thanks to this we gain more flexibility in exposing only intended methods to
	// API users and can avoid code duplication in default methods.
	private Long method4() {
		return 1L;
	}

}
