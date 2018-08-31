package assgnmt2;
import java.util.*;
import java.util.Scanner; 
public class avgmarks {
	public static void main(String args[]) {
		int num[][] = new int[3][3];
		int s1=0,s2=0,s3=0,a1=0,a2=0,a3=0;
		int sa1=0,sa2=0,sa3=0,avg1=0,avg2=0,avg3=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				num[i][j]=in.nextInt();
			}
		}
		for(int j=0;j<3;j++)
		{
			s1 =s1+num[0][j];
			s2 =s2+num[1][j];
			s3 =s3+num[2][j];
			a1=s1/3;
			a2=s2/3;
			a3=s3/3;
		}
			System.out.println("score of s1  " +s1);
			System.out.println("avg of s1  " +a1);
			System.out.println("score of s2 " +s2);
			System.out.println("avg of s2  " +a2);
			System.out.println("score of s3 " +s3);
			System.out.println("avg of s3 " +a3);
			for(int i=0;i<3;i++)
			{
				sa1 =sa1+num[i][0];
				sa2 =sa2+num[i][1];
				sa3 =sa3+num[i][2];
				avg1=sa1/3;
				avg2=sa2/3;
				avg3=sa3/3;
			}
				System.out.println("score of sa1 " +sa1);
				System.out.println("avg of sa1 " +avg1);
				System.out.println("score of sa2 " +sa2);
				System.out.println("avg of sa2 " +avg2);
				System.out.println("score of sa3 " +sa3);
				System.out.println("avg of sa3 " +avg3);
				
			}
		}
	

	
