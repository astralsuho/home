package suho;

import java.util.Scanner;

public class Gugudan3 {

	public static void main(String[] args) {
		String result = "";
		System.out.println("곱셈해주기");
		Scanner scanner = new Scanner(System.in);
		int gugu = scanner.nextInt();
		int sum = 0;
		
		for(int i=0;i<9;i++) {
			sum = gugu*(i+1);
			if(i+1<9) {
				result += gugu+"*"+(i+1)+"="+sum+",";
			}else{
				result += gugu+"*"+(i+1)+"="+sum;
			}
		}
		System.out.println(result);
	}
}
