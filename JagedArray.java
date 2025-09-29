package javaPackage;

public class JagedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System .out.println("enter the number of arrays");
//[] []//1.row,2.column
int[][]jag=new int[3][];//3 rows but columns not defined
jag[0]=new int[] {1,2,3};
jag[1]=new int[] {4,5};
jag[2]=new int[] {6,7,8,9};
for(int i=0;i<jag.length;i++)//i-row
{
	//j-based i due to jagged array
	for(int j=0;j<jag.length;j++) {
		//j-columns
	System.out.print(jag[i][j]+ " " );}
	System.out.println();
	
}
	}

}
