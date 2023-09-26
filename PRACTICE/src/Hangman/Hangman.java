package Hangman;
import java.util.Scanner;
public class Hangman {
	public static void main(String[] args) {
		Scanner wow=new Scanner(System.in);
		char[] word= {'a','p','p','l','e'};
		char input;
		boolean[] entry= {false,false,false,false,false};
		int num=0;
		System.out.println("행맨 게임을 시작합니다!");
		
		for(int i=0;i<word.length;i++) {
			System.out.print("스펠링을 맞춰주세요 : ");
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
				System.out.println("\n맞췄습니다.");
			}
			else
				System.out.println("\n입력하신 알파벳은 포함되지 않습니다.");
			
			if(num==word.length) {
				System.out.println("모두 맞추셨습니다.");
				System.exit(0);
			}
		}

		
		System.out.println("기회를 모두 소진하였습니다. 실패입니다.");
	}
}
