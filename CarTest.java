package exam_class_basic;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car ();
		
		/*myCar.speed = 0;
		myCar.gear = 1;
		myCar.color = "red";
		*/
		
		myCar.carData(0,  1, "red");
		
		//객체의 메소드 호출 - 참조변수명.메서드()
		
		myCar.speedUp(20);
		myCar.printData();
		System.out.println(myCar.toString());
		System.out.println();
		
		Car yourCar = new Car();
		
		/* yourCar.gear = 3;
		//yourCar.speed = 30;
		//yourCar.color = "blue";
		*/
		//필드에 값 대입
		yourCar.carData(30, 3, "blue");
		
		yourCar.speedDown(10); //객체의 메소드 호출
		yourCar.printData();	//출력방법 1
		System.out.println(yourCar.toString()); //출력방법 2
		

	}

}
