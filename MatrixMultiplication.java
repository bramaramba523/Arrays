package javaPackage3;

public class MatrixMultiplication {
//Driver code
	public static void main(String[] args) {
int r1=2,c1=3;
int r2=3,c2=2;
//fr1=c2,//r2=c1
int [][] firstMatrix= {{3,-2,5},{3,0,4}};
int [][] secondMatrix= {{3,1},{3,2},{0,4}};
//multiplying two matrices
int[][] product=new int[r1][c2];//r1=i,c2=j
for(int i=0;i<r1;i++)
{
	for(int j=0;j<c2;j++)
	{
		for(int k=0;k<c1;k++)
		{
			product[i][j]+=firstMatrix[i][k]*secondMatrix[k][j];
	}
		
}
System.out.println("multiplication of 2 matruices is");
for(int[] row:product) {
	for(int column:row) {
		System.out.print(column+"");}
	System.out.println();
	}
}
}
	}


	
