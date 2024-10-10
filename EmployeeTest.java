package exam_class_basic;

public class EmployeeTest {

	public static void main(String[] args) {
		/* [실행 결과]
		 * 직원 정보[ 사원명: 홍길동 , 전화번호 = 010-2345-3476, 급여 = 1000000 ]
		 * 직원 정보[ 사원명: 김철수 , 전화번호 = 010-3423-5242, 급여 = 5000000 ]
		 */
		
		//실행 클래스
		
		Employee emp = new Employee();
		//직접 필드에 값 대입
		//emp.name = "홍길동";
		//emp.phoneNumber = "010-2345-3476";
		//emp.salary = 1000000;
		
		//메서드를 통해 필드에 값 대입
		emp.employeeData("홍길동, 010-2345-3476", 1000000);
		System.out.println(emp.toString());
		
		Employee emp02 = new Employee();
		
		//emp02.name = "김철수";
		//emp02.phoneNumber = "010-3423-5242";
		//emp02.salary = 7000000;
		
		emp02.employeeData("김철수", "010-3423-5242", 5000000);
		System.out.println(emp02.toString());
	

	}

}
