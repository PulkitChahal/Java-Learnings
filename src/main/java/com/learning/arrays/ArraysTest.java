package com.learning.arrays;

public class ArraysTest {

	public static void main(String[] args) {
		HowToInitializeArray();
		System.out.println("===========================================================================================================================");
		ForEachLoop();
		System.out.println("===========================================================================================================================");
		MethodCallByValueAndReference();
		
	}

	private static void HowToInitializeArray() {
		int[] intVariableArray = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(intVariableArray[5]);

		float[] floatVariableArray = {0.0f,1.0f,2.0f,3.0f,4.0f};	
		System.out.println(floatVariableArray[4]);
	}

	private static void ForEachLoop() {
		String[] stringArray = { "Chaand", "John", "Pooja", "Mia", "Salim" };
		System.out.println(stringArray[2]);
		System.out.println(stringArray[3]);
		System.out.println(stringArray.length);
		System.out.println("******");

		for (int i = 0; i <= stringArray.length - 1; i++) {
			System.out.println(stringArray[i]);
		}
		System.out.println("******");

		// OR
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		System.out.println("******");

		for (String name : stringArray) {
			System.out.println(name);
		}
	}

	private static void MethodCallByValueAndReference () {
		// Call by value
		int value = 10;
		System.out.println("Current value main " + value);
		displayValue(value);
		System.out.println("Current value main " + value);
		System.out.println("*************");

		String[] names = { "Chaand", "John", "Steve", "Pooja", "Rahul" };
		displayNames(names);
		System.out.println("*************");
		System.out.println(names[0]);
	}
	
	private static void displayValue(int value) {
		System.out.println("Current value method " + value);
		value = 20;
		System.out.println("Current value method " + value);

	}

	private static void displayNames(String[] names) {
		names[0] = "Salim";

		for (String name : names) {
			System.out.println(name);
		}
	}

}
