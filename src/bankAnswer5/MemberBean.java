package bankAnswer5;

import java.text.StringCharacterIterator;

public class MemberBean {

	private String id,name,ssn,pass;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	public String toString() {
		return String.format("아이디 : /%s\n"
				+ "이 름 : %s\n"
				+ "주민번호 : %s\n"
				+ "패스워드 : %s\n",id,name,ssn,pass);
	}

	
}	//field
