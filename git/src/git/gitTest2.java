package git;
import java.util.Scanner;
public class gitTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		double m2;
		double pyung;
		
		System.out.print("����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ�: ");
		m2 = a.nextInt();
		
		pyung = m2 / 3.305;
		if(pyung <= 15)
			System.out.print("����");
		else if(pyung <= 30)
			System.out.print("�߼���");
		else if(pyung <= 50)
			System.out.print("����");
		else
			System.out.print("����");
	}

}
