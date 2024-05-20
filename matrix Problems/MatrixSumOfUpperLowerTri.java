package MatrixProblems;

import java.util.Scanner;

public class MatrixSumOfUpperLowerTri {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int n,m,i,j,k,l;
		
		System.out.println("Enter the order of the matrix");
		n=in.nextInt();
		m=in.nextInt();
		
		int[][] a = new int[n][m];
		
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=in.nextInt();
			}
			
		}
		System.out.println("Lower Triangle");
		
		for(i=0;i<n;i++)  // this is for lower triangle
		{
			for(j=0;j<=i;j++)
			{
				
				System.out.print(a[i][j] +" ");	
			}
			System.out.println();
		}
		
		System.out.println("Upper Triangle");
		
		for(i=0;i<n;i++)  // this is for upper triangle
			{
				for(j=i;j<n;j++)
				{
					
					System.out.print(a[i][j] +" ");	
				}
				System.out.println();
			}
	}

}
