//20220740_컴퓨터학과_가유빈
import java.util.Scanner;

public class Practice43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Date date = new Date();

		System.out.print("태어난 년도를 입력하세요: ");
		int year = sc.nextInt();
		date.setYear(year);
		System.out.print("태어난 월을 입력하세요: ");
		int month = sc.nextInt();
		date.setMonth(month);
		System.out.print("태어난 날짜를 입력하세요: ");
		int day = sc.nextInt();
		date.setDay(day);
		
		System.out.println("당신의 생일은 " + date.toString());
		int tmpYear = year + 20;
		date.setYear(tmpYear);
		System.out.println("당신의 성년일은 " + date.toString());
		date.setYear(year);
		System.out.println("당신의 생일은 " + date.toString());
	}

}
