package LinkedList.prac;

public class LinkedList {
	private Node head; // ù ��° ���
	private Node tail; // ������ ���
	private int size = 0; // ũ��
	
	private class Node{
		private Object data; // ������
		private Node next; // ���� ��� �ּ�
		
		public Node(Object input) { // Node ��ü ������
			this.data = input;
			this.next = null;
		}
		public String toString() {
			return String.valueOf(this.data); // ���ڿ��� ��ȯ
		}
	}
	public void addFirst(Object input) { // ù ��° ���� �߰�
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if(head.next == null) {
			tail = head;
		}
	}
	public void addLast(Object input) { // ������ ���� �߰�
		Node newNode = new Node(input);
		//newNode.next =
	}
}
