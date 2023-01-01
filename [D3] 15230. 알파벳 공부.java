import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static char [] a,next;
	public static int cnt;
	public static void main(String[] args)throws IOException {
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			cnt = 0;
			String s = br.readLine();
			next = s.toCharArray();
			
			int i=0;
			while(i !=next.length) {
				if(next[i]=='a') {
					count(i);
					break;
				}
				i++;
			}
			System.out.println("#"+t+" "+cnt);
		}
	}
	private static void count(int start) {
		String al = "abcdefghijklmnopqrstuvwxyz";
		a = al.toCharArray();//비교 기준 문자 배열
		for (int i = 0; i < a.length; i++) {
			if(next.length>start+i) {
				if(next[start+i]==a[i]) cnt++;
				else break;
			}
			else break;
		}
	}
}
