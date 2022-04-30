package practice;

public class prac3 {
	int ID;
	String Name;
	int grade;
	String address;
	
	public prac3() {
		//this(ID내용,Name내용,grade내용,address내용); 으로 prac3 생성자를 호풀할 수 있다.
	} // 디폴트 생성자
	
	public prac3(int pID, String pname, int pgrade, String paddress) { // 생성자 - 인스턴스를 만들 때 한번에 내용을 넣을 수 있다. 하지만 디폴트 생성자를 선언해줘야 한다.
		ID = pID;
		Name = pname;
		grade = pgrade;
		address = paddress;
	}
	
	public void showStudentInfo( ) {
		System.out.println(Name + "," + address);
	}
	
	public void showThis() {
		System.out.println(this); // 페키지명.클래스명@주소
		this.showStudentInfo(); // this 예약어 사용 -> 생성된 인스턴스인 자신을 가리킨다.
	}
	
	public static int Numbup( ) { // prac클래스의 Numb 관련 함수.
		prac.Numb += 1;
		System.out.println(prac.Numb);
		return 0;
	}
}
