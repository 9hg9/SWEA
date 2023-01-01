import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static ArrayList <String> field;
	public static int cnt;
	
	public static void check() {
		for(int i=0;i<field.size();i++) {
			if(i+1<field.size()) {
				if(field.get(i).equals("(")) {
					if(field.get(i+1).equals(")")||field.get(i+1).equals("|"))
						cnt++;
					else if(field.get(i+1).equals("|")) {
						cnt++;
						i++;
					}
				}
				else if(field.get(i).equals("|")) {
					if(field.get(i+1).equals(")"))
						cnt++;
				}	
			}
		}
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1 ; t<=T;t++) {
			String s = br.readLine();
			String [] str = s.split("");
			field = new ArrayList <String>(Arrays.asList(str));
			cnt=0;
			check();
			System.out.println("#"+t+" "+cnt);
		}
	}
}
