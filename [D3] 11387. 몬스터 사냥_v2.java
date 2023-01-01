import java.util.Scanner;
public class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static long D,N,L,total;
	public static void main(String[] args) {
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			D = sc.nextLong();
			L = sc.nextLong();
			N = sc.nextLong();
			
			total = D*N+((D*L*N*(N-1))/200);
			
			System.out.println("#"+t+" "+total);
		}
	}
}
