package Arrays;// array length

import java.util.Scanner;

public class PrintArray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int a=sc.nextInt();
		int[]array=new int[a];
		for(int i=0;i<a;i++) {
			System.out.println("enter the element"+i);
			array[i]=sc.nextInt();
			
		}
		for(int i=0;i<a;i++) {
			System.out.println(array[i]);
		}
		
}
	
}
