package Hangman;
import java.util.Scanner;
public class Hangman {
	public static void main(String[] args) {
		Scanner wow=new Scanner(System.in);
		char[] word= {'a','p','p','l','e'};
		char input;
		boolean[] entry= {false,false,false,false,false};
		int num=0;
		System.out.println("��� ������ �����մϴ�!");
		
		for(int i=0;i<word.length;i++) {
			System.out.print("���縵�� �����ּ��� : ");
			input=wow.next().charAt(0);
			
			boolean ans=false;
			
			for(int j=0;j<word.length;j++) {
				if(input==word[j]) {
					entry[j]=true;
					ans=true;
					num++;
				}
			}
			
			for(int k=0;k<word.length;k++) {
				if(entry[k]==true)
				{
					System.out.print(word[k]+" ");
				}
				else
					System.out.print("_ ");
				
			}
			
			if(ans) {
				System.out.println("\n������ϴ�.");
			}
			else
				System.out.println("\n�Է��Ͻ� ���ĺ��� ���Ե��� �ʽ��ϴ�.");
			
			if(num==word.length) {
				System.out.println("��� ���߼̽��ϴ�.");
				System.exit(0);
			}
		}

		
		System.out.println("��ȸ�� ��� �����Ͽ����ϴ�. �����Դϴ�.");
	}
}
