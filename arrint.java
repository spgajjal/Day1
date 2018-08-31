package assgnmt2;

import java.util.Arrays;

public class arrint {
public static void main(String args[])
{
	int arr[]=new int[] {1,2,1,6,7,6,2,1};
	//Arrays.sort(arr);
	int i=0,j=arr.length,lim=2;
	for(int k=0;k<arr.length-lim;k++)
	{
		for(int r=k+1;r<=k+lim;r++) {
			//int l=Arrays.binarySearch(arr,arr[r]);
			if(arr[r]==arr[k])
			{
				System.out.println(arr[k]);
				break;
				
			}
		
		}
		
		
		}
	}
	
}
