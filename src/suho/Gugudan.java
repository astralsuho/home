package suho;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		String result = "";
		System.out.println("구구단 숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int gu = scanner.nextInt();
		int sum = 0;
		for(int i=0;i<9;i++) {
			sum = gu*(i+1);
			//result+=gu+"*"+i+"="+sum;
		if(i+1<9) { 
			result+=gu+"*"+(i+1)+"="+sum+","; 
		}else{	
			result+=gu+"*"+(i+1)+"="+sum+""; 

		}
			

		}
		
		System.out.println(result);

	}

}
