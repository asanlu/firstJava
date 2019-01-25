package helloworld;

import java.util.Arrays;

public class HelloWorld {
	
	int[] scores = new int[5];
	int[] scores1 = new int[] {5,2,12,41,10};
	double ad = 5.131;
	float aad = 5.131f;
	String aName = "5100xasd";
	char single = 'x';
	
	public static void main(String[] args) {
//		System.out.println("welcome to my world~");
		int[] scores2 = {15,12,31,15,20};
//		"this arrays sort %s" , 
		Arrays.sort(scores2);
		//System.out.println(2<<2);
		for(int i = 0;i < scores2.length - 1;i++) {
			for(int j = 0; j < scores2.length - i -1;j++) {
				if(scores2[j] > scores2[j+1]) {
					int temp = scores2[j];
					scores2[j] = scores2[j+1];
					scores2[j+1] = temp;
				} 
			}
		}
		for(int i = 0 ; i < scores2.length;i++) {
			System.out.print(" "+ scores2[i] + " ");
		}
	}
}
