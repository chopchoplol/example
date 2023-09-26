package personhangman;
import java.util.Scanner;
public class Hangman {
	Scanner wow=new Scanner(System.in);
	
	char[] word= {'a','p','p','l','e'};
	char ch;
	boolean[] entry= {false,false,false,false,false};
	boolean boo;
	int ans=0;
	
	public Hangman() {
		System.out.println("행맨 게임을 시작합니다!");
		int count=word.length;
		result(matching(count));
	}
	
	public int matching(int count) {
		int ans=count;
		for(int i=0;i<count;i++) {
			boo=false;
			System.out.print("스펠링을 맞춰주세요 : ");
			ch=wow.next().charAt(0);
			
			for(int j=0;j<word.length;j++) {
				if(ch==word[j]) {
					entry[j]=true;
					boo=true;
				}
			}
			printword();
			
			if(boo) {
				System.out.println("\n맞췄습니다.");
			}
			else
				System.out.println("\n입력하신 알파벳은 포함되지 않습니다.");
			
			if(entry[0]==true&&entry[1]==true&&entry[2]==true&&entry[3]==true&&entry[4]==true)
				break;
			ans--;
		}
		
		return ans;
	}
	
	public void printword() {
		for(int k=0;k<entry.length;k++) {
			if(entry[k]==false) {
				System.out.print("_ ");
			}
			else
				System.out.print(word[k]+" ");
		}
	}
	
	public void result(int count) {
		if(count>0) {
			System.out.println("모두 맞추셨습니다.");
		}
		else {
			System.out.println("기회를 모두 소진하셨습니다. 실패입니다.");
		}
	}
}
