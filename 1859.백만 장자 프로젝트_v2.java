import java.util.Scanner;

public class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static int [] arr;
	public static int index;
	public static long ans;
	
	public static void main(String[] args) {
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			arr = new int [N];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			ans = 0;
			int start = 0, end = N;
			while(start != end) {
				max(start);
				ans += cal(start);
				start = index+1;
			}
			System.out.println("#"+t+" "+ans);
		}
	}
	private static long cal(int start) {
		int cnt = 0;
		int sum = 0;
		for(int i = start;i<index;i++) {
			cnt++;
			sum += arr[i];
		}
		return (arr[index]*cnt)-sum;		
	}
	private static void max(int start) {
		int max = 0;
		index = 0;
		for (int i = start; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				index = i;
			}
		}
	}
}
