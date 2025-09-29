package javaEx4;
import java.util.Scanner;

public class Comparing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int[]arr1=new int[4];
System.out.println("enter elements of arr1:");
for(int i=0;i<arr1.length;i++)
{
	arr1[i]=sc.nextInt();
}
int[]arr2=new int[4];
System.out.println("enter elements of arr2:");
for(int i=0;i<arr2.length;i++)
{
	arr2[i]=sc.nextInt();
}
//sort both arrays manually
for(int i=0;i<arr1.length;i++)
{
	for(int j=i+1;j<arr1.length;j++)
	{
		if(arr1[i]>arr2[j]) {
			int temp=arr1[i];
			
		}
	}
}

	}

}
