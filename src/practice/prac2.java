package practice;

public class prac2 {
	/*
	 * public - 접근제한 x
	 * protected - 동일 패키지내 혹은 파생 클래스만
	 * default(공백) - 동일 패키지 내에서만
	 * private - 자기 자신의 클래스 내에서만
	 */
	public static void main(String[] args) {
		final int Max_Num = 100;
		final int Min_Num;
		
		Min_Num = 0;
		
		System.out.println(Max_Num);
		System.out.println(Min_Num);
	}
	
}