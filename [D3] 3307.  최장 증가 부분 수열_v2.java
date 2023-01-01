public class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static int N,max;
	public static int [] arr, dp;
	
	public static void main(String[] args) {
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			Input();
			check();
			System.out.println("#"+t+" "+max);			
		}
	}
	
	private static void check() {
		max = 0;
		for (int i = 0; i < arr.length; i++) {
			dp[i]=1;
			for (int j = 0; j < i; j++) {
				if(arr[i]>arr[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		for (int i = 0; i < dp.length; i++) {
			if(dp[i]>max) {
				max = dp[i];
			}
		}		
	}
	private static void Input() {
		N = sc.nextInt();
		arr = new int [N];
		dp = new int [N];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}		
	}
}
