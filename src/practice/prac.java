package practice;


//한 줄 주석

/*
여러 줄 주석
여러 줄 주석
*/


import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
// 버퍼를 사용한 입출력 함수를 사용하기 위한 import

import java.util.Scanner;
// 더 간단한 버퍼를 사용한 입력문 Scanner을 사용하기 위한 import
import java.util.ArrayList;
// 더 간단한 배열 ArrayList를 사용하기 위한 import


public class prac { // class 생성
	
	public static int Numb = 0; // 전역변수 static
	/*
	 * 해당 클래스에 종속되어있는 모든 인스턴스가 공유하는 값으로 사용할 수 있다.
	 * 학번, 차량 번호등에 사용할 수 있다.
	*/
	
	int Numb2 = 0;
	/* (멤버변수)
	 * 해당 클래스로 만든 인스턴스들이 공유하지 않고 개별적으로 가지는 값.
	 * 인스턴스를 만들 때 자동으로 생성
	*/
	
	public static int add (int num1, int num2) { // add 함수 생성 (클래스 함수)
		int result;
		result = num1 + num2;
		return result;
	}
	/*
	 * 두 숫자를 입력받아 더한 후 return 값으로 내보내는 함수다.
	*/
	
	
	public static void main(String[] args) throws IOException { // 메인함수 시작
		/*
		throws IOException - BufferedWriter,Reader 사용중 발생하는 IOE 예외 떠넘기기
		*/
		
		
		/*입출력 함수 정리 */
		
		// * 1. 기본 입력
			// println = 입력 후 줄바꿈, print = 줄바꿈X, printf = 줄바꿈X ("%d", 값) 형식(format)
		System.out.println("자바는 복잡해"); // 기본적으로 제공되는 출력 함수.
		
		// * 2. buffered 입출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter 인스턴스 추가 (출력)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 인스턴스 추가 (입력)
		
			// buffered 입력
		String str; // 입력값을 저장하는 변수 
		bw.write("입력:");
		bw.flush(); // 버퍼 출력 + 이후 버퍼 비우기
		str = br.readLine(); // 버퍼에 입력받고 str에 저장.
		
			// buffered 출력
		bw.write(str + " Hello\n"); // write()는 줄바꿈 문자 \n을 자동으로 반환하지 않음.
		bw.flush();
		//bw.close(); // 버퍼 닫기 * 이 부분에서 닫으면 뒤의 scanner 문장이 실행이 안된다.
		
		// * 3. scanner 입력
		Scanner sc = new Scanner(System.in); // Scanner 인스턴스 추가 (입력)
		String str2;
		System.out.print("입력:");
		str2 = sc.nextLine(); // 버퍼에 입력받고 str2에 저장.
		System.out.println(str2);
		sc.close(); // scanner 닫기
		/*
		 * scanner 메소드
		 * close() scanner 닫기
		 * hasNext() 내용이 입력되었는지 판단 (true,false형태 반환)(입력된 데이터를 내보냈다면 입력 안한것으로 간주)
		 * next() 다음 토큰 전까지의 내용 반환
		 * next자료형() 해당되는 자료형의 데이터 반환 ex nextint = int형 데이터 반환
		 * reset() 현 scanner 초기화
		 * toString() 현 입력된 내용을 String으로 변환
		 * useDelimiter(String pattern) pattern에 해당하는 패턴을 구분자로 사용.
		 
		 예제 구문
		public static void main(String[] args) {
			String str = "3.14.15.92";
			Scanner sc = new Scanner(str).useDelimiter("\\.");
			while(sc.hasNext()) { System.out.println(sc.nextInt()); }
			sc.close();
		}

		출처: https://eskeptor.tistory.com/68 [Hello World]
		 */
		
		
		
		/* 매인함수 전용 변수*/
		
		int num = 0;
		int level = 10;
		char level2 = 'L';
		float level3 = 3.14F;
		double level4 = 3.14;
		String level5 = "level5";
		boolean t = true;
		boolean f = (level2 == level); // == equal, && and, || or
		char level6 = (level > 10) ? 'U' : 'D'; // level의 값이 10 이상이면 'U' 아니면 'D' 저장
		
		/*  배열
		 * 배열 * 자료형[] 베열이름 = new 자료형[개수]; or 자료형 배열이름[] = new 자료형[개수];
		 * prac[] prac_s = new prac[개수]; 도 가능하다. 다만 prac[n] = new prac(); 으로 각각을 초기화해야한다.
		*/
		int[] level7 = new int[10];
		int[] level8 = new int[] {1,2,3}; // 요소를 같이 초기화할 때는 크기(개수)를 생략한다.(개수를 적으면 오류 발생)
		// 더 간단하게 int[] level8 = {1,2,3}; 으로 사용해도 된다.
		// 배열+ 향상된 for문
		System.out.println("향상된for문 예시 부분");
		for(int n: level8) {
			System.out.print(n+",");
		}
		System.out.println("\b ");
		
		int[][] level8l8= new int[][] {{1,2},{3,4}}; // 2차원 배열
		
		
		// 배열 복사
		int[] level9 = new int[3];
		System.arraycopy(level8, 0, level9, 0, 3); // (복사할 원본 배열, 원본 배열에서 복사할 처음 위치값, 복사해서 저장할 배열, 복사값을 저장할 처음 위치값, 복사할 값 개수)
		// 배열을 복사한 후 원본 배열의 값을 변경시키면 복사된 배열의 값도 똑같이 변한다. (배열은 주소 이므로 포인터 개념)
		
		// ArrayList
		/* 변동적인 배열을 사용할 때 좋음
		 * ArrayList<제네릭 자료형> 배열이름 = new ArrayList<제네릭 자료형>();
		 * ArrayList.add(E e) 요소 추가
		 * .size() 배열 크기 반환
		 * .get(int index) 해당 위치의 요소값 반환
		 * .remove(int index) 해당 위치의 요소값 반환 후 제거
		 * .isEmpty() 배열이 비어있는지 확인
		*/
		ArrayList<prac3> level10 = new ArrayList<prac3>(); // 제네릭 자료형(E)로는 객제의 자료형 (prac3) 등을 쓴다.
		level10.add(new prac3()); // 배열에 요소 추가
		System.out.println(level10.get(0)); // 해당 인덱스 요소값 출력
		
		/* 간단한 출력 예시 */		
		System.out.println("간단한 출력 예시 부분");
		System.out.println(level);
		System.out.println(level2);
		System.out.println((int)level2);
		System.out.println(level3 + " " + level4);
		System.out.println(level3 + level4);
		System.out.printf(level5 + "%n1 \n"); // %n 과 \n 둘다 동작
		System.out.println(t + " " + f);
		System.out.println(level > level4 ? "True" : "False"); // level > level4가 참이면 "True" 거짓이면 "False"을 반환
		if(level > 5) {
			System.out.println("level은 5보다 큽니다.");
		}
		else if (level == 5) {
			System.out.println("level은 5입니다.");
		}
		else {
			System.out.println("level은 5보다 작습니다.");
		}
		switch(level) { // 괄호 안은 int 값만을 받는다.
			case 10 :
				System.out.println("level은 10입니다."); // break이 없으면 뒤의 case도 실행한다.
				break;
			case 5: // 여러 case를 두고싶으면 ' case 1: case2: case 3: 실행문 ' 형식으로 적을 수 있다.
				System.out.println("level은 5입니다.");
				break;
		}
		while(num < 3) { // 값이 거짓일 때 까지 반복
			num++;
			System.out.print(num);
		}
		System.out.println("");
		for(num = 1; num <= 5; num++) { // num이 1부터 5까지 1씩증가하며 반복
			if(num == 3) { // num 이 3이면 이후의 실행문을 실행하지 않고 다음 반복으로 넘어간다.
				continue;
			}
			System.out.print(num);
		}
		System.out.print("\n");
		// 배열 출력
		System.out.println("level8 = " + level8); // level8 배열의 주소 출력
		System.out.println("level8[1] = " + level8[1]); // level8 배열의 두 번째 값 출력
		
		
		
		
		/* 간단한 인스턴스, 함수 활용 */
		
		System.out.println("인스턴스, 함수 활용 부분\n" + add(level,3)); // 위에 지정한 add함수를 이용
		prac3 prac_s = new prac3(); // prac3 유형의 prac_s 인스턴스 객체 생성
		prac_s.ID = 1111;
		prac_s.Name = "user1";
		prac_s.grade = 1;
		prac_s.address = "~~~";
		prac_s.showStudentInfo( ); // prac_s 의 showStudentInfo( ) 메소드 실행
		prac_s.showThis();
		prac3.Numbup(); // Numb 함수값 1 증가 prac_s.Numbup과 동일
	}
}
