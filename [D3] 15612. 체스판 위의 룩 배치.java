package Day4_rook_A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
	public static char [][] board = new char [8][8];
	public static int cnt, ans;
	
	public static void check() {
		int []rook = new int [8];//좌표저장
		for(int i = 0; i < 8;i++) {
			cnt=0;//카운트 저장
			for (int j = 0; j < 8; j++) {//i열의 rook의 갯수 확인
				if(board[i][j]=='O') {//룩이라면
					rook[j]++;//룩의 좌표에 추가
					cnt++;//룩 갯수 더함
				}
				if(cnt==2) return;//룩이 1개 초과시 즉시 함수 중지
			}			
		}
		
		for (int i = 0; i < rook.length; i++) {//행과 열의 중복 없이 잘 들어갔는지 확인
			if(rook[i]==1) ans++;
		}
	}
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());//테스트 케이스 입력
		for (int t = 1; t <= T; t++) {
			int cnt_r = 0;
			for (int i = 0; i < 8; i++) {
				String str = br.readLine();//보드에 정보 입력
				board[i] = str.toCharArray();//보드에 정보 입력
				for (int j = 0; j <8; j++) {
					if(board[i][j]=='O') cnt_r++;//룩의 갯수 카운트
				}
			}
			ans = 0;//결과값 초기화
			if(cnt_r==8) check();//룩이 8개일때 중복되는 행과열 확인
			if(ans==8)	System.out.println("#"+t+" yes");
			else System.out.println("#"+t+" no");
		}		
	}
}
