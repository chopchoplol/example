package Miner;
import java.util.Scanner;

public class Miner {
	public static void main(String[] args) {
		Scanner wow=new Scanner(System.in);
		int num,ele;
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		num=wow.nextInt();
		int[] array=new int[num];
		
		System.out.println(num+"ũ���� �迭�� �����Ǿ����ϴ�.");
		for(int i=0;i<array.length;i++) {
			System.out.print((i+1)+"��° ���ڸ� �Է��ϼ��� : ");
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
		
		System.out.println("�ּҰ��� "+array[0]+"�Դϴ�.");
	}
}
