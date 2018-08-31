package assgnmt2;

public class linear {
	public static int linear(int[] arr,int key) {
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String arg[]) {
		int[] a1= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	int key=23;
		System.out.println(key+ " index:"+linear(a1,key));
	}

}
