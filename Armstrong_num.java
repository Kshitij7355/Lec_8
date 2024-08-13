package lec8;
import java.util.*;
public class Armstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		System.out.println(IS_Armstrong_Number(n));

	}
	public static boolean IS_Armstrong_Number(int n) {
		int d = countofdigit(n);
		int sum = 0;
		int p =n;
		while(n>0) {
			int rem = n%10;
			sum=(int)(sum+Math.pow(rem, d));
			n=n/10;
		}
		if(sum==p) {
			return true;
		}else {
			return false;
		}
	}
	public static int countofdigit(int n) {
		int count =0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}

}
