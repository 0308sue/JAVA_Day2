package JAVA_02;

public class java_10 {

	public static void main(String[] args) {
		//0에서 50사이의 정수형 난수를 발생
		int r =(int)(Math.random()*50);
		System.out.println(r);
		
		//크기가 10인 배열을 만들고 
		//0에서 50 사이 난수를 발생하여
		//0이 아닌 값을 배열에 넣으세요 (중복허용)
		
		int[]arr = new int[10];
		for(int i = 0;i<arr.length;i++){
			int t =(int)(Math.random()*50);
			if(t==0) {
			i--;
			continue;}
			arr[i]=t;
			}
		for(int i = 0;i<arr.length;i++){
			System.out.println("arr["+i+"]="+arr[i]);
			}
		
		int n=0;
		while(n<arr.length) {
			int f =(int)(Math.random()*50);
			if(f==0) {
				continue;
			}
			arr[n++]=f;
		}
		for(int i = 0;i<arr.length;i++){
		System.out.println("arr["+i+"]="+arr[i]);
		}
	}

}
