package �����;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


// ���۸� ����� ����� �Լ��� ����ϱ� ���� import

import java.util.Scanner;
//�� ������ ���۸� ����� �Է¹� Scanner�� ����ϱ� ���� import

public class inputoutput {
	
	public void main(String[] args) throws IOException {
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
		StringTokenizer st = new StringTokenizer(br.readLine(), "������ ���ڳ� ����(=������)");
		
		
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
		
	}
}
