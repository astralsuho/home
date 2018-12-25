package bankAnswer4;

import javax.swing.JOptionPane;

import bankAnswer5.AccountBean;

public class Contorller {

	public static void main(String [] args) {
		AccountService accountService = new AccountServiceImpl(); //불러옴
		AccoutBean accountBean = null; // 뭘 담을지 몰라 null을 씀
		MemberBean memberBean = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.계좌생성\n"
					+ "3.회원정보확인")){

					case "0" :
						JOptionPane.showMessageDialog(null,"시스템을 종료합니다.");
						return;
					
					case "1" :
						JOptionPane.showInputDialog("이름을 입력해주세요");
						JOptionPane.showInputDialog("아이디를 입력해 주세요");
						JOptionPane.showInputDialog("주민번호를 입력해주세요");
						JOptionPane.showInputDialog("패스워드를 입력해주세요");
						JOptionPane.showMessageDialog(null,"회원가입이 완료되었습니다.");
						
						break;

					case "2" :
						accountBean = accountService.makeAccout(); //위에 애 데려오기
						
						JOptionPane.showMessageDialog(null, String.format(accountBean.toString()));
						break;
			}		
		}
	}


}//end
