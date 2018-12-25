package bank31;

public class MemberBean{
	String name,id,ssn,pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;//this는 맴버빈 클래스
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "MemberBean [name=" + name + ", id=" + id + ", ssn=" + ssn + ", pass=" + pass + "]";
	}
	
	
	
}
