package practice;

public class prac3 {
	int ID;
	String Name;
	int grade;
	String address;
	
	public prac3() {
		//this(ID����,Name����,grade����,address����); ���� prac3 �����ڸ� ȣǮ�� �� �ִ�.
	} // ����Ʈ ������
	
	public prac3(int pID, String pname, int pgrade, String paddress) { // ������ - �ν��Ͻ��� ���� �� �ѹ��� ������ ���� �� �ִ�. ������ ����Ʈ �����ڸ� ��������� �Ѵ�.
		ID = pID;
		Name = pname;
		grade = pgrade;
		address = paddress;
	}
	
	public void showStudentInfo( ) {
		System.out.println(Name + "," + address);
	}
	
	public void showThis() {
		System.out.println(this); // ��Ű����.Ŭ������@�ּ�
		this.showStudentInfo(); // this ����� ��� -> ������ �ν��Ͻ��� �ڽ��� ����Ų��.
	}
	
	public static int Numbup( ) { // pracŬ������ Numb ���� �Լ�.
		prac.Numb += 1;
		System.out.println(prac.Numb);
		return 0;
	}
}
