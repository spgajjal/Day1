package assgnmt2;
import java.util.*;
public class cui {
	public static void main(String args[]) {
		String userid="spandhana",password="1234";
		Scanner in=new Scanner(System.in);
		int n;
		for(int i=0;i<3;i++)
		{
			System.out.println("username:");
			String user=in.nextLine();
			System.out.println("password");
			String pass=in.nextLine();
			if(user.equals(userid) && pass.equals(password))
			{
				System.out.println("welcome");
				break;
			}
			if(i==2)
			{
				System.out.println("Contact admin");
				break;
			}
			n=i;
			System.out.println("Sorry try again"+ ++n);
		}
		in.close();
	}

}
