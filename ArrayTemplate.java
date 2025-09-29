package pack12;
import java.util.Scanner;

//type[] arrayName;
int[] a1;
//int[] arrayName=new int[s];
public class ArrayTemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the nuber of elemenets");
int n=sc.nextInt();
int[] arr=new int[n];//array initialize
//input
System.out.println("enter"+n+"elements");
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
//print or output
for(int i=0;i<=n;i++)
{
	System.out.println("the array elements are");
	System.out.println(arr[i]+"");
}sc.close();
	}

}


