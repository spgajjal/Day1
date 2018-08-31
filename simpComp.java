package assgnmt2;
import java.util.*;
public class simpComp {
public static void main(String args[])
{
	double a,t,r,sim,com;
	Scanner in =new Scanner(System.in);
	System.out.println("amount");
	a=in.nextDouble();
	System.out.println("time");
	t=in.nextDouble();
	System.out.println("rate");
	r=in.nextDouble();
	sim=(a*t*r)/100;
	com=a*Math.pow(1.0+r/100.01,t)-a;
	System.out.println("SI=" +sim);
	System.out.println("CI= "+com);
}

}
