package com.chen.algorithm;
/**
 * 6.27  7：30 - 
 * 分治
 * @author chencheng
 *
 */
public class QuickSortNew {
	
	public static  void print(int[] a){
		
		for(int is:a){
			System.out.print(is+",");
		}
		System.out.println();	
	}
	
	public static int part(int[] a,int low ,int high){

		int key = a[low];
		while(low<high){
			while(key<a[high]&&low<high){
				high--;
			}
			a[low] = a[high];
			
			while(key>a[low]&&low<high){
				low++;
			}
			a[high] = a[low];
		}
		print(a);
		return low;
	}
	
	public static void sort(int[] a,int low,int high){
		if(low>high){
			return;
		}
		int index = part(a, low, high);
		sort(a, low, index-1);
		sort(a, index+1, high);
	}
	
	public static void main(String[] args) {
		int[] a = {3,1,4,5,2};
		sort(a, 0, a.length-1);
		
	}
	
	
}
