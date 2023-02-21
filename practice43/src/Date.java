//20220740_컴퓨터학과_가유빈
public class Date {

	private int year;
	private int month;
	private int day;
	
	public String toString() {
		return getYear() + "년 " + getMonth() + "월 " + getDay() + "일 입니다.";
	}
	//설정자
	public void setYear(int y) {
		year = y;
	}
	public void setMonth(int m) {
		month = m;
	}
	public void setDay(int d) {
		day = d;
	}
	//접근자
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
}
