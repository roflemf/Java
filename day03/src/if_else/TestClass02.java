package if_else;

public class TestClass02 {
	//중첩 if문
	
	public static void main(String[] args) {
		int num = 150;
		if(num > 0) {
			System.out.println("0보다 크다");
			if(num < 100)
			{System.out.println("0보다 작다");
			}else {
				System.out.println("0과 100보다 크다");
			}
		}else {
			System.out.println("0보다 작다");
		}
	}

}
