package exam_class_basic;

public class MovieTest {
	/*1. 2개의영화 정보를 직접 대입하여 출력해 주세요. 이 작업이 완료되면 주석 처리.
	 public static void main(String[] args) {
	 
	 } */
	
	/* 2. 사용자로 하여금 2개의 영화 정보를 입력받아 출력해 주세요. */
	public static void main(String[] args) {
		Movie mv = new Movie();
		
		mv.movieData("Disappear with wind", "Toto", 2011);
		System.out.println(mv.toString());

	}

}
