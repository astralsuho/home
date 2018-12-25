package bankAnswer4;
import java.util.Random;
public class AccountServiceImpl implements AccountService {

	@Override
	public AccoutBean makeAccout() {
		AccoutBean accountBean = new AccoutBean();
		Random random = new Random();
		String num = "";
		for(int i=0;i<8;i++) { //계좌번호 8자리
			num += random.nextInt(10); //10번호까지
		}
		
		accountBean.setAccountNum(num);//어카운트 빈에 num을 보냄 왜 ? 컨트롤에 써주기위해
		return accountBean;
	}

}
