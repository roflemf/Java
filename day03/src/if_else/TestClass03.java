package if_else;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
	 
		String s1,s2;
		Scanner input = new Scanner(System.in);
		System.out.println("첫 문자열 입력");
		s1 = input.next();
		System.out.println("두 문자열 입력");
		s2 = input.next();
		
		System.out.println(s2.equals(s1));
		if( s1.equals(s2) ) { // s1.equals(s2) == true
			System.out.println("s1과 s2는 같다");
		}else {// s1.equals(s2) == false
			System.out.println("s2과 s2는 다르다");
		}
		System.out.println("다음 문장들 실행!!!");
	}
	
	//문자열을 비교할땐 등호로는 비교 못함 (==)
	
	
}
