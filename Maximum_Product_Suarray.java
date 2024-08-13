package Lec8;

public class Maximum_Product_Suarray {

	public static void main(String[] args) {
		int[]arr= {-2,0,-1};
		System.out.println(Product(arr));

	}
	public static int Product(int[]arr) {
		int ans=Integer.MIN_VALUE;
		int rightmax=1;
		int leftmax=1;
		for(int i=0;i<arr.length;i++) {
			if(leftmax==0) {
				leftmax=1;
			}
			if(rightmax==0) {
				rightmax=1;
			}
			leftmax*=arr[i];
			rightmax*=arr[arr.length-1-i];
			ans=Math.max(ans, Math.max(leftmax, rightmax));
		}
		return ans;
	}

}
