package Lec8;

public class xth_root {

	public static void main(String[] args) {
	         
      int n =87;
      int k =3;
      
      int lo =1;
      int hi =87;
      int ans=0;
      while(lo<=hi) {
    	  int mid=(lo+hi)/2;
    	  if(Math.pow(mid,k)<=n) {
    		  ans=mid;
    		  lo=mid+1;
    	  }
    	  else {
    		  hi = mid-1;
    	  }
      }
      System.out.println(ans  );
      
	}

}
