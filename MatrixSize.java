package javaPackage4;

import java.util.Scanner;

public class MatrixSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of an array");
int size=sc.nextInt();//size=3
int arr1=new int[size];//3
int arr2=new int[size];//3
//input
for(int i=0;i<size;i++) {
	System.out.print((i+1))+". element first array");
	int value1=sc.nextInt();
	arr1[i]=value1;
	
}
for(int i=0;i<size;i++)
{
	System.out.print((i+1))+". element second array");
	int value2=sc.nextInt();
	arr1[i]=value2;
}
//output
System.out.println("--OUTPUT--");
for(int i=0;i<size;i++)
{
	System.out.print((arr1[i]+arr2[j]);
	
}
	}
}


}
