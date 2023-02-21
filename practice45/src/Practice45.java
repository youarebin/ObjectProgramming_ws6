//20220740_컴퓨터학과_가유빈
import java.util.Scanner;

public class Practice45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		
		System.out.print("사각형의 가로: ");
		int width = sc.nextInt();
		r.setWidth(width);
		
		System.out.print("사각형의 세로: ");
		int height = sc.nextInt();
		r.setHeight(height);
		
		System.out.println("사각형의 가로는 "+ r.getWidth() + "이고, 세로는" + r.getHeight() + "입니다.");
		System.out.print("사각형의 넓이는 "+ r.getWidth() * r.getHeight() + "이고, 둘레는" + (r.getWidth()+r.getHeight())*2 + "입니다.");
	}

}
