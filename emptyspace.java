package assgnmt2;
import java.io.*;
public class emptyspace {
	public static void main(String args[]) throws Exception{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the sentence");
	String str=br.readLine();
	String res="";
	int i;
	for(  i=0;i<str.length()-1;i++) {
		if(str.charAt(i)==str.charAt(i+1)&&str.charAt(i)==' ');
		
			
		
		else
		{
			res=res+str.charAt(i);
			
		}
	}
	
		res=res+str.charAt(i);
		str=res;
		res="";
		System.out.println("Enter the word to be deleted");
		String word=br.readLine();
		System.out.println("");
		System.out.println("Enter the position to be deleted");
		int pos=Integer.parseInt(br.readLine());
		int ct=0;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				ct++;
				if(ct==(pos-1))
				{
					res=str.substring(0, i+1) + str.substring(i+2+word.length());
				}
			}
		}
		
		System.out.println(res);}
	}

	
	


