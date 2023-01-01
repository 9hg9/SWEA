import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Solution {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int [][]arr;
	public static int N,mid,ans;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
				N = Integer.parseInt(br.readLine());
				mid=N/2;
				arr = new int [N][N];
				Input();
				check();
				System.out.println("#"+t+" "+ans);
		}
	}
	private static void check() {
		ans = 0;
		for (int i = 0; i <= mid; i++) {	
			for (int j = mid-i; j <=mid+i ; j++) {
				ans += arr[i][j];
			}
		}
		for (int i = 0; i < mid; i++) {	
			for (int j = mid-i; j <=mid+i ; j++) {
				ans += arr[N-1-i][j];
			}
		}
	}
	private static void Input()throws IOException {
		String s;
		String [] str = new String [N];
		for (int i = 0; i < N; i++) {
			s = br.readLine();
			str = s.split(""); 
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
	}
}
