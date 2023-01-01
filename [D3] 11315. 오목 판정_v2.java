import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int N,cnt,ans;
	public static int [] dx = {-1,0,1,1,1,0,-1,-1}, dy = {-1,-1,-1,0,1,1,1,0};
	public static char [][] arr;
	
	public static void main(String[] args)throws IOException {
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			arr = new char [N][N];
			for (int i = 0; i < N; i++) {
				String s = br.readLine();
				arr[i] = s.toCharArray();
			}
			ans = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(arr[i][j]=='o') check(j,i);
				}
			}
			if(ans==1) System.out.println("#"+t+" YES");
			else System.out.println("#"+t+" NO");
		}
	}

	private static void check(int x, int y) {
		int nx = x;
		int ny = y;
		for (int i = 0; i < 8; i++) {
			cnt = 0;
			while(true) {
				nx += dx[i];
				ny += dy[i];
				if(nx<0||nx>=N||ny<0||ny>=N||arr[ny][nx]!='o') {
					nx -= dx[i];
					ny -= dy[i];
					break;
				}
				else if(++cnt == 4) ans = 1;			
			}
		}
	}
}
