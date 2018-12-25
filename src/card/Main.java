package card;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		CardBean bean = null;
	while(true) {
		switch(JOptionPane.showInputDialog("0.종료\n"
				+ "1.카드선택\n"
				+ "2.카드정보 보기")){
		case "0":
			JOptionPane.showMessageDialog(null,"종료");
			return;
		case "1":
			String card1 = JOptionPane.showInputDialog("카드명을 입력하여 주세요");
			String card2 = JOptionPane.showInputDialog("카드번호를 입력하여 주세요");
			bean = new CardBean();//CardBean bean = new CardBean();//카드빈 내용 가져오기 위해
			bean.setKind(card1);
			bean.setNumber(Integer.parseInt(card2));//int	
			break;
		case "2":
			String jungbo = bean.toString();//스트링 정보를 만들어 빈폴더에 있는 투스트링을 넣는다
			JOptionPane.showMessageDialog(null, jungbo);
		}
		
		
		
	}
		}	
}
