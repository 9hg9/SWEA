import java.util.Scanner;

public class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static int [] arr;
	public static int ans;
	public static void main(String[] args) {
		for (int t = 1; t <= 10; t++) {
			int N = sc.nextInt();
			arr = new int [N];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			check();
			System.out.println("#"+t+" "+ans);
		}
	}
	private static void check() {
		ans = 0;
		for(int i = 2;i<arr.length-2;i++) {
			int max = Math.max(Math.max(arr[i-2], arr[i-1]),Math.max(arr[i+1], arr[i+2]));
			if(arr[i]>max) ans +=(arr[i]-max);
		}
	}
}
