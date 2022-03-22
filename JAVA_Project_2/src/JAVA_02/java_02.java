package JAVA_02;

public class java_02 {

	public static void main(String[] args) {
		
		for(int i=1;i<10;i++) {
			if(i==5) break;
			System.out.println(i);
		}
		
		for(int i=1;i<10;i++) {
			if(i==5) continue;
			System.out.println(i);
		}
		
		int b = 3;
		while(true) {
			System.out.println("while test");
			if(b==3)break;
		}

	}

}
