import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Solution {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BigInteger n,l,r;
	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			n = BigInteger.valueOf(Long.parseLong(br.readLine()));
			l = n.subtract(BigInteger.ONE).pow(2).add(BigInteger.ONE).multiply(BigInteger.valueOf(2)).subtract(BigInteger.ONE);//2((n-1)^2)-1
			r = n.pow(2).multiply(BigInteger.valueOf(2)).subtract(BigInteger.ONE);//2(n^2)-1
			System.out.println("#"+t+" "+l+" "+r);
		}
	}
}
