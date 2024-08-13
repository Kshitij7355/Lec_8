package Lec8;

import java.util.Scanner;

public class Move_Zeros {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		Move(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Move(int[]arr) {
		int i=0;
		int j=0;
		while(i<arr.length && j<arr.length) {
			if(arr[j]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j++;
			}
			else {
				j++;
			}
		}
	}

}
