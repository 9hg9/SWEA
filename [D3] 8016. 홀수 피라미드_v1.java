import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static Scanner sc = new Scanner(System.in);
      public static BigInteger n, left, right, x;
      public static String [] result;   
         
      public static void l_find() {// 왼쪽값 구하는 함수
         x = ((n.subtract(BigInteger.ONE)).pow(2)).add(BigInteger.ONE);//left = 1+(n-1)**2 번째 수
         left = (x.multiply(BigInteger.valueOf(2))).subtract(BigInteger.ONE);//홀수 변환
      }
      public static void r_find() {// 오른쪽값 구하는 함수
         x = n.pow(2);//right = n**2 번째 수
         right = (x.multiply(BigInteger.valueOf(2))).subtract(BigInteger.ONE);//홀수 변환
      }
      public static void print_result(int t) {// 출력 함수
         for(int i = 1; i<=t;i++) {
            System.out.println("#"+i+" "+result[i-1]);
         }
      }
      public static void main(String[] args) {
         // TODO Auto-generated method stub
         int t = sc.nextInt();// 테스트 케이스 개수 입력
         result = new String [t];
         
         for(int i=0; i<t;i++) {
            n = sc.nextBigInteger();// 층 입력
            l_find();   r_find();//n층의 가장 왼쪽, 오른쪽 값 구하는 함수 
            result[i] = (left+" "+right);// 결과를 저장
         }
         print_result(t);// 출력
      }
