package assgnmt2;

import java.util.Scanner;

public class multi {
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
				int[][] arr=new int[2][2];
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						arr[i][j]=s.nextInt();
						
								}
								
								
					}
				int flag=0;
				System.out.println("Enter value");
				int key=s.nextInt();
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						if(arr[i][j]==key)
						{
							System.out.println("present");
							flag=1;
							break;
						}
					}
				}
				if(flag==0)
					System.out.println("not present");
	}

}
