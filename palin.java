package assgnmt1;
import java.util.*;
public class palin {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Input");
		int num=in.nextInt();
		int revint=0,rem;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			revint=(revint*10)+rem;
			num=num/10;
		}
		System.out.println("Output");
		if(temp==revint)
			System.out.println("true");
		else 
			System.out.println("false");

	}

}
