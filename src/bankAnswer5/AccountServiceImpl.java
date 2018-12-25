package bankAnswer5;
import java.util.Random; 
public class AccountServiceImpl implements AccountService {

	@Override
	public String makeAccountNum() {
		Random random = new Random();
		String ma = "";
		for(int i =0 ; i<8; i++) {
			ma += random.nextInt(10);
		}
		AccountBean accountBean = new AccountBean();
		accountBean.setAccountNum(ma);
		return ma;
	}

	@Override
	public String makeToday() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String info(String accountNum, String name, String today, int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String withdraw(int money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deposit(int money) {
		// TODO Auto-generated method stub
		return null;
	}

}
