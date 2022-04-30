package 상속;

import java.util.ArrayList;

public class InheritanceText1 {
	
	protected int A1 = 50; // protected : 상속받은 인스턴스만 사용 가능
	
	public InheritanceText1() { } // 디폴트 생성자
	
	public InheritanceText1(int a1) { A1 = a1; } // 매개변수 생성자
	
	public void ShowInfo() {
		System.out.println(this + " A1 = " + A1);
	}
	
	public void Text1() {
		System.out.println("Text1");
	}
	
	public static void main(String[] args) {
		
		ArrayList<InheritanceText1> InheritanceList = new ArrayList<InheritanceText1>(); // InheritanceText1 형식 배열 생성
		
		for (int i = 0; i< 2; i++) { // 배열에 요소 추가
			InheritanceList.add(new InheritanceText2( 70 + i )); // InheritanceText2형식을 InheritanceText1형식으로 생성하여 배열에 추가 * 배열의 형식에 맞춰짐
		}
		
		for (InheritanceText1 Text : InheritanceList) { // 향상된 for문
			Text.ShowInfo();
			System.out.println(Text.A1);
			// System.out.println(Text.A2); // Text 의 형식은 InheritanceText1이므로 본래의 자료형이 InheritanceText2여도 A2는 사용 불가능
		}
		
		for (int i = 0; i < InheritanceList.size(); i++) {
			InheritanceText1 Test1 = InheritanceList.get(i);
			if (Test1 instanceof InheritanceText2) { // Test1 의 본래 자료형이 InheritanceText2인지 확인
				InheritanceText2 T = (InheritanceText2)Test1; // 다운 캐스팅
				System.out.println("T.A2 " + i + " = " + T.A2); // 다운캐스팅으로 InheritanceText2형식으로 바뀌어 A2 사용 가능
			}
			else {
				System.out.println("지원되지 않습니다.");
			}
		}
	}

}
