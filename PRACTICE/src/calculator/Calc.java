package calculator;
import java.util.Scanner;


public class Calc {
	int first,second;
	String operator;
	
	
	public Calc() {
		Scanner wow=new Scanner(System.in);
		
		System.out.println("���� ���α׷��Դϴ�.");
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		first=wow.nextInt();
		
		wow.nextLine();
		
		System.out.println("��Ģ ������ �Է��ϼ��� (+, -. *, /)");
		operator=wow.nextLine();
		
		//'=='�� �ּҰ��� ���ϴ� ���̹Ƿ� operator�� �Է� �޾����� �ּҰ��� ���� �Ҵ�Ǵ� ���̹Ƿ� �ּҰ� �޶� ������ ����.
		if(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")) {
			System.out.println("�ι�° ���ڸ� �Է��ϼ���");
			second=wow.nextInt();
			
			if(operator.equals("/")&&second==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
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
