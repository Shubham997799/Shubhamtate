import java.util.*;

class Matrix
{
		public static void main(String ar[])
		{
					int m,n,i,j;
					Scanner sc = new Scanner(System.in);
					System.out.println("enter m  and n");
					m = sc.nextInt();					
					n = sc.nextInt();
						
					int a[][] = new int[m][n];
					int b[][] = new int[m][n];
					int c[][] = new int[m][n];

					System.out.println("enter first matrix");
					for(i=0;i<m;i++)
					{
							for(j=0;j<n;j++)
							{
									a[i][j] = sc.nextInt();
							}
					}
					System.out.println("enter second matrix");
					for(i=0;i<m;i++)
					{
							for(j=0;j<n;j++)
							{
									b[i][j] = sc.nextInt();
							}
					}	
					System.out.println("Display first Matrix");
					for(i=0;i<m;i++)
					{
							for(j=0;j<n;j++)
							{
									System.out.print(a[i][j]+ "   ");
							}
							System.out.println();
					}
					System.out.println("Display second Matrix");
					for(i=0;i<m;i++)
					{
							for(j=0;j<n;j++)
							{
									System.out.print(b[i][j]+ "   ");
							}
							System.out.println();
					}
					for(i=0;i<m;i++)
					{
							for(j=0;j<n;j++)
							{
									c[i][j] = a[i][j] + b[i][j];
							}
					}
					System.out.println("Display Addition Matrix");
					for(i=0;i<m;i++)
					{
							for(j=0;j<n;j++)
							{
									System.out.print(c[i][j]+ "   ");
							}
							System.out.println();
					}
					
		}
}
