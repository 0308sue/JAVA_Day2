package JAVA_02;

import java.util.Scanner;

public class java_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("입력할 숫자의 개수 >>");
		int cnt = sc.nextInt();
		int sum = 0;
		int[]tmp = new int[cnt];
		int max =tmp[0];
		for(int i=0;i<cnt;i++) {
			tmp[i]=sc.nextInt();
			sum+=tmp[i];
			if(tmp[i]>max) {
				max=tmp[i];
			}
		}
		System.out.println("합계 : "+sum);
		System.out.println("최댓값 : "+max);
		for(int i=0;i<tmp.length;i++) {
			System.out.println(tmp[i]);
		}
		for(int i:tmp) {
			System.out.println(i);
		}

	}

}
