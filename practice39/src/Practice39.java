//20220740_컴퓨터학과_가유빈
import java.util.Scanner;

public class Practice39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Date birthday = new Date();
		Date adultday = new Date();
		
		System.out.print("태어난 년도를 입력하세요: ");
		birthday.year = sc.nextInt();
		System.out.print("태어난 월을 입력하세요: ");
		birthday.month = sc.nextInt();
		System.out.print("태어난 날짜를 입력하세요: ");
		birthday.day = sc.nextInt();
		
		adultday.year = birthday.year + 20;
		adultday.month = birthday.month;
		adultday.day = birthday.day;
		
		System.out.print("당신의 생일은 ");
		birthday.print();
		System.out.print("\n당신의 성년일은 ");
		adultday.print();
		System.out.print("\n당신의 생일은 ");
		birthday.print();
	}

}
