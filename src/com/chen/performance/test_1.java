package com.chen.performance;

import java.util.Arrays;
import java.util.Hashtable;

public class test_1 {

	public static void main(String[] args) {
		test_1 hello = new test_1();// 创建对象
		int[] scores = { 89, -23, 64, 91, 119, 52, 73 };// 定义数组
		System.out.println("输出前三名的成绩：");
		hello.showtop3(scores);
	}

	public void showtop3(int[] scores) {
		Arrays.sort(scores);
		int num = 0;
		for (int i = scores.length - 1; i > 0; i--) {
			System.out.println(scores[i]);
			num++;
			while (num == 3) {
				break;
			}
		}

	}

}
