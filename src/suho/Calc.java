package suho;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("메뉴\n 0.종료\n 1.계산기\n 2.BMI");
			String select = scanner.next();
			
			switch (select) {
			
			case "0" :
				System.out.println("종료");
				return;
				
			case "1" :
				System.out.println("계산기");
				int a = scanner.nextInt();
				String op = scanner.next();
				int b = scanner.nextInt();
				int result = 0;
				
				switch (op) {
				
				case "+" : result = a + b ;break;
				case "-" : result = a - b ;break;
				case "*" : result = a * b ;break;
				case "/" : result = a / b ;break;
				case "%" : result = a % b ;break;
				   }
				System.out.println(a+op+b+"="+result);
				break;
				
			case"2" :
				System.out.println("BMI");
				System.out.println("키를 입력하세요");
				double to = scanner.nextDouble();
				System.out.println("몸무계를 입력하세요");
				double we = scanner.nextDouble();
				double bmi = we/(to/100*to/100);
				
				//System.out.println(bmi+":bmi");
				//String bmi2 = scanner.next();
				String bmi2 = "";
				if(bmi>=40) {
					bmi2 ="고도비만";
				}else if (bmi>=35) {
					bmi2 = "중등고 비만";
				}else if (bmi>=30) {
					bmi2 ="경도 비만";
					
				}else if (bmi>=25){
					bmi2 = "정상";
				}else {
					bmi2 = "저체중";
					
					
				}
				
				System.out.println(bmi+bmi2);
				break;
				
				
						
			
			}
			}	
	}
}

