package demo;

import java.util.Arrays;

public class Tribanoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] s= {1,1,1};
		int n=10;
		double ans[]=new double[n];
		for(int i=0;i<s.length;i++) {
			ans[i]=s[i];
		}
		System.out.println(Arrays.toString(ans));
		for(int i=3;i<n;i++) {
			ans[i]=ans[i-1]+ans[i-2]+ans[i-3];
		}
//       for(int i=0;i<ans.length;i++) {
//    	   System.out.println(ans[i]);
//       }
		System.out.println(Arrays.toString(ans));
	}

}
