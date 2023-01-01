import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Solution {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int N, ans;
	public static int [][] arr;
	public static void main(String[] args)throws IOException {
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			arr=new int [N][N];
			for (int i = 0; i < N; i++) {
				String s = br.readLine();
				String [] st = s.split("");
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st[j]);
				}
			}
			ans = 0;
			check();
			System.out.println("#"+t+" "+ans);
		}
	}
	private static void check() {
		int mid = N/2;
		for (int i = 0; i <= mid; i++) {
			for(int j = mid-i; j<=mid+i; j++) {
					ans += arr[i][j];
			}
		}
		for (int i = 0; i < mid; i++) {
			for(int j = mid-i; j<=mid+i; j++) {
				ans += arr[N-1-i][j];
			}
		}
	}
}
