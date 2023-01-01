import java.util.Scanner;

public class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {			
			int ans = 0;
			for (int i = 0; i < 10; i++) {
				int next = sc.nextInt();
				if(next%2==1) ans += next;
			}
			System.out.println("#"+t+" "+ans);
		}
	}
}
