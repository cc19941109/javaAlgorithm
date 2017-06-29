package com.chen.algorithm;


/**
 * 为什么能通过方法改变数组？
 * @author chencheng
 *
 */
public class TestArray {
	
	public void f1(int[] a,int b ){
		a[2] =  9999;
		b= 999;
	}
	
	public static void printArray(int[] a){
		for(int i:a){
			System.out.print(i+",");
		}
		System.out.println();
	}
	public static void change(Apple apple){
		apple.setName("i am apple");
	}
	
	public static void main(String[] args) {
	/*	int[] a = {1,2,3};
		int b = 1;
		TestArray testArray  = new TestArray();
		testArray.f1(a,b);
		
		printArray(a);
		System.out.println("b= "+b);
		Apple[] apples = new Apple[]{new Apple()};
		apples[0].getAge();
		System.out.println(apples[0].getAge());
		int[] newarray = new int[-1];*/
		
		Apple apple = new Apple();
		change(apple);
		System.out.println(apple.name);
		
	}
}
