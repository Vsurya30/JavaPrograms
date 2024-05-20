package MatrixProblems;

import java.util.Scanner;

public class Sorting2dArray {
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
//		for(i=0;i<n;i++)
//		{
//			for(j=0;j<m;j++)
//			{
//				System.out.print(a[i][j] +" ");	
//			}
//			System.out.println();
//		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				for(k=0;k<n;k++)
				{
					for(l=0;l<m;l++)
					{
						if(a[i][j]<a[k][l])
						{
							int temp=a[i][j];
							a[i][j]=a[k][l];
							a[k][l]=temp;
						}
					}
					
				}
			}
			
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(a[i][j] +" ");	
			}
			System.out.println();
		}
		
	}
}
