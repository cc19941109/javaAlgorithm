package com.chen.order;

public class BubbleSort {

	private static void replace(int[] a, int first, int next) {
		int key = a[first];
		a[first] = a[next];
		a[next] = key;
	}

	public int[] bubbleSort(int[] a) {
		int length = a.length;
		for (int j = length - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (a[i] < a[i + 1]) {
					replace(a, i, i + 1);
					printArray(a);
				}
			}
		}
		return a;
	}

	public void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = { 2, 6, 3, 8, 4, 6, 9, 1 };
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(a);

	}
}
