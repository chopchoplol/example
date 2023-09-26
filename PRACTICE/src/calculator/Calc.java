package calculator;
import java.util.Scanner;


public class Calc {
	int first,second;
	String operator;
	
	
	public Calc() {
		Scanner wow=new Scanner(System.in);
		
		System.out.println("계산기 프로그램입니다.");
		System.out.println("첫번째 숫자를 입력하세요");
		first=wow.nextInt();
		
		wow.nextLine();
		
		System.out.println("사칙 연산을 입력하세요 (+, -. *, /)");
		operator=wow.nextLine();
		
		//'=='는 주소값을 비교하는 것이므로 operator를 입력 받았을때 주소값이 새로 할당되는 것이므로 주소가 달라서 오류가 난다.
		if(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")) {
			System.out.println("두번째 숫자를 입력하세요");
			second=wow.nextInt();
			
			if(operator.equals("/")&&second==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);
			}
			
			switch(operator) {
			case "+":
				System.out.println(plus(first,second,operator));
				break;
			case "-":
				System.out.println(minus(first,second,operator));
				break;
			case "*":
				System.out.println(multiple(first,second,operator));
				break;
			case "/":
				System.out.println(division(first,second,operator));
				break;
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
			System.exit(0);
		}
		
	}
	
	public String plus(int num1,int num2, String operator) {
		return num1+operator+num2+" = "+(double)(num1+num2);
	}
	
	public String minus(int num1,int num2, String operator) {
		return num1+operator+num2+" = "+(double)(num1-num2);
	}
	
	public String multiple(int num1,int num2, String operator) {
		return num1+operator+num2+" = "+(double)(num1*num2);
	}
	
	public String division(int num1,int num2, String operator) {
		return num1+operator+num2+" = "+(double)(num1/num2);
	}
}
