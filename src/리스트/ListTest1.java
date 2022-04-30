package ����Ʈ;

import java.util.ArrayList; // ����Ʈ ����� ���� import

public class ListTest1 {
	
	int Num = 50;
	
	public static void main(String[] args) {
		
		/* �⺻ ���� �迭 */
		int[] IntArray1 = new int[] { 1,2 }; // 1,2 ��� 2���� ���� �迭 ���� * int[] a / int a[] �� �� �Ȱ���.
		float floatArray1[] = new float[3]; // 3���� ��Ҹ� ���� �� �ִ� �迭 ����
		String[][] StringArray1 = new String[][] {{"1","2"},{"3","4"}}; // 2x2 �� ��Ҹ� ���� �� �ִ� �迭 ���� * ������ �迭 String[2][2]�� ����
		
		/* �迭 ���� */
		int[] IntArray2 = new int[3];
		System.arraycopy(IntArray1, 0, IntArray2, 0, 2); // (������ ���� �迭, ���� �迭���� ������ ó�� ��ġ��, �����ؼ� ������ �迭, ���簪�� ������ ó�� ��ġ��, ������ ��� ����)
			// �� ��ü�� �ڷ��� �迭�� ������ �� ���� �迭�� ���� �����Ű�� ����� �迭�� ���� �Ȱ��� ���Ѵ�. (��ü �ν��Ͻ��� �ּ� �̹Ƿ� ������ ����)
		System.out.println("�迭 ����1"); // �迭�� �ν��Ͻ��� �ƴ� �⺻ ���̶�� �������� �ٲ�� ����
		IntArray1[1] = 3;
		System.out.println(IntArray2[1]);
		IntArray2[1] = 4;
		System.out.println(IntArray2[1]);
		IntArray1[1] = 2;
		System.out.println(IntArray2[1]);
		
		/* ���� for�� */
		System.out.println("���� for��");
		for (int a : IntArray2) { // ���� for�� IntArray1�� ��Ұ��� �տ������� a �� �����ϸ� �ݺ�
			System.out.println(a);
		}
		
		/* ArrayList Ŭ���� ���� �迭 */
		ArrayList<ListTest1> ListArray1 = new ArrayList<ListTest1>(); // ArrayList<E> ���� E�� ���׸� �ڷ���
		ArrayList<ListTest1> ListArray2 = new ArrayList<ListTest1>(2);
		ArrayList<Integer> ListArray3 = new ArrayList<Integer>();
		ArrayList ListArray3_1 = new ArrayList();
		
		/* ArrayList 2���� �迭1 */
		ArrayList<Integer>[] ListArray4 = new ArrayList[10];
		for(int i = 0; i < 10; i++) {
			ListArray4[i] = new ArrayList<Integer>();
		}
		
		/* ArrayList 2���� �迭2 (�ٸ� �迭�� �ּҸ� �ҷ��� �������� ������ ������ �޴°� ����) */
		System.out.println("ArrayList 2���� �迭2");
		ArrayList<ArrayList<Integer>> ListArray5 = new ArrayList<>();
		ArrayList<Integer> ListArray5_1 = new ArrayList<>();
		ListArray5.add(ListArray5_1);
		ListArray5_1.add(100);
		System.out.println(ListArray5.get(0).get(0));
		
		/* ArrayList (�������� �迭�� ����� �� ����)
		 * ArrayList<���׸� �ڷ���> �迭�̸� = new ArrayList<���׸� �ڷ���>(��� ����); * <���׸� �ڷ���> �����ϰ� ���� ����
		 * ArrayList.add(E e) ��� �߰� * add(int index, E e) �ش� �ε����� �� �߰�, ���� ���� �и�
		 * .size() �迭 ũ�� ��ȯ
		 * .get(int index) �ش� ��ġ�� ��Ұ� ��ȯ
		 * .set(int index, E e) �ش� ��ġ�� ��Ұ� ��ü
		 * .indexOf(value) �ش� ���� �ִ� index�� ��ȯ
		 * .contains(value) �ش� ���� �ִ��� ��/���� �� ��ȯ
		 * .clear() ��Ҹ� ���� ���
		 * .addAll(ArrayList arraylist) �ش� ����Ʈ�� �� ��� �߰�	
		 * .remove(int index) �ش� ��ġ�� ��Ұ� ��ȯ �� ����
		 * .isEmpty() �迭�� ����ִ��� Ȯ��
		*/
		ListArray1.add(new ListTest1());
		ListArray1.add(new ListTest1());
		ListArray1.set(1, new ListTest1());
		ListArray2.addAll(ListArray1);
		
		System.out.println("�迭 ����2");
		System.out.println("���� ���� �� = "+ ListArray2.get(0).Num);
		ListArray1.get(0).Num = 70;
		System.out.println("���� ���� �� = "+ ListArray2.get(0).Num); // ��ü �迭�� �������� �����Ű�� ������ �迭�� ����ȴ�. (�ּҸ� �̿��ϱ� ����)
	}
}
