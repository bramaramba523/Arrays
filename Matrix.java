package javaPackage2;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating two matrices
		int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
		int b[][]= {{4,5,7},{8,9,10},{5,3,4}};
		//creating another matrix to store the sum of matrivces
		int c[][]=new int[3][3];
		//adding and printing the addition of 2 matrices
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j]; //addition
				System.out.print(c[i][j]+" ");
			}
			System.out.println();//new line
				
			}
		}
	}

