import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int hour = s.nextInt();
		int minute = s.nextInt();
		int second = s.nextInt();
		int addtime = s.nextInt();
		int total = (3600 * hour) + (60 * minute) + second;
		int totaltime = total + addtime;
		int fhour = totaltime % (3600*24) / 3600;
		int fminute = totaltime % 3600 / 60;
		int fsecond = totaltime % 3600 % 60;
		
		System.out.print(fhour+" ");
		System.out.print(fminute+" ");
		System.out.print(fsecond);
	}

}
