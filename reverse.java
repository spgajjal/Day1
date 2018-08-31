package assgnmt1;
import java.util.*;
import java.io.*;
public class reverse 
{
	public static void main(String args[]) throws IOException 
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp =br.readLine();
		String words[]=inp.split(" ");
		String fin="";
		for(int i=0;i<words.length;i++)
		{
		String reverse ="";
		for(int j=words[i].length()-1;j>=0;j--)
		{
			reverse+=words[i].charAt(j);
		}
		fin+=reverse+" ";
		}
		System.out.print(fin);
		
	}

}
