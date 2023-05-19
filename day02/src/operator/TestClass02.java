package operator;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		String s = (num%2 == 0)?"짝수":"홀수";
		System.out.println(num + "는 "+s);
		
		// 입력한 수가 3의 배수인지 구분하시오
		
		int n;
		System.out.println("수 입력");
		n = input.nextInt();
		String st = (n%3 == 0)?"3의 배수":"3의 배수가 아니다";
		System.out.println(n + " 는 " + st);
		
	}
}
