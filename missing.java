package assgnmt2;

import java.util.Arrays;

public class missing {
public static void main(String args[])
{
	int arr[]=new int[] {1,2,4,5,7,6,8};
	Arrays.sort(arr);
	int i=0,j=arr.length;
	for(int k=0;k<arr.length;k++)
	{
		int l=Arrays.binarySearch(arr,k);
		if(l<0)
		{
			System.out.println(k);
			//break;
			
		}
		else {
			continue;
		}
	}
	
}
}
