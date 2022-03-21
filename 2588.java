// 세 자리수를 입력받아 곱셈 계산식을 풀이하는 프로그램
import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int first = s.nextInt();
		int second = s.nextInt();
		int secondf = second % 10;
		int seconds = (second % 100 - secondf);
		int secondt = (second - seconds - secondf);
		int total = first * second;
				
		System.out.println(first * secondf);
		System.out.println(first * seconds / 10);
		System.out.println(first * secondt / 100);
		System.out.println(total);
	}

}
