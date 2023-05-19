package input;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		int eng;
		int math;
		int total;
		
		
		
		System.out.println("============================");
		System.out.print("이름 : ");
		name =sc.next();
		System.out.println("============================");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		System.out.println("============================");
		total = kor + math + eng;
		System.out.println("합계 : "+ total);
		System.out.println("============================"); 
		
	
		
	}

}
