//20220740_컴퓨터학과_가유빈
import java.util.Scanner;

public class Practice47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount();

		ba.setName("김동덕");
		ba.setAccoutNo("1234-5678");
		ba.setBalance(100);
		ba.setRate(0.0);
		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		System.out.print(ba.toString());
		
		ba.setName("홍길동");
		ba.setAccoutNo("9999-2531");
		ba.setBalance(2000);
		ba.setRate(2.15);
		System.out.println("\n\n두 번째 은행 계좌의 정보입니다.");
		System.out.print(ba.toString());
	}

}
