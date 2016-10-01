package git;
import java.util.Scanner;
public class gitTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		double m2;
		double pyung;
		
		System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오: ");
		m2 = a.nextInt();
		
		pyung = m2 / 3.305;
		if(pyung <= 15)
			System.out.print("소형");
		else if(pyung <= 30)
			System.out.print("중소형");
		else if(pyung <= 50)
			System.out.print("중형");
		else
			System.out.print("대형");
	}

}
