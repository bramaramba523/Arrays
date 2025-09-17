package Arrays;

public class ArrayNormal {

	public static void main(String []args) {
		int[]arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" elements are : "+arr[i]);
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		System.out.println(sum);
	}
}
