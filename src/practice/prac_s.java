package practice;

public class prac_s extends prac_m{ // prac_m 에게 상속받음
	
	
	int A2 = 51;
	
	//super(); 상위 클래스를 받아오는 예약어 super / 다음과 같이 쓰면 상위 클래스의 디폴트 생성자 실행
	
	public prac_s(int a, int b) {
		super(3, 4); // 하위 클래스를 생성할 때 자동으로 상위 클래스를 생성하므로 상위 클래스의 생성자에 필요한 매개변수를 super을 통해 생성.
		System.out.printf(super.B2);
	}
	
	public void ppp () {
		//B1 = "B2";	상속전 클래스의 B1은 private 예약어 라서 상속받은 클래스여도 사용할 수 없다.
		B2 = "B3"; //	protected 예약어로 선언한 변수는 상속받았을 때 사용할 수 있다.
	}
	public void pp () { // 상위 클래스의 pp 매소드를 재정의
		prac_m Test1 = new prac_s(4, 5); // 하위 클래스 prac_s 를 상위 클래스 prac_m 의 자료형으로 생성 가능 / 단 기능은 prac_m 까지만 사용 가능.
		/*
		 * if (A instanceof B){ A의 원래 자료형이 B의 자료형인지 확인 / [아무 자료형] A = new B(); 인지 확인하는 과정
		 * 	[새로운 자료형] [새로운 이름] = (새로운 자료형)A;    다운 캐스팅
		 * }
		 */
	}
}
