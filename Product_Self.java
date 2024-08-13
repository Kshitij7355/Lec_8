package L8;

import java.util.Scanner;

public class Product_Self {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		Except(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Except(int[]arr) {
		int n=arr.length;
		int[]left = new int[n];
		left[0]=1;
		for(int i=1;i<arr.length;i++) {
			left[i]=arr[i-1]*left[i-1];
		}
		int[]right=new int[n];
		right[n-1]=1;
		for(int i=n-2;i>=0;i--) {
			right[i]=arr[i+1]*right[i+1];
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=left[i]*right[i];
		}
	}

}
