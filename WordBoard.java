package demo;

import java.util.Arrays;
import java.util.Scanner;

public class WordBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String w1="vasanth";
//		String w2="venkat";
//		String w3="Ramana";
//		String w4="harish";
//		String w5="jkumar";
//		int lnum=7;
//		String[]w1a=w1.split("");
//		String[]w2a=w2.split("");
//		String[]w3a=w3.split("");
//		String[]w4a=w4.split("");
//		String[]w5a=w5.split("");
//		String[][] ans=new String[lnum][lnum];
//		for(int i=0;i<lnum;i++) {
//			ans[0][i]=w1a[i];
//		}
//		for(int j=0;j<lnum;j++) {
//			for(int k=0;k<lnum;k++) {
//				System.out.print(ans[j][k]);
//			}
//			System.out.println();
//		}
//		System.out.println(Arrays.toString(w1a));
//		System.out.println(Arrays.toString(w2a));
//		System.out.println(Arrays.toString(w3a));
//		System.out.println(Arrays.toString(w4a));
//		System.out.println(Arrays.toString(w5a));
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Five words: ");
		String a=inp.nextLine();
		String b=inp.nextLine();
		String c=inp.nextLine();
		String d=inp.nextLine();
		String e=inp.nextLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("Find the above words:");
		
		int lo=7;
		int lo1 = lo+lo;
		//Random value ----------------
		String[][] x=new String[lo1][lo1];
		for(int j=0;j<lo1;j++) {
			for(int k=0;k<lo1;k++) {
				int num=(int)(Math.random()*26)+97;
				char temp=(char)num;
				x[j][k]=String.valueOf(temp)+" ";
				}
		}
		//word inserting----------------
		int rand1=(int) (Math.random()*lo1/2);
//		System.out.println(rand1);
		for(int i=0;i<c.length();i++) {
			String s=c.substring(i,i+1);
			x[rand1+i][rand1+i+1]=s+ " ";
		}
		rand1=(int) (Math.random()*lo1/2);
		for(int i=0;i<b.length();i++) {
			String s=b.substring(i,i+1);
			x[rand1+i+1][0]=s+ " ";
		}
//		System.out.println(rand1);
		
		
		rand1=(int) (Math.random()*lo1/2);
		for(int i=0;i<a.length();i++) {
			String s=a.substring(i,i+1);
			x[0][rand1+i+1]=s+ " ";
		}
//		System.out.println(rand1);

		rand1=(int) (Math.random()*lo1/2);
		for(int i=0;i<d.length();i++) {
			String s=d.substring(i,i+1);
			x[rand1+i+2][2]=s+ " ";
		}
//		System.out.println(rand1);
		
		
		rand1=(int) (Math.random()*lo1/2);
		for(int i=0;i<e.length();i++) {
			String s=e.substring(i,i+1);
			x[2][rand1+i+5]=s+ " ";
		}
//		System.out.println(rand1);
		
		//Printing array----------------------------
		for(int j=0;j<lo1;j++) {
			for(int k=0;k<lo1;k++) {
				System.out.print(x[j][k]);
			}
			System.out.println();
		}
		
		
		

	}

}
