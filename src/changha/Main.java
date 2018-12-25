package changha;

import java.util.Scanner;
import changha.Calc;
public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Calc calc = new Calc();
	while(true) {
		System.out.println("[메뉴]\n"
				+ "1.계산기\n"
				+ "2.Bmi\n"
				+ "3.윤년\n"
				+ "4.성별\n"
				+ "5.평균등수");
		
		String select = scanner.next();
		
		switch (select) {
		case "0":System.out.println("정지");return;
		case "1":calc.menu1();break;

		
		
		}
	}
}
}
