import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int hour = s.nextInt();
		int minute = s.nextInt();
		int second = s.nextInt();
		int addtime = s.nextInt();
		
		int setsecond = addtime % 60 ;
		int setminute = (addtime % 3600) / 60;
		int sethour = addtime / 3600;
		
		int fsecond = second + setsecond;
		int fminute = minute + setminute;
		int fhour = hour + sethour;
		
		
		System.out.print(fhour >= 24 ? fhour - 24 : fhour);
		System.out.print(fminute >= 60 ? fminute - 60 , (fhour + 1) : fminute);
		System.out.print(fsecond >= 60 ? fsecond - 60 , (fminute + 1) : fsecond); 
	}

}
