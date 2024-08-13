package L8;

import java.util.Scanner;

public class Trappping_Water {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
	    System.out.println(Trapping(arr));
	}
	public static int Trapping(int[]arr) {
		int n = arr.length;
		int []left=new int[n];
		left[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			left[i]=Math.max(arr[i], left[i-1]);
		}
		int[]right=new int[n];
		right[n-1]=arr[n-1];
		for(int j=arr.length-2;j>=0;j--) {
			right[j]=Math.max(arr[j],right[j+1]);
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=Math.min(left[i], right[i])-arr[i];
		}
		return sum;
	}

}
