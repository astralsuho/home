package suho;

import java.util.Scanner;

public class Gender {
public void test() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("이름과 주민등록번호를 입력하여 주세요");
	String name1 = scanner.next();
	String ssn = scanner.next();
	char ch =ssn.charAt(7);
	String res = "";
	
	

	switch(ch) {
	case '1' : res = "남";break;
	case '2' : res = "여";break;
	case '3' : res = "남";break;
	case '4' : res = "여";break;
	case '5' : res = "외국인";break;
	case '6' : res = "외국인";break;
	default : res = "다시입력하세요";
	break;
	
	}

	System.out.println(res);
}
}
