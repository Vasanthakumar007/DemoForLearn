package demo;

import java.util.Arrays;

public class TryingSearch {
	public int checker(int key,int b[],int first,int last) {
		int mid=(first+last)/2;
		while (first<=last) {
			if(b[mid]==key) {
				System.out.println("index is: "+ mid);
				break;
			}else if(b[mid]<key) {
				first=mid+1;
			}else if(b[mid]>key) {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
	return mid;	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryingSearch obj=new TryingSearch();
		int[] a= {0,323,567,34,23,78,45,76};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
 		System.out.println(obj.checker(78, a, 0, a.length-1));
		

	}

}
