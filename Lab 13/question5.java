package lab11e;

import java.util.Arrays;

public class question5 {
	public static int tl(int arr[]) {
		
		for(int i=0;i<arr.length;i++)
			for(int j=i;j<arr.length;j++) {
				if (arr[i] < arr[j]) {
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
			} 
		int sum=0;
		for(int i=1;i<(arr.length-1);i++)
			sum+=arr[i];
					
		return (sum/(arr.length)-2);
	}
	
	public static void main(String args[]) {
		int arr[] = {0,1,0,0,1,0,1,0,1,0,1,1,0,1,0,0,1,0,0,1,0};
		System.out.println(Arrays.toString(arr));
		System.out.println(tl(arr));
		
	}
}
