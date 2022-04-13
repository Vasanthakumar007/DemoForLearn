package demo;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome ton Hotel\n1.Idli\n2.Dosa\n3.Poori");
		System.out.println("Enter Your Order:");
		Scanner n=new Scanner(System.in);
		int s=n.nextInt();
		switch(s){
		 case 1:
			 idli order1=new idli();
			 order1.order();
			 break;
		 case 2:
			 dosa order2=new dosa();
			 order2.order();
			 break;
		 case 3:
			 poori order3=new poori();
			 order3.order();
			 break;
		}
		
	}

}
 abstract class raw{
	private String floor;
	private String water;
	public void mixing() {
		System.out.println("Floor Ready");
	}
	
 }
 abstract class rawwheat{
		private String wheatfloor;
		private String water;
		public void mixing() {
			System.out.println("wheat Floor Ready");
		}
		
	 }
 class dosa extends raw{
	
	public void order() {
		mixing();
		System.out.println("floor Dosa ready");
	}
 }
 class idli extends raw{
	 public void order() {
		    mixing();
			System.out.println("floor idli ready");
		}
 }
 class poori extends rawwheat{
	 public void order() {
		    mixing();
			System.out.println("wheat puri ready");
		}
 }
