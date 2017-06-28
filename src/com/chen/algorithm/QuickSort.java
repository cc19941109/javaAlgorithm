package com.chen.algorithm;

/**
 * 偶然在Arrays.sort() 发现了快速排序
 * @author chencheng
 *
 */
public class QuickSort {
	
	public static void printArray(int[] a){
		for(int i:a){
			System.out.print(i+",");
		}
		System.out.println();
	}
	
	public int[] part(int[] a,int low,int high){
		int key = a[low];
		while(low<high){
			if(a[high]<key){
				a[low] = a[high];
				printArray(a);
				break;
			}else{
				high--;
			}
		}
		while(high > low){
			if(a[low]>key){
				a[high] = a[low];
				printArray(a);
				break;
			}else{
				low++;
			}
		}
		
		part(a, 0, low);
		part(a, high, a.length-1);
		
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{5,2,6,7,3,9,7,8,1};
		printArray(a);
		
		printArray(new QuickSort().part(a, 0, a.length-1));
	}
}
