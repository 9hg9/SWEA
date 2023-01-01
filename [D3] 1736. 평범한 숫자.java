import java.util.Scanner;
public class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static int N,cnt;
	public static int [] arr;
	public static void main(String[] args) {
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			N=sc.nextInt();
			arr = new int [N];
			for (int i = 0; i < N; i++)	{
				arr[i] = sc.nextInt();
			}
			check();
			System.out.println("#"+t+" "+cnt);
		}
	}
	private static void check() {
		cnt=0;
		for(int i = 1; i<N-1;i++) {
			if((arr[i]<arr[i-1])&&(arr[i]>arr[i+1])) cnt++;
			else if((arr[i]>arr[i-1])&&(arr[i]<arr[i+1])) cnt++;
		}
	}
}
