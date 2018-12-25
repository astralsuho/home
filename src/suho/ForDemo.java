package suho;

import java.util.Scanner;

public class ForDemo {
public void test1() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("1부터10까지 더해주세요");
	String a ="";
	int sum =0;
	
	
	for(int i=1; i<=10; i++) {
		if(i!=10){
			a += i + "+";
	}else {
		a += i +"="; 
	}
	sum  += i;
	
		
	 System.out.println(a+sum);
}

}}



