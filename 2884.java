import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int hour = s.nextInt();
		int minute = s.nextInt();
		int total = 1440 + hour * 60 + minute;
		int alarm = total - 45;
		int fhour =(alarm % 1440) / 60;
		int fminute = alarm % 60;
				
		System.out.print(fhour + " ");
		System.out.print(fminute);
	}

}
