import java.util.Scanner;

public class B04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		double sal = 0;
		double comm = 0;
		
		System.out.print("연봉을 위 단위로 입령하세요. ");
		sal = a.nextInt();
		
		if(sal <= 10000000)
			comm = sal * 0.095;
		else if(sal <= 40000000)
			comm = sal * 0.19;
		else if(sal <= 80000000)
			comm = sal * 0.28;
		else
			comm = sal * 0.37;
		System.out.print("연봉 금액에 대한 소득세는 "+ comm + "입니다.");
				
	}

}
