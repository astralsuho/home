package bankAnswer3;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		MemberBean bean = null;
		Memberservice memberservice = new MemberserviceImpl();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.계좌생성")) {
			case "0" :
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case "1" :
				bean = memberservice.join(JOptionPane.showInputDialog("ID를 입력해주세요"),
						JOptionPane.showInputDialog("이름을 입력해주세요"),
						JOptionPane.showInputDialog("주민등록번호를 입력하세요"),
						JOptionPane.showInputDialog("핸드폰 번호를 입력해 주세요"));
				JOptionPane.showMessageDialog(null,"회원가입이 완료 되었습니다");
			break;	
			}
		}
	}
}//엔드
