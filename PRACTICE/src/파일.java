import java.io.File;


public class ���� {
	public static void main(String[] args) throws Exception{
		String directory = "C:/Windows";
		File f1 = new File(directory);
		if(f1.isDirectory()) {
			System.out.println("�˻� �����͸� " + directory);
			System.out.println("==============================");
			String s[] = f1.list();
			
			for(int i=0; i<s.length; i++) {
				File f=new File(directory + "/" + s[i]);
				if(f1.isFile()) {
					System.out.println(s[i] + " : ���͸�");
				}
				else
					System.out.println(s[i] + " : ����");
			}
		}
		
		else
			System.out.println("������ " + directory + " �� ���͸��� �ƴմϴ�.");
		
	}
}
