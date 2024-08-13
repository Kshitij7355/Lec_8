package lec8;

public class Array_Swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {10,20,30,40,50};
		System.out.println(arr[0]+" "+arr[1]);
		Swap(arr);
		System.out.println(arr[0]+" "+arr[1]);
	}
	public static void Swap(int[]arr) {
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}
	

}
