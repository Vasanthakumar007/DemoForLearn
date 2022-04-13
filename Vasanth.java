package demo;

import java.util.Arrays;

public class Vasanth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=46288;
		long z=n;
		long mult=5;
		int x=0;
		String s=String.valueOf(n);
	    long[] num= new long[s.length()];
	    long[] number= new long[s.length()];
	    for(int i=0;i<s.length();i++) {
	      num[i]=n%10;
	      n=n/10;
	    }
	    for(int i=num.length-1;i>=0;i--) {
	    	number[x]=num[i];
	    	x++;
	    }
//        System.out.println(number[0]+" " + " "+number[1]);
        for(int k=0;k<num.length;k++) {
        	num[k]=(int) Math.pow(number[k], mult);
        	mult++;
        }
        long ans=0;
        for(long j:num) {
        	ans+=j;
        }
        System.out.println(ans);
        long temp=ans/z;
         if(temp*z==ans) {
        	 System.out.println(temp);
         }else {
        	 System.out.println(-1);
         }
	}

}

