package if_else;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
	
		/*
		 10,000원짜리 추석선물세트 구입시 지불해야하는 금액 계산
		 단, 11개 이상 구매시 10% 할인
		 */
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("사려는 상품의 갯수 입력 : ");
		int count = sc.nextInt();
		
		int gift =   10000;
		float sale = (float)(gift*(0.9));
		
		if(count > 10) {
			System.out.println("가격은 "
					+ count * sale 
					+ " 원 입니다");			
		}else {
			System.out.println("가격은 "
					+ count * gift
					+ " 원 입니다");			
		}
		
		
		
	}
}
