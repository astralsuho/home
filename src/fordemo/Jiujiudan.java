package fordemo;

import java.util.Scanner;

public class Jiujiudan {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("단입력 :");
		int dan = scanner.nextInt();
		
		for(int i = 1; i<=9 ; i++ ) {
			//System.out.println(dan+"*"+i+"="+(dan*i));
			System.out.printf("%d*%d=%d\n",dan,i,(dan*i));
		}
		
	}

}
