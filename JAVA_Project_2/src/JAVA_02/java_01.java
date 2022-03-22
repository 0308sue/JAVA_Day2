package JAVA_02;

public class java_01 {

	public static void main(String[] args) {
		for(int i=1;i<6;i++) {
			System.out.println(i);
		}
	
		int n = 1;
		while(n<6) {
			System.out.println(n);
			n++;
		}
		
		int m = 1;
		do {
			System.out.println(m);
			m++;
		} while(m<6);
		
		System.out.println("------------");
		
		int a = 1;
		while (a<6) {
			if(a==3)break;
			System.out.println(a);
			a++;
		}
		
		int b = 0;
		while (b<6) {
			b++;
			if(b==3)continue;
			System.out.println(b);
		}
		
		int sum = 0;
		for(int i=1;i<11;i+=2) {
			sum +=i;
		}System.out.println(sum);

		int hap = 0;
		for(int i = 1;i<10;i++) {
			if(i%2!=0)continue;
			hap += i;
		} System.out.println(hap);
		
		int h = 0;
		for(int i = 1;i<10;i++) {
			if(i%2!=0)break;
			h += i;
		} System.out.println(h);
	}

}
