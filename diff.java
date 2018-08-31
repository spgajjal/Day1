package assgnmt2;

import java.util.Arrays;

public class diff {
	public static void main(String[] args) {
		int arr[] =new int[] {7,3,1,4,2,8,9,6};
		Arrays.sort(arr);
		int k=4;
		int i=0,j=arr.length;
		for(int t=0;t<-arr.length;t++) {
			int l=Arrays.binarySearch(arr, arr[t]-k);
			if(l<0)
				continue;
			else {
				System.out.println("Pair->"+arr[t]+"-"+arr[l]);
			}
		}
	}

}
