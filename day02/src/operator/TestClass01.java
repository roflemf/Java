package operator;

public class TestClass01 {

	public static void main(String[] args) {
		/*
		 +, -, *, /, %
		 / : 정수 / 정수 = 정수
		 / : 정수 / 실수 = 실수(연산 중 하나라도 실수가 있다면 결과는 실수)
		 %(mod) : 정수 % 정수 = 나머지값
		 어떤수가 짝수, 홀수, 배수		 
		 */
		
		int n1 = 9, n2 = 2;
		System.out.println( n1 + n2 );
		System.out.println( n1 - n2 );
		System.out.println( n1 * n2 );
		System.out.println( n1 / n2 );
		System.out.println( n1 / (float)n2 );
		System.out.println( n1 % n2 );
	
		
		
		/*
		 
		 복합 대입 연산자
		 n1 = 5;
		 n1 += 10; // n1 = n1 + 10;
		 n1 -= 10; // n1 = n1 - 10;
		 n1 /= 10; // n1 = n1 / 10;
		 n1 %= 10; // n1 = n1 % 10; 
		 
		 */
		System.out.println("==== 복합대입 연산자 ====");
		 n1 = n2 = 5;
		 n1 += 1; // n1(6) = n1(5) + 1
		 System.out.println(n1);// 6
		 n1 -= 1; // n1(5) = n1(6) - 1
		 System.out.println(n1);// 5
		 
		 n1 *= n2; // n1(25) = n1(5) * (5)n2
		 System.out.println(n1);
		 n1 /= n2; // n1(5) = n1(25) / (5)n2
		 System.out.println(n1); //25
		 n1 %= n2; // n1(0) = n1(5) % (5)n2
		 System.out.println(n1);
		 
		 /*
		  관계 연산자
		  -결과적으로 true 또는 false를 알려준다
		  n1 = 10, n2 = 5;
		  > , < , >= , <= , == , !=
		  n1 > n2 = true
		  n1 <= n2 => false
		  n1 == n2 => false
		  n1 != n2 => true
		  */
		 System.out.println("==== 관계 연산자 ====");
		 n1 = 10; n2 = 5;
		 System.out.println( n1 > n2 );   // true
		 System.out.println( n1 == n2 );  // false
		 System.out.println( n1 == 10 );  // false
		 System.out.println( n1 != n2 );  // true
		 System.out.println( n1 != 10 );  // true
		 
		 
		 /*
		  논리 연산자
		  ||(or) : 식 중 하나라도 true(참)이면 결과는 true(참)이다
		  &&(and): 모두가 참일때 결과는 참.
		  			- 하나라도 거짓이면 결과는 거짓
		   !(not): 결과를 반전시켜준다
		   			-!true -> false, !false -> true
		   			
		  */
		 
		 System.out.println("=== 논리 연산자 ===");
		 System.out.println("-- or --");
		 System.out.println(true || true);
		 System.out.println(true || false);
		 System.out.println(false || false);
		 
		 System.out.println("-- and --");
		 System.out.println(true && true);
		 System.out.println(true && false);
		 System.out.println(false && false);
		 //이항 연산자
		 //10>5>2
		 System.out.println(10 > 5 && 10 > 2);
		 System.out.println("--- not ---");
		 System.out.println( !true );
		 System.out.println( !(10 < 5) );
		 
		 
		 
		 /*
		  증감 연산자
		  -결과적으로 자기자신을 1증가 또는 감소
		  n1 = 10;
		  n1++; => n1 = n1 + 1;
		  ++n1; => n1 = n1 + 1;
		  n1--; => n1 = n1 - 1;
		  --n1; => n1 = n1 - 1;
		  
		  */
		 
		 System.out.println("=== 증감 연산자 ===");
		 n1 = 10;
		 n2 = n1++ + 10;
		 System.out.println(n1);
		 System.out.println(n2);
		 //연산 후 제일 마지막에 1증가
		 
		 n1 = 10;
		 n2 = ++n1 + 10;
		 System.out.println(n1);
		 System.out.println(n2);
		 //어떠한 연산보다 자기자신을 먼저증가
		 
		 // ++ ->자기자신 1증가
	}
}
