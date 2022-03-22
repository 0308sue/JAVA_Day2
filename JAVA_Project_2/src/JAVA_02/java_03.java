package JAVA_02;

import java.util.Scanner;

public class java_03 {
   //숫자 입력 받고 마지막은 -1,입력한 수의 합과 평균 
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력하세요(더 이상 입력하고 싶지 않으면 -1을 입력) >>");
		int sum = 0;
		int cnt = 0;
		while(true) {
			int num = sc.nextInt();
			if(num == -1)break;
			sum += num;
			cnt ++;
			
		}System.out.println(sum);
		System.out.println((float)sum/cnt);
		
		System.out.println("-----------");
		
		//학생의 점수를 입력 받아 총점과 평균 구하기 마지막은 0 입력
		System.out.println("점수를 입력하세요(더 이상 입력하고 싶지 않으면 0을 입력) >>");
		sum = 0;
		cnt = 0;
		while(true) {
			int score = sc.nextInt();
			if(score == 0)break;
			sum += score;
			cnt ++;
			
		}System.out.println(sum);
		System.out.println((float)sum/cnt);
		
		
		
	}

}
