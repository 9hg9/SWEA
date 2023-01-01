import java.util.Scanner;

public class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static int [] heigh;
	public static int count, result, total = 0;
	
	public static void In_value() {
		heigh = new int [count];
		for(int i = 0; i < count; i++) {heigh[i] = sc.nextInt();}		
	}
	public static void Cal() {
		for(int j = 2; j<heigh.length-2;j++) {
				int max = Math.max(Math.max(heigh[j-2], heigh[j-1]), Math.max(heigh[j+1], heigh[j+2]));
				if(heigh[j]>max) {result = heigh[j] - max; total += result;}				
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		for(int i=0; i<10;i++) {
			count = sc.nextInt();
			In_value();
			Cal();				
			System.out.println("#"+(i+1)+" "+ total);
			total = 0; result = 0;
		}
	}
}
