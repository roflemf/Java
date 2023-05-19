package if_else;

import java.awt.im.InputContext;
import java.util.Scanner;

public class Quiz01 {
	/*
	 정수 입력받아 아래와 같이 출력
	 1) 3,4의 배수입니다
	 2) 3의 배수
	 3) 4의 배수
	 4) 배수 아님
	 5) 0은 잘못입력
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("정수 입력 : ");
		num = input.nextInt();
	    if (num == 0 ) {
	    	System.out.println("0은 잘못 입력");	
		}else if (num % 3 == 0 && num % 4 == 0 ) {
			System.out.println("3과 4의 배수 입니다");
		}else if(num % 3 == 0 ){
			System.out.println("3의 배수");
		}else if(num % 4 == 0 ){
			System.out.println("4의 배수");
		}else if(num %3 != 0 && num %4 != 0 ){
			System.out.println("배수 아님");
		}else {
			System.out.println("0은 잘못입력");
		}
			
		
	}

}
