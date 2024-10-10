package exam_class_basic;

public class Movie {
	
	public String title; 	//영화제목
	public String director; //감독이름
	public int year;  		//년도 
	
	public void movieData(String t, String d, int y) {
		title = t;
		director = d;
		year = y;
		
	}

	
	public String toString() {
		return String.format("영화정보[ 영화제목: %s , 영화감독 = %s, 개봉 = %d]",
				title, director, year);
	}
}
