package practice;


//�� �� �ּ�

/*
���� �� �ּ�
���� �� �ּ�
*/


import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
// ���۸� ����� ����� �Լ��� ����ϱ� ���� import

import java.util.Scanner;
// �� ������ ���۸� ����� �Է¹� Scanner�� ����ϱ� ���� import
import java.util.ArrayList;
// �� ������ �迭 ArrayList�� ����ϱ� ���� import


public class prac { // class ����
	
	public static int Numb = 0; // �������� static
	/*
	 * �ش� Ŭ������ ���ӵǾ��ִ� ��� �ν��Ͻ��� �����ϴ� ������ ����� �� �ִ�.
	 * �й�, ���� ��ȣ� ����� �� �ִ�.
	*/
	
	int Numb2 = 0;
	/* (�������)
	 * �ش� Ŭ������ ���� �ν��Ͻ����� �������� �ʰ� ���������� ������ ��.
	 * �ν��Ͻ��� ���� �� �ڵ����� ����
	*/
	
	public static int add (int num1, int num2) { // add �Լ� ���� (Ŭ���� �Լ�)
		int result;
		result = num1 + num2;
		return result;
	}
	/*
	 * �� ���ڸ� �Է¹޾� ���� �� return ������ �������� �Լ���.
	*/
	
	
	public static void main(String[] args) throws IOException { // �����Լ� ����
		/*
		throws IOException - BufferedWriter,Reader ����� �߻��ϴ� IOE ���� ���ѱ��
		*/
		
		
		/*����� �Լ� ���� */
		
		// * 1. �⺻ �Է�
			// println = �Է� �� �ٹٲ�, print = �ٹٲ�X, printf = �ٹٲ�X ("%d", ��) ����(format)
		System.out.println("�ڹٴ� ������"); // �⺻������ �����Ǵ� ��� �Լ�.
		
		// * 2. buffered �����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter �ν��Ͻ� �߰� (���)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader �ν��Ͻ� �߰� (�Է�)
		
			// buffered �Է�
		String str; // �Է°��� �����ϴ� ���� 
		bw.write("�Է�:");
		bw.flush(); // ���� ��� + ���� ���� ����
		str = br.readLine(); // ���ۿ� �Է¹ް� str�� ����.
		
			// buffered ���
		bw.write(str + " Hello\n"); // write()�� �ٹٲ� ���� \n�� �ڵ����� ��ȯ���� ����.
		bw.flush();
		//bw.close(); // ���� �ݱ� * �� �κп��� ������ ���� scanner ������ ������ �ȵȴ�.
		
		// * 3. scanner �Է�
		Scanner sc = new Scanner(System.in); // Scanner �ν��Ͻ� �߰� (�Է�)
		String str2;
		System.out.print("�Է�:");
		str2 = sc.nextLine(); // ���ۿ� �Է¹ް� str2�� ����.
		System.out.println(str2);
		sc.close(); // scanner �ݱ�
		/*
		 * scanner �޼ҵ�
		 * close() scanner �ݱ�
		 * hasNext() ������ �ԷµǾ����� �Ǵ� (true,false���� ��ȯ)(�Էµ� �����͸� �����´ٸ� �Է� ���Ѱ����� ����)
		 * next() ���� ��ū �������� ���� ��ȯ
		 * next�ڷ���() �ش�Ǵ� �ڷ����� ������ ��ȯ ex nextint = int�� ������ ��ȯ
		 * reset() �� scanner �ʱ�ȭ
		 * toString() �� �Էµ� ������ String���� ��ȯ
		 * useDelimiter(String pattern) pattern�� �ش��ϴ� ������ �����ڷ� ���.
		 
		 ���� ����
		public static void main(String[] args) {
			String str = "3.14.15.92";
			Scanner sc = new Scanner(str).useDelimiter("\\.");
			while(sc.hasNext()) { System.out.println(sc.nextInt()); }
			sc.close();
		}

		��ó: https://eskeptor.tistory.com/68 [Hello World]
		 */
		
		
		
		/* �����Լ� ���� ����*/
		
		int num = 0;
		int level = 10;
		char level2 = 'L';
		float level3 = 3.14F;
		double level4 = 3.14;
		String level5 = "level5";
		boolean t = true;
		boolean f = (level2 == level); // == equal, && and, || or
		char level6 = (level > 10) ? 'U' : 'D'; // level�� ���� 10 �̻��̸� 'U' �ƴϸ� 'D' ����
		
		/*  �迭
		 * �迭 * �ڷ���[] �����̸� = new �ڷ���[����]; or �ڷ��� �迭�̸�[] = new �ڷ���[����];
		 * prac[] prac_s = new prac[����]; �� �����ϴ�. �ٸ� prac[n] = new prac(); ���� ������ �ʱ�ȭ�ؾ��Ѵ�.
		*/
		int[] level7 = new int[10];
		int[] level8 = new int[] {1,2,3}; // ��Ҹ� ���� �ʱ�ȭ�� ���� ũ��(����)�� �����Ѵ�.(������ ������ ���� �߻�)
		// �� �����ϰ� int[] level8 = {1,2,3}; ���� ����ص� �ȴ�.
		// �迭+ ���� for��
		System.out.println("����for�� ���� �κ�");
		for(int n: level8) {
			System.out.print(n+",");
		}
		System.out.println("\b ");
		
		int[][] level8l8= new int[][] {{1,2},{3,4}}; // 2���� �迭
		
		
		// �迭 ����
		int[] level9 = new int[3];
		System.arraycopy(level8, 0, level9, 0, 3); // (������ ���� �迭, ���� �迭���� ������ ó�� ��ġ��, �����ؼ� ������ �迭, ���簪�� ������ ó�� ��ġ��, ������ �� ����)
		// �迭�� ������ �� ���� �迭�� ���� �����Ű�� ����� �迭�� ���� �Ȱ��� ���Ѵ�. (�迭�� �ּ� �̹Ƿ� ������ ����)
		
		// ArrayList
		/* �������� �迭�� ����� �� ����
		 * ArrayList<���׸� �ڷ���> �迭�̸� = new ArrayList<���׸� �ڷ���>();
		 * ArrayList.add(E e) ��� �߰�
		 * .size() �迭 ũ�� ��ȯ
		 * .get(int index) �ش� ��ġ�� ��Ұ� ��ȯ
		 * .remove(int index) �ش� ��ġ�� ��Ұ� ��ȯ �� ����
		 * .isEmpty() �迭�� ����ִ��� Ȯ��
		*/
		ArrayList<prac3> level10 = new ArrayList<prac3>(); // ���׸� �ڷ���(E)�δ� ������ �ڷ��� (prac3) ���� ����.
		level10.add(new prac3()); // �迭�� ��� �߰�
		System.out.println(level10.get(0)); // �ش� �ε��� ��Ұ� ���
		
		/* ������ ��� ���� */		
		System.out.println("������ ��� ���� �κ�");
		System.out.println(level);
		System.out.println(level2);
		System.out.println((int)level2);
		System.out.println(level3 + " " + level4);
		System.out.println(level3 + level4);
		System.out.printf(level5 + "%n1 \n"); // %n �� \n �Ѵ� ����
		System.out.println(t + " " + f);
		System.out.println(level > level4 ? "True" : "False"); // level > level4�� ���̸� "True" �����̸� "False"�� ��ȯ
		if(level > 5) {
			System.out.println("level�� 5���� Ů�ϴ�.");
		}
		else if (level == 5) {
			System.out.println("level�� 5�Դϴ�.");
		}
		else {
			System.out.println("level�� 5���� �۽��ϴ�.");
		}
		switch(level) { // ��ȣ ���� int ������ �޴´�.
			case 10 :
				System.out.println("level�� 10�Դϴ�."); // break�� ������ ���� case�� �����Ѵ�.
				break;
			case 5: // ���� case�� �ΰ������ ' case 1: case2: case 3: ���๮ ' �������� ���� �� �ִ�.
				System.out.println("level�� 5�Դϴ�.");
				break;
		}
		while(num < 3) { // ���� ������ �� ���� �ݺ�
			num++;
			System.out.print(num);
		}
		System.out.println("");
		for(num = 1; num <= 5; num++) { // num�� 1���� 5���� 1�������ϸ� �ݺ�
			if(num == 3) { // num �� 3�̸� ������ ���๮�� �������� �ʰ� ���� �ݺ����� �Ѿ��.
				continue;
			}
			System.out.print(num);
		}
		System.out.print("\n");
		// �迭 ���
		System.out.println("level8 = " + level8); // level8 �迭�� �ּ� ���
		System.out.println("level8[1] = " + level8[1]); // level8 �迭�� �� ��° �� ���
		
		
		
		
		/* ������ �ν��Ͻ�, �Լ� Ȱ�� */
		
		System.out.println("�ν��Ͻ�, �Լ� Ȱ�� �κ�\n" + add(level,3)); // ���� ������ add�Լ��� �̿�
		prac3 prac_s = new prac3(); // prac3 ������ prac_s �ν��Ͻ� ��ü ����
		prac_s.ID = 1111;
		prac_s.Name = "user1";
		prac_s.grade = 1;
		prac_s.address = "~~~";
		prac_s.showStudentInfo( ); // prac_s �� showStudentInfo( ) �޼ҵ� ����
		prac_s.showThis();
		prac3.Numbup(); // Numb �Լ��� 1 ���� prac_s.Numbup�� ����
	}
}
