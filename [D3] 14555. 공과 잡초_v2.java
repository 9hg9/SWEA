import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
public class Solution {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static ArrayList <String> arr;
	public static int cnt;
	public static void main(String[] args)throws IOException {
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			String s = br.readLine();
			String [] st = s.split("");
			arr = new ArrayList <String> (Arrays.asList(st));
			cnt = 0;
			check();
			System.out.println("#"+t+" "+cnt);
		}		
	}
	private static void check() {
		for (int i = 0; i < arr.size(); i++) {
			if(i+1<arr.size()) {
				if(arr.get(i).equals("(")) {
					if(arr.get(i+1).equals(")")) cnt++;
					else if(arr.get(i+1).equals("|")) {
						cnt++;
						i++;
					}
				}					
				else if(arr.get(i).equals("|")&&arr.get(i+1).equals(")"))cnt++;
			}			
		}
	}
}
