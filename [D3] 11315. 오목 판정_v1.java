import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static char [][] board;//오목판
	public static int [] dx= {-1,0,1,1,1,0,-1,-1}, dy= {-1,-1,-1,0,1,1,1,0};
	public static int N,cnt,result;
	
	public static void check(int y, int x) {
		int nx = x;//x좌표 입력
		int ny = y;//y좌표 입력
		for(int i=0;i<8;i++) {//8방면 확인
			cnt=1;				
			while(true) {
				nx += dx[i];
				ny += dy[i];
				if(nx<0||nx>=N||ny<0||ny>=N||board[ny][nx]!='o') {// 인덱스 범위 확인 및 바둑돌 확인
					nx -= dx[i];//원래의 좌표로 이동
					ny -= dy[i];//원래의 좌표로 이동
					break;//while 종료
				}
				if(++cnt==5) result=1;//오목돌이 5개가 연달아 있다면 result 1반환
			}
		}
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int T = Integer.parseInt(br.readLine());// 테스트케이스 입력
		for(int t = 1; t<=T;t++) {
			result=0;
			N = Integer.parseInt(br.readLine());//바둑판 크기 입력
			board = new char[N][N];
			for(int i = 0; i< N; i++) {
				String str = br.readLine();//바둑돌 한줄의 정보 입력
				board[i]=str.toCharArray();//한줄을 하나씩 배열에 입력
			}			
			for(int i=0; i<N; i++) {
				for(int j =0;j<N;j++) {
					if(board[i][j]=='o') check(i,j);// 바둑돌이 있다면 연달아 5개이상인지 확인한다.
				}
			}
			if(result == 1)	System.out.println("#"+t+" YES");
			else System.out.println("#"+t+" NO");
		}
	}
}
