package assgnmt2;
import java.util.*;
import java.io.*;

public class palindromerange {
	public static void main(String arg[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inp[]=new String[10];
		String palin[]=new String[10];
		String rev="";
		int count=0;
		int k=0;
		for(int i=0;i<10;i++)
		{
			inp[i]=br.readLine();
			k++;
		}
		for(int i=0;i<k;i++)
		{
			for(int j=inp[i].length()-1;j>=0;j--)
			{
				rev+=inp[i].charAt(j);
			}
			if(inp[i].equals(rev)==true)
			{
				palin[count]=inp[i];
				count++;
			}
			rev="";
		}for(int i=0;i<count;i++)
			System.out.println(palin[i]);
		
	
	int n=count;
	String swap="" ;
	for(int c=0;c<(n-1);c++) {
		for(int d=0;d<n-c-1;d++) {
			if(palin[d].length()<palin[d+1].length())
			{
				swap = palin[d];
				palin[d] =palin[d+1];
				palin[d+1]=swap;
			}
		}
	}
for(int i=0;i<count;i++)
{
	System.out.println(palin[i]);
}

}
}
