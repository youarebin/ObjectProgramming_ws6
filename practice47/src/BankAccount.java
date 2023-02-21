//20220740_컴퓨터학과_가유빈

public class BankAccount {
	private String name, accoutNo;
	private int balance;
	private double rate;
	// 설정자와 접근자 추가
	public void setName(String n) {
		name = n;
	}
	public void setAccoutNo(String a) {
		accoutNo = a;
	}
	public void setBalance(int b) {
		balance = b;
	}
	public void setRate(double r) {
		rate = r;
	}
	public String getName() {
		return name;
	}
	public String getAccoutNo() {
		return accoutNo;
	}
	public int getBalance() {
		return balance;
	}
	public double getRate() {
		return rate;
	}
	public String toString() {
		String rslt = "";
		
		rslt += "이름: " + name;
		rslt += "\n계좌 번호: " + accoutNo;
		rslt += "\n잔액: " + balance;
		rslt += "\n이자율: " + rate + "%";
		rslt += "\n이자: " + calcInterest() + "원";
		
		return rslt;
	}
	private int calcInterest() {
		return (int)(rate*balance/100);
	} // 잔액과 이자율을 이용하여 이자 계산
}
