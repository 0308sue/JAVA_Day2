package JAVA_02;

import java.util.Scanner;

public class java_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("5개의 정수 입력 >>");
		int sum = 0;
		int[]tmp = new int[5];
		for(int i = 0;i<5;i++) {
			tmp[i]=sc.nextInt();
			sum+=tmp[i];
		
		}
		System.out.println("합계 : "+sum);
		for(int i=0;i<tmp.length;i++) {
			System.out.println(tmp[i]);
		}
		
	}

}
