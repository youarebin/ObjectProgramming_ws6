//20220740_컴퓨터학과_가유빈

public class Date {

	int year;
	int month;
	int day;
	
	public String toString() {
		String rslt = "";
		
		rslt += year + "년";
		rslt += month + "월";
		rslt += day + "일";
		
		return rslt;
	}
}
