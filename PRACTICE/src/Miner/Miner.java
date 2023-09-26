package Miner;
import java.util.Scanner;

public class Miner {
	public static void main(String[] args) {
		Scanner wow=new Scanner(System.in);
		int num,ele;
		
		System.out.print("배열의 크기를 입력하세요 : ");
		num=wow.nextInt();
		int[] array=new int[num];
		
		System.out.println(num+"크기의 배열이 생성되었습니다.");
		for(int i=0;i<array.length;i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			ele=wow.nextInt();
			
			array[i]=ele;
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.println("최소값은 "+array[0]+"입니다.");
	}
}
