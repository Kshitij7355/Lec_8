package Lec8;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int target = s.nextInt();
		System.out.println(Search(arr,target));
		  
	}
	public static int Search(int[]arr,int target) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				hi=mid-1;
			}
			else {
				lo =mid+1;
			}
		}
		return -1;
	}

}
