package Lec8;

import java.util.Scanner;

public class First_Bad_Version {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		

	}
    public static int Bad(int n) {
    	int lo =1;
    	int hi=n;
    	int ans=0;
    	while(lo<=hi) {
    		int mid=(lo+(hi-lo))/2;
    		if(isBadVersion(mid)==true) {
    			ans=mid;
    			hi=mid-1;
    		}
    		else {
    			lo =mid+1;
    		}
    	}
    	return ans;
    }
	private static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
