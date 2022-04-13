package demo;

import java.math.BigInteger;
import java.util.ArrayList;

public class Sequenceofmod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1381411382;
		System.out.println(n);
//		int[] ans=new int[n];
//		int past=0;
//		int present=1;
//		int future=0;
//		ans[0]=0;
//		ans[1]=1;
//		for(int i=2;i<n;i++) {
//			future=(past+present)%3;
//			ans[i]=future;
//			past=present;
//			present=future;
//			
//		}
//		System.out.println(ans[n-1]);
		BigInteger an= new BigInteger(n);
		ArrayList<BigInteger> ans=new ArrayList<BigInteger>();
		BigInteger past= new BigInteger("0");
		BigInteger present= new BigInteger("1");
		BigInteger future= new BigInteger("0");
		for(long i=0;i<n;i++) {
			future=(past.add(present).mod(BigInteger.valueOf(3)));
			ans.add(future);
			past=present;
			present=future;
		}
		System.out.println(ans.get(an));
		
	
		}
		

	}


