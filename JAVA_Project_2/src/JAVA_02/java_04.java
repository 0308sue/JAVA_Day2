package JAVA_02;

import java.util.Scanner;

public class java_04 {
   //숫자 입력 받고 마지막은 -1,짝수만 더하기
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력하세요(더 이상 입력하고 싶지 않으면 -1을 입력) >>");
		int sum = 0;
		int cnt = 0;
		while(true) {
			int num = sc.nextInt();
			if(num == -1) break;
//			if(num % 2 == 0);
			if(num % 2!=0)continue;
			sum += num;
			
			
		}System.out.println(sum);
		
		
	}

}
