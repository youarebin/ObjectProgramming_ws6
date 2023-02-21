//20220740_컴퓨터학과_가유빈
import java.util.Scanner;

public class Practice46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Movie m = new Movie();
		
		System.out.print("영화정보를 입력하세요.\n");
		System.out.print("영화제목은?");
		String title = sc.next();
		m.setTitle(title);
		System.out.print("평점은?");
		int score = sc.nextInt();
		m.setScore(score);
		System.out.print("감독은? ");
		String director = sc.next();
		m.setDirector(director);
		System.out.print("개봉 년도는?");
		int year = sc.nextInt();
		m.setYear(year);
		
		System.out.print("입력한 영화의 정보입니다.\n");
		System.out.print(m.toString());
	}

}
