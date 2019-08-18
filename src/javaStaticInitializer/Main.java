package javaStaticInitializer;

import java.util.Scanner;

public class Main {
	
	public static Scanner sc;
	public static boolean flag;
	public static int B;
	public static int H;
	public static String errorMessage = "java.lang.Exception: Breadth and height must be positive";

	static {
		sc = new Scanner(System.in);
		
		flag = false;
		B = sc.nextInt();
		H = sc.nextInt();
		
		if (B <= 100 && B >= 1 && H <= 100 && H >= 1) {
			flag = true;
		}else if(B <= 0 && H >= 0 || H <= 0 && B >= 0) {
			flag = false;
			System.out.print(errorMessage);
		}else if(B <= 0 && B >= -100 && H <= 0 & H >= -100){
			flag = false;
			System.out.print(errorMessage);
		}
		
	}
	
	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}

}
