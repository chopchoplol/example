package Snail;
import java.util.Scanner;
/*���ʾƷ�-���ʹ������

public class Snail {
	public static void main(String[] args) {

		Scanner wow=new Scanner(System.in);
		
		int cut=-1;
		int count=1;
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int length=wow.nextInt();
		int x=length;
		int j=0,i=length;
		
		int[][] array=new int[length][length];
		
		for(;;x--) {			
			for(int k=0;k<x;k++) {
				i+=cut;
				array[i][j]=count++;
			}

			cut*=(-1);

			for(int q=0;q<x-1;q++) {
				j+=cut;
				array[i][j]=count++;
			}
			
			if(x==0)
				break;
		}
		
		
		for(int k=0;k<array.length;k++) {
			for(int q=0;q<array[k].length;q++) {
				System.out.print(array[k][q]+"\t");
			}
			System.out.println();
		}

	}
}
*/
//���� ��-������ ���� ����
public class Snail {
	public static void main(String[] args) {

		Scanner wow=new Scanner(System.in);
		
		int cut=1;
		int count=1;
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int length=wow.nextInt();
		int x=length;
		int j=-1,i=0;
		
		int[][] array=new int[length][length];
		
		for(;;x--) {	
			if(x==0)
				break;
			
			for(int q=0;q<x;q++) {
				j+=cut;
				array[i][j]=count++;
			}
			
			for(int k=0;k<x-1;k++) {
				i+=cut;
				array[i][j]=count++;
			}

			cut*=(-1);

		}
		
		
		for(int k=0;k<array.length;k++) {
			for(int q=0;q<array[k].length;q++) {
				System.out.print(array[k][q]+"\t");
			}
			System.out.println();
		}

	}
}


