package Lec8;

import java.util.Scanner;

public class Best_Time_To_Bu_Stock {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr  = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(Profit(arr));

	}
	public static int Profit(int[]arr) {
		int minfar=arr[0];
		int maxprofit=0;
		for (int i = 0; i < arr.length; i++) {
			minfar=Math.min(minfar, arr[i]);
			int profit=arr[i]-minfar;
			maxprofit=Math.max(maxprofit, profit);
		}
		return maxprofit;
	}

}
