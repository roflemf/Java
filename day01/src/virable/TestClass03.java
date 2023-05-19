package virable;

public class TestClass03 {
public static void main(String[] args) {
	/*
	형변환
	- 자료형을 변환시키는 것
	*/
	int num = 65;
	System.out.println( num );
	System.out.println( (char)num );
	
	char ch = 'A', ch3;
	int ch2;
	
	num = 5;
	ch2 = ch + num;
	ch3 = (char)(ch + num);
	
	System.out.println(ch2);
	System.out.println(ch3);
	
	float fl = (float)1.11;
	float f2 = 1.11f;  //뒤에 f ; float 으로 쓰겠다
	double dou = 1.11; 
	//아스키코드; 65 = A
	
	String name = "홍길동";
	System.out.println("당신 이름 : " + name);
}
}
