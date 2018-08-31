package assgnmt2;

import java.util.Scanner;

public class incometax {
	public static void main(String args[]) {
		double amt, tax=0;
		Scanner in =new Scanner(System.in);
		amt=in.nextDouble();
		if(amt>=0 && amt<=180000)
			System.out.println("Nil");
		else if(amt>=181001 && amt<=300000)
		{	tax=amt*0.1;
		System.out.println(" tax=" +tax);
		}
		else if(amt>=300000 && amt<=500000)
		{	tax=amt*0.2;
		System.out.println(" tax=" +tax);
		}
		else if(amt>=500000 && amt<=1000000)
		{	tax=amt*0.3;
		System.out.println(" tax=" +tax);
		}
		
		
	}

}
