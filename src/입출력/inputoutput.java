package 입출력;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


// 버퍼를 사용한 입출력 함수를 사용하기 위한 import

import java.util.Scanner;
//더 간단한 버퍼를 사용한 입력문 Scanner을 사용하기 위한 import

public class inputoutput {
	
	public void main(String[] args) throws IOException {
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
		StringTokenizer st = new StringTokenizer(br.readLine(), "구분할 문자나 공백(=구분자)");
		
		
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
		
	}
}
