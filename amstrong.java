package assgnmt2;
import java.util.Scanner;

public class amstrong {

    public static void main(String[] args) {

        int num, n, temp, total = 0;
        System.out.println("");
        Scanner s= new Scanner(System.in);
        num = s.nextInt();
        s.close();
        n = num;

        for( ;n!=0;n /= 10)
        {
            temp = n % 10;
            total = total + temp*temp*temp;
        }

        if(total == num)
            System.out.println(num + " is a Amstrong number");
        else
            System.out.println(num + " is not an Amstrong number");
    }
}














