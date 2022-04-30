package 리스트;

import java.util.ArrayList; // 리스트 사용을 위한 import

public class ListTest1 {
	
	int Num = 50;
	
	public static void main(String[] args) {
		
		/* 기본 제공 배열 */
		int[] IntArray1 = new int[] { 1,2 }; // 1,2 요소 2개를 가진 배열 생성 * int[] a / int a[] 둘 다 똑같다.
		float floatArray1[] = new float[3]; // 3개의 요소를 넣을 수 있는 배열 생성
		String[][] StringArray1 = new String[][] {{"1","2"},{"3","4"}}; // 2x2 의 요소를 넣을 수 있는 배열 생성 * 이차원 배열 String[2][2]도 가능
		
		/* 배열 복사 */
		int[] IntArray2 = new int[3];
		System.arraycopy(IntArray1, 0, IntArray2, 0, 2); // (복사할 원본 배열, 원본 배열에서 복사할 처음 위치값, 복사해서 저장할 배열, 복사값을 저장할 처음 위치값, 복사할 요소 개수)
			// 단 객체의 자료형 배열을 복사한 후 원본 배열의 값을 변경시키면 복사된 배열의 값도 똑같이 변한다. (객체 인스턴스는 주소 이므로 포인터 개념)
		System.out.println("배열 복사1"); // 배열이 인스턴스가 아닌 기본 값이라면 원본값이 바뀌여도 무관
		IntArray1[1] = 3;
		System.out.println(IntArray2[1]);
		IntArray2[1] = 4;
		System.out.println(IntArray2[1]);
		IntArray1[1] = 2;
		System.out.println(IntArray2[1]);
		
		/* 향상된 for문 */
		System.out.println("향상된 for문");
		for (int a : IntArray2) { // 향상된 for문 IntArray1의 요소값을 앞에서부터 a 에 저장하며 반복
			System.out.println(a);
		}
		
		/* ArrayList 클래스 제공 배열 */
		ArrayList<ListTest1> ListArray1 = new ArrayList<ListTest1>(); // ArrayList<E> 에서 E는 제네릭 자료형
		ArrayList<ListTest1> ListArray2 = new ArrayList<ListTest1>(2);
		ArrayList<Integer> ListArray3 = new ArrayList<Integer>();
		ArrayList ListArray3_1 = new ArrayList();
		
		/* ArrayList 2차원 배열1 */
		ArrayList<Integer>[] ListArray4 = new ArrayList[10];
		for(int i = 0; i < 10; i++) {
			ListArray4[i] = new ArrayList<Integer>();
		}
		
		/* ArrayList 2차원 배열2 (다만 배열은 주소를 불러와 기존값의 변동에 영향을 받는걸 주의) */
		System.out.println("ArrayList 2차원 배열2");
		ArrayList<ArrayList<Integer>> ListArray5 = new ArrayList<>();
		ArrayList<Integer> ListArray5_1 = new ArrayList<>();
		ListArray5.add(ListArray5_1);
		ListArray5_1.add(100);
		System.out.println(ListArray5.get(0).get(0));
		
		/* ArrayList (변동적인 배열을 사용할 때 좋음)
		 * ArrayList<제네릭 자료형> 배열이름 = new ArrayList<제네릭 자료형>(요소 개수); * <제네릭 자료형> 생략하고 생성 가능
		 * ArrayList.add(E e) 요소 추가 * add(int index, E e) 해당 인덱스에 값 추가, 뒤쪽 값은 밀림
		 * .size() 배열 크기 반환
		 * .get(int index) 해당 위치의 요소값 반환
		 * .set(int index, E e) 해당 위치의 요소값 교체
		 * .indexOf(value) 해당 값이 있는 index값 반환
		 * .contains(value) 해당 값이 있는지 참/거짓 값 반환
		 * .clear() 요소를 전부 비움
		 * .addAll(ArrayList arraylist) 해당 리스트의 값 모두 추가	
		 * .remove(int index) 해당 위치의 요소값 반환 후 제거
		 * .isEmpty() 배열이 비어있는지 확인
		*/
		ListArray1.add(new ListTest1());
		ListArray1.add(new ListTest1());
		ListArray1.set(1, new ListTest1());
		ListArray2.addAll(ListArray1);
		
		System.out.println("배열 복사2");
		System.out.println("원본 변경 전 = "+ ListArray2.get(0).Num);
		ListArray1.get(0).Num = 70;
		System.out.println("원본 변경 후 = "+ ListArray2.get(0).Num); // 객체 배열은 원본값을 변경시키면 복사한 배열도 변경된다. (주소를 이용하기 때문)
	}
}
