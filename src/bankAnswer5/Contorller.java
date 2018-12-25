package bankAnswer5;

import javax.swing.JOptionPane;

public class Contorller {

	public static void main(String[] args) {
		AccountBean accountBean = null; //케이스 2번에 값을 줄려고
		MemberBean memberBean = null;
		MemberService memberService = new MemberServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원확인")) {
					case "0" :
						JOptionPane.showMessageDialog(null, "종료");
						return;
					case "1" : 
						memberBean = memberService.join(JOptionPane.showInputDialog("ID 를 입력해주세요"),
								JOptionPane.showInputDialog("이름을 알려주세요"),
								JOptionPane.showInputDialog("주민등록번호를 알려주세요"),
								JOptionPane.showInputDialog("패스워드를 입력해주세요"));
						break;
					case "2" :
						JOptionPane.showMessageDialog(null,memberBean.toString());
						break;	
					
					
					
					/*case "2" :
						accountBean = new AccountBean();
						JOptionPane.showMessageDialog(null,String.format("개설되었습니다."));
						
						break;
			****/
			
			
			
			}//스위치		


		}//와일
	}//에어리언
}//필드
