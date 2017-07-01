package com.chen.performance;

import java.util.LinkedList;

public class PerStringBuilderTest {
	public static void main(String[] args) {
		String aString = "a";
		String bString = "b";
		String string = "";
		int cap = 100000;
		long start = System.currentTimeMillis();
		for (int i = 0; i < cap; i++) {
			string = aString + string;
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);

		StringBuilder a = new StringBuilder("a");
		StringBuilder c =new StringBuilder();
		
		long start2= System.currentTimeMillis();
		for (int i = 0; i < cap; i++) {
			c = c.append(a);
		}
		long end2 = System.currentTimeMillis();
		System.out.println(end2 - start2);

	}
}
