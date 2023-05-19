package if_;

import java.util.Scanner;

public class if_Exercise01 {
	
	public static void main(String[] args) {
		
		/*
		 A와 B를 비교하여 작은 값 출력
		 */
		Scanner sc = new Scanner(System.in);
		int A, B, min;
		System.out.println("A와 B를 비교해 작은값 출력하시오");
		System.out.print("A의 값 : ");
		A = sc.nextInt();
		System.out.print("B의 값 : ");
		B = sc.nextInt();
		
		if(A>B) {
			min = B;
		}
		else {
			min = A;
		}
		
		System.out.println("최소값은 " + min + "입니다.");
		
		
		//국어, 영어, 수학 각3과목의 점수를 받고 평균값을 구해 평균값이 70이상이면 합격 70미만이면 불합격이 출력되게하시오
		
		System.out.println("국어 점수 입력:");
		int k = sc.nextInt();
		System.out.println("영어 점수 입력:");
		int e = sc.nextInt();
		System.out.println("수학 점수 입력:");
		int m = sc.nextInt();
		
		int avg = (k + e + m) /3;
		if (avg>=70) {
			System.out.println("평균 점수는 " + avg + " 점 입니다");
			System.out.println("합격입니다");
		}else {
			System.out.println("평균 점수는 " + avg + " 점 입니다");
			System.out.println("불합격입니다");
		}
		
		
		
	}
}
