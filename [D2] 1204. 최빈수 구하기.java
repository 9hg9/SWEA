import java.util.Scanner;

public class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static int [] arr;
	public static int index;
	public static void main(String[] args) {
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			arr = new int [101];
			Input();
			Max();
			System.out.println("#"+N+" "+index);
		}
	}
	private static void Max() {
		index = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=max) {
				max = arr[i];
				index = i;
			}
		}		
	}
	private static void Input() {
		for (int i = 0; i < 1000; i++) {
			int next = sc.nextInt();
			arr[next]++;
		}
	}
}
