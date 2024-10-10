package exam_class_basic;

public class Car {

		//필드 정의
		public int speed; 
		public int gear;
		public String color;
		
		//전체 필드의 값 대입
		public void carData (int s, int g, String c) {
			
			speed = s;
			gear = g;
			color = c;
		}
		
		public void speedUp(int s) {
			speed += s;
		}
		public void speedDown(int s) {
			speed -= s;
		}
		public void printData() {
			System.out.println("속도: " + speed + "기어: " + gear + "색상: "+ color);
			
		}
		public String toString() {
			return "속도 : " + speed + "기어: " +gear + " 색상: " + color;
		
		}

}
