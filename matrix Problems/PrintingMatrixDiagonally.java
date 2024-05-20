package MatrixProblems;

import java.util.Scanner;

public class PrintingMatrixDiagonally {

	public static void main(String[] args) {
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
		
		//Printing matrix diagonally
		for(k=0;k<n;k++)
		{
			i=k;
			j=0;
			while(i>=0)
			{
				System.out.print(a[i][j] + " ");
				i--;
				j++;
				
			}
			System.out.println();
		}
		for(k=1;k<=m-1;k++)  //column m 
		{
			i=n-1;  //row n
			j=k;
			while(j<n)
			{
				System.out.print(a[i][j] + " ");
				i--;
				j++;
			}
			System.out.println();
		}
	}
		
		
		
		

}
