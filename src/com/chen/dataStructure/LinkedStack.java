package com.chen.dataStructure;

/**
 * 链栈的实现
 * 
 * @author WWX
 * @param <T>
 */
public class LinkedStack<T> {
	// 定义节点数据结构
	private class Node {
		public T data;
		public Node next;

		// 无参构造函数
		public Node() {
		}

		public Node(T data, Node next) {
			this.next = next;
			this.data = data;
		}
	}

	// 栈顶元素
	private Node top;
	// 元素个数
	private int size;

	// 插入数据
	public void push(T element) {
		top = new Node(element, top);
		size++;
	}

	// 出栈操作
	public T pop() {
		Node oldNode = top;
		top = top.next;
		// 释放引用
		oldNode.next = null;
		size--;
		return oldNode.data;
	}

	// 返回栈顶的元素，但不出栈
	public T peek() {
		return top.data;

	}

	// 堆栈长度
	public int length() {
		return size;
	}

	// 判断链栈是否为空栈
	public boolean empty() {
		return size == 0;
	}

	public String toString() {
		// 链栈为空链栈时
		if (empty())
			return "[]";
		else {
			StringBuilder sb = new StringBuilder("[");
			for (Node current = top; current != null; current = current.next) {
				sb.append(current.data.toString() + ", ");
			}
			int len = sb.length();
			return sb.delete(len - 2, len).append("]").toString();

		}
	}

	public static void main(String[] args) {
		LinkedStack<String> stack = new LinkedStack<String>();
		// 不断地入栈
		stack.push("aaaa");
		stack.push("bbbb");
		stack.push("cccc");
		stack.push("dddd");
		System.out.println(stack);
		// 访问栈顶元素
		System.out.println("访问栈顶元素：" + stack.peek());
		// 弹出一个元素
		System.out.println("第一次弹出栈顶元素：" + stack.pop());
		// 再次弹出一个元素
		System.out.println("第二次弹出栈顶元素：" + stack.pop());
		System.out.println("两次pop之后的栈：" + stack);
	}
}
