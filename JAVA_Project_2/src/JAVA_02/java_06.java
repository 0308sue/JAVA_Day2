package JAVA_02;

public class java_06 {

	public static void main(String[] args) {
		int [] arr  = new int[5];
		arr[4] = 500;
		for(int i = 0;i<5;i++){
			System.out.println(arr[i]);
		}
		System.out.println("배열 길이: "+ arr.length);
		
		int[]tmp = new int[5];
//		tmp[0] = 1;
//		tmp[1] = 2;
//		tmp[2] = 3;
//		tmp[3] = 4;
//		tmp[4] = 5;
		for(int i =0;i<tmp.length;i++) {
			tmp[i]=i+1;
			System.out.print(tmp[i]+"\t");
		}
		System.out.println();
		
		int[] arr2= {100,200,300};
		int sum =0;
		for(int i = 0;i<arr2.length;i++){
			System.out.println(arr2[i]);
			sum+=arr2[i];
		}
		System.out.println("합계 : "+sum);
		
		String[] str = {"one","two","three","four"};
		for(int i=0;i<str.length;i++) {
			System.out.println("str["+i+"]="+str[i]);	
		}
		for (String s :str){
			System.out.println(s);
		}

	}

}
