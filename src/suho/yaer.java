package suho;

import java.util.Scanner;

public class yaer {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("년도를 입력해주세요");
		int year = scanner.nextInt();
		String yiwai = "";
		
		if(year%4==0&&year%100!=0||year%400==0) {
			yiwai = "윤년입니다.";
		}else{
			yiwai = "평년입니다.";
		}
			System.out.println(year+yiwai);
	}

}
