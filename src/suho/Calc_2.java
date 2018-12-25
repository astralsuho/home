package suho;

import java.util.Scanner;

public class Calc_2 {

	public void Calc2() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산기");
		int a = scanner.nextInt();
		String op = scanner.next();
		int b = scanner.nextInt();
		int res = 0;
		
		switch (op) {
			case"+":res = a + b ;break;
			case"-":res = a - b ;break;
			case"*":res = a * b ;break;
			case"/":res = a / b ;break;
			case"%":res = a % b ;break;

			default :res =0;
			break;	}
		System.out.println(a+op+b+"="+res);
	}
}
