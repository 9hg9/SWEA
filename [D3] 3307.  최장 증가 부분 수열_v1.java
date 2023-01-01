import java.util.Scanner;

public class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static int [] arr, dp;
	public static int N,max;
	
	public static void main(String[] args) {
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			N = sc.nextInt();
			arr = new int [N];
			dp = new int [N];
			for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
			check();
			System.out.println("#"+t+" "+max);
		}
	}
	private static void check() {
		// TODO Auto-generated method stub
		for (int i = 0; i < N; i++) {
			dp[i] = 1;
			for (int j = 0; j < i;j++) {
				if(arr[i]>arr[j]) dp[i] =Math.max(dp[i], dp[j]+1);
			}
		}
		max = dp[0];
		for(int i = 1; i<N;i++) {
			if(dp[i]>max) {
				max = dp[i];
			}
		}
	}
}
