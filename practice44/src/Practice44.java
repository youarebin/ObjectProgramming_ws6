//20220740_컴퓨터학과_가유빈
import java.util.Scanner;

public class Practice44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Average a = new Average();
		
		System.out.print("원하는 기능을 선택하세요(1-정수, 2-실수) :");
		int n = sc.nextInt();
		System.out.print("평균값을 원하는 정수의 개수를 입력하세요:");
		int m = sc.nextInt();
		
		if(n == 1)
		{
		if(m == 2)
		{
			System.out.print("1번 정수를 입력하세요: ");
			int num1 = sc.nextInt();
			System.out.print("2번 정수를 입력하세요: ");
			int num2 = sc.nextInt();
			
			System.out.print("2개 정수의 평균은 " + a.getAverage(num1, num2)+ "입니다.");
		}
		else
		{
			System.out.print("1번 정수를 입력하세요: ");
			int num1 = sc.nextInt();
			System.out.print("2번 정수를 입력하세요: ");
			int num2 = sc.nextInt();
			System.out.print("3번 정수를 입력하세요: ");
			int num3 = sc.nextInt();
			
			System.out.print("3개 정수의 평균은 " + a.getAverage(num1, num2, num3)+ "입니다.");
		}
		}
		else if(n == 2)
		{
			if(m == 2)
			{
				System.out.print("1번 정수를 입력하세요: ");
				double num1 = sc.nextDouble();
				System.out.print("2번 정수를 입력하세요: ");
				double num2 = sc.nextDouble();
				
				System.out.print("3개 실수의 평균은 " + a.getAverage(num1, num2)+ "입니다.");
			}
			else
			{
				System.out.print("1번 정수를 입력하세요: ");
				double num1 = sc.nextDouble();
				System.out.print("2번 정수를 입력하세요: ");
				double num2 = sc.nextDouble();
				System.out.print("3번 정수를 입력하세요: ");
				double num3 = sc.nextDouble();
				
				System.out.print("3개 실수의 평균은 " + a.getAverage(num1, num2, num3)+ "입니다.");
			}
		}
		
	}

}
