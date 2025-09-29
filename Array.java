package javaEx4;

import java.util.Scanner;

public class Array {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	//ask user for array size
	System.out.print("enter the number of elements: ");
	int n=s.nextInt();
	int[] arr=new int[n];
	//read array elements
	System.out.println("enter "+n+"elements:");
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	//print or output
	for(int i=0;i<n;i++)
	{
		System.out.println("the array elements are");
		System.out.println(arr[i]+"");
		s.close();
	}

//replace
System.out.println("enyter the keyindex(1-2) you want to replace");
int index=s.nextInt();
if(index<0 ||index>=arr.length)
{
	System.out.println("invalid index");
}
else
{
	System.out.println("enter the replace value");
	int replaceNum=s.nextInt();
		arr[index]=replaceNum;//replaceNum=number
	}


System.out.println("updated array");
for(int number:arr) {
	System.out.println(number+"");
}

}
}