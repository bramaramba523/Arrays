package Arrays;

public class SecondSmallest {
	
	public static void main(String[] args) {
	int []array= {1,2,3,4,5};
	int first=Integer.MAX_VALUE;
	int second=Integer.MAX_VALUE;
	for(int num:array) {
		if(num<first) {
			second=first;
			first=num;
		}else if( num<second && num!=first){
			second=num;
		}
		
	}
	System.out.println("second smallest"+second);
	}

}
