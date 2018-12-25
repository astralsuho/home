package suho;

import java.util.Scanner;
import suho.Calc_2;
import suho.Bmi;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calc_2 ab = new Calc_2();
		Bmi av = new Bmi();
		ForDemo leo = new ForDemo();
		Gender sp = new Gender();
		
		
		while(true) {
			
			System.out.println("[메뉴]\n"
					+ "0.정지\n"
					+ "1.계산기\n"
					+ "2.BMI\n"
					+ "3.ForDemo\n"
					+ "4.신분증 번호");	
			String select = scanner.next();
			
		switch(select) {
		
		case "0" :
			System.out.println("정지");
			return;
		
		case "1" :
			
			ab.Calc2(); break;
		case "2" :
			av.test1();break;
		case "3" :
			leo.test1();break;
		case "4" :
			sp.test();
			break;
		}			
		} 
		
		
		
		
		}// 에어러요
		
	}//ㅠㅣㄹ드

