package bankAnswer4;


public class AccoutBean {
private String accountNum;

public String getAccountNum() {
	return accountNum;
}

public void setAccountNum(String accountNum) {
	this.accountNum = accountNum;
}
public String toString() {
	return String.format("계좌가 완성되렀습니다.\n %s",accountNum);
}

	
}
