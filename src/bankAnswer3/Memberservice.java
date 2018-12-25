package bankAnswer3;

public interface Memberservice {
	public MemberBean join(String id,String name,String ssn,String hp);
	public String login();
	public String update();
	public String deldete();
}

