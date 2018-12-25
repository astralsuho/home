package bank31;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		MemberBean memberBean = null;
		MemberService memberService = new MemberServiceImpl();
		
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원목록\n"
					+ "3.회원검색\n"
					+ "4.로그인")) {
					case "0" :
						JOptionPane.showMessageDialog(null,"시스템 종료");
						return;
					case "1" :
						memberService.join(JOptionPane.showInputDialog("성함을 입력해 주세요"),
								JOptionPane.showInputDialog("아이디를 입력해주세요"),
								JOptionPane.showInputDialog("주민등록번호를 입력해주세요"),
								JOptionPane.showInputDialog("비밀번호를 등록합니다."));
						JOptionPane.showMessageDialog(null,"회원가입이 완료되었습니다");
						break;
					case "2" :
						MemberBean[] members = memberService.list();
						JOptionPane.showMessageDialog(null,members);
						break;
					case "3" :
						String id = JOptionPane.showInputDialog("검색하실 아이디를 입력해주세요");
						memberBean = memberService.find(id);
						JOptionPane.showMessageDialog(null,memberBean);
					case "4" :
						id = JOptionPane.showInputDialog("로그인 아이디 ");
						String pw = JOptionPane.showInputDialog("로그인 비번");
						boolean ok = memberService.login(id,pw);
						if(ok) {
							JOptionPane.showMessageDialog(null,"로그인 성공" );
						}else {
							JOptionPane.showMessageDialog(null,"로그인 실패");
						}
						break;
			}

		}
	}
}
