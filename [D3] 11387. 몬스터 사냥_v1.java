import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st ;
	public static double D,L,N,ans;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		long T = Long.parseLong(br.readLine());
		for (long t = 1; t <= T; t++) {
			String s = br.readLine();
			st = new StringTokenizer(s);
			D = Double.parseDouble(st.nextToken());
			L = Double.parseDouble(st.nextToken());
			N = Double.parseDouble(st.nextToken());
			
			ans = D*N+(D*N/200*(L*(N-1)));
			
			System.out.println("#"+t+" "+(long)ans);
		}
	}
}
