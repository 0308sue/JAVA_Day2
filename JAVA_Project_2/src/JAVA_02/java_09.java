package JAVA_02;

import java.util.Scanner;

public class java_09 {

	public static void main(String[] args) {
		int[]data = {10,5,90,100,250,30,77};
		Scanner sc = new Scanner (System.in);
		System.out.println("찾을 숫자를 입력하세요 >>");
		int i;
		int num = sc.nextInt();
		int numpos =-1;
		String non ="없음";
		
		for(i = 0;i<data.length;i++){
			if(data[i]==num) {
				numpos = i;
				non = "있음";
				System.out.println("찾는 값 : "+num);
				System.out.println("찾는 값의 위치 : "+numpos);
			}
		
			}
		if(non=="없음") {
			System.out.println(num+non);
		}
		
		System.out.println("----------다른 방법----------");
		int search = sc.nextInt();
		boolean flag = false;
		for(i=0;i<data.length;i++) {
			if(search == data[i]) {
				flag = true;
				System.out.println("찾음 ");
			}
		}
		if(flag == false) {
			System.out.println("없음 ");
		}
	}

}
