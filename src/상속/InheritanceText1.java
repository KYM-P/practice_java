package ���;

import java.util.ArrayList;

public class InheritanceText1 {
	
	protected int A1 = 50; // protected : ��ӹ��� �ν��Ͻ��� ��� ����
	
	public InheritanceText1() { } // ����Ʈ ������
	
	public InheritanceText1(int a1) { A1 = a1; } // �Ű����� ������
	
	public void ShowInfo() {
		System.out.println(this + " A1 = " + A1);
	}
	
	public void Text1() {
		System.out.println("Text1");
	}
	
	public static void main(String[] args) {
		
		ArrayList<InheritanceText1> InheritanceList = new ArrayList<InheritanceText1>(); // InheritanceText1 ���� �迭 ����
		
		for (int i = 0; i< 2; i++) { // �迭�� ��� �߰�
			InheritanceList.add(new InheritanceText2( 70 + i )); // InheritanceText2������ InheritanceText1�������� �����Ͽ� �迭�� �߰� * �迭�� ���Ŀ� ������
		}
		
		for (InheritanceText1 Text : InheritanceList) { // ���� for��
			Text.ShowInfo();
			System.out.println(Text.A1);
			// System.out.println(Text.A2); // Text �� ������ InheritanceText1�̹Ƿ� ������ �ڷ����� InheritanceText2���� A2�� ��� �Ұ���
		}
		
		for (int i = 0; i < InheritanceList.size(); i++) {
			InheritanceText1 Test1 = InheritanceList.get(i);
			if (Test1 instanceof InheritanceText2) { // Test1 �� ���� �ڷ����� InheritanceText2���� Ȯ��
				InheritanceText2 T = (InheritanceText2)Test1; // �ٿ� ĳ����
				System.out.println("T.A2 " + i + " = " + T.A2); // �ٿ�ĳ�������� InheritanceText2�������� �ٲ�� A2 ��� ����
			}
			else {
				System.out.println("�������� �ʽ��ϴ�.");
			}
		}
	}

}
