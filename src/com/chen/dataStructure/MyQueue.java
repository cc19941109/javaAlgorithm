package com.chen.dataStructure;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("a");
		queue.add("b");
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		

	}
}
