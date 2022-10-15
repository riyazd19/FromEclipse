package packOne;

public class RainWaterTapping {

	public static void main(String[] args) {
		int[] arr={3,4,5,1,2,4,6,7};
		rainwater(arr);
		//System.out.println(ans);
		

	}

	private static int rainwater(int[] arr) {
		int n=arr.length;
		int[] left= new int[n];
		int[] right= new int[n];
		left[0]=arr[0];
		for(int i=0;i<n;i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		right[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i]=Math.max(right[i+1], arr[i]);
		}
		int ans=0;
		 for(int i=0;i<n;i++) {
			 ans+=(Math.min(left[i]-right[i], i)-arr[i]);
		 }
		 return ans;
	}

}
