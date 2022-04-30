package LinkedList.prac;

public class LinkedList {
	private Node head; // 첫 번째 노드
	private Node tail; // 마지막 노드
	private int size = 0; // 크기
	
	private class Node{
		private Object data; // 데이터
		private Node next; // 다음 노드 주소
		
		public Node(Object input) { // Node 객체 생성자
			this.data = input;
			this.next = null;
		}
		public String toString() {
			return String.valueOf(this.data); // 문자열로 변환
		}
	}
	public void addFirst(Object input) { // 첫 번째 노드로 추가
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if(head.next == null) {
			tail = head;
		}
	}
	public void addLast(Object input) { // 마지막 노드로 추가
		Node newNode = new Node(input);
		//newNode.next =
	}
}
