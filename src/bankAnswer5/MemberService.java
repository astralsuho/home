package bankAnswer5;

public interface MemberService{
	public MemberBean join(String id,String name,String ssn, String pass);
	public String login();
	public String update();
	public String delete();
	
}
