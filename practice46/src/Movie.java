//20220740_컴퓨터학과_가유빈

public class Movie {

	private String title, director;
	private int score, year;
	// 설정자와 접근자 추가
	public void setTitle(String t) {
		title = t;
	}
	public void setDirector(String d) {
		director = d;
	}
	public void setScore(int s) {
		score = s;
	}
	public void setYear(int y) {
		year = y;
	}
	public String getTitle() {
		return title;
	}
	public String getDirector() {
		return director;
	}
	public int getScore() {
		return score;
	}
	public int getYear() {
		return year;
	}
	public String toString() {
		String rslt = "";
		
		rslt += "제목: " + title;
		rslt += "\n평점: " + score + "점";
		rslt += "\n감독: " + director;
		rslt += "\n개봉년도: " + year + "년";
		
		return rslt;
	}

}
