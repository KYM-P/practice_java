package 상속;

public class InheritanceText2 extends InheritanceText1{
	
	int A2 = 60;
	
	public InheritanceText2() { } // 디폴트 생성자
	
	public InheritanceText2(int a2) {  // 매개변수 생성자
		super( a2 ); // 상위 클래스 생성자 호출
		A2 = a2;
	}
	
	public void ShowInfo() { // InheritanceText1의 ShowInfo 재정의
		System.out.println(this + " A2 = " + A2);
	}
	
	public void SuperShowInfo() {
		super.ShowInfo();
	}
}
