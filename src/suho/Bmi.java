package suho;

import java.util.Scanner;

public class Bmi {
	public void test1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("BMI");
		System.out.println("키와 몸무계를 입력하세요");
		double t = scanner.nextDouble();
		double w = scanner.nextDouble();
		double bmi1 = w/(t*t)*10000;
		String bmi2 = "";
		
		if(bmi1>=40){
			bmi2="고도 비만";
		}else if(bmi1>=35) {
			bmi2="중등도 비만";
		}else if(bmi1>=25) {
			bmi2="보통";
			
		}else{
		
			bmi2 ="노사람";
	}
		System.out.println(bmi1+bmi2);
}
	}
