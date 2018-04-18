package com.custom.multikey.map;

import java.util.Map;

public class Main {

	private static Map<ExampleKey, String> SOMETHING = new MultiKeyMap<>();

	public static void main(String[] args) {

		SOMETHING.put(new ExampleKey(1L, "test1"), "Hello");
		SOMETHING.put(new ExampleKey(2L, "test2"), "Dear");
		SOMETHING.put(new ExampleKey(3L, "test3"), "Friend");
		SOMETHING.put(new ExampleKey(4L, "test4"), "Please");
		SOMETHING.put(new ExampleKey(5L, "test5"), "Come");
		SOMETHING.put(new ExampleKey(6L, "test6"), "In");

		System.out.println(SOMETHING.get(new ExampleKey("test1")));
		System.out.println(SOMETHING.get(new ExampleKey(1L)));
		System.out.println(SOMETHING.get(new ExampleKey(2L, "test2")));
		System.out.println(SOMETHING.get(new ExampleKey(1L, "test3"))); // Precedence on first declared variable
		System.out.println(SOMETHING.get(new ExampleKey(4L)));
		System.out.println(SOMETHING.get(new ExampleKey("never")));
	}

}
