package assgnmt2;
import java.util.* ;
import java.io.* ;
public class name {
	public static void main(String args[]) throws Exception{
		String arr[]= {"sp","ni","sp","s","m"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.println("Enter name");
		String ser=br.readLine();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{if(arr[i].compareTo(ser)==0)
			count++;
		}
		System.out.println(count);
	}

}
