import java.util.Scanner;

public class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static long [] price;
	public static long result , total;
	public static int max_index;
		
	public static void In_value(int day) {//매매가 입력
		price = new long [day];
		for(int j=0; j<day;j++) {price[j] = sc.nextLong();}		
	}	
	public static void FindMax(int start) {//최대 가격 인덱스 구하기
		long max=0;
		for(int i = start; i< price.length ; i++) {
			if(price[i] > max) {
				max = price[i];
				max_index = i;
			}
		}
	}	
	public static void Cal(int start) {// 최대 이익 계산
		long c = 0,s = 0;//c = 구매 횟수, s = 구매 가격
		for(int i = start; i<max_index;i++) {
			s += price[i];
			c++;
		}
		result = (price[max_index]*c)-s;
		total += result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int day = sc.nextInt();// 날짜 입력
			In_value(day);// 매입가 입력			
			
			int start = 0, end = day;
			while(start!=end){// 최대 가격 인덱스가 마지막 인덱스일때 까지 반복
				FindMax(start);// 최대 가격의 인덱스를 구한다.
				Cal(start);// 최대 매입가를 계산
				start = max_index +1;// 최대 매입가 이후의 최대 매입가 계산을 위해 시작 인덱스 지정
			}
			System.out.println("#"+(i+1)+" "+total);
			total = 0; result =0;
		}		
	}
}
