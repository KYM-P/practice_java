package ���;

public class InheritanceText2 extends InheritanceText1{
	
	int A2 = 60;
	
	public InheritanceText2() { } // ����Ʈ ������
	
	public InheritanceText2(int a2) {  // �Ű����� ������
		super( a2 ); // ���� Ŭ���� ������ ȣ��
		A2 = a2;
	}
	
	public void ShowInfo() { // InheritanceText1�� ShowInfo ������
		System.out.println(this + " A2 = " + A2);
	}
	
	public void SuperShowInfo() {
		super.ShowInfo();
	}
}
