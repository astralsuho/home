package suho;

import java.util.Scanner;

public class Gugudan2 {

	public static void main(String[] args) {
		
		String result = ""; 
		System.out.println("숫자를 넣어주세요 곱해드립니다");
		Scanner scanner = new Scanner(System.in);
		int gugu = scanner.nextInt(); // 내가 넣어 줄 첫번째 곱하기
		int sum = 0; //결과값
		
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
