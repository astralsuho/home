package bankAnswer5;

public class MemberServiceImpl implements MemberService{

	@Override
	public MemberBean join(String id,String name,String ssn, String pass) { // 서비스랑 항상 같게 해줘야 한다.
		MemberBean memberBean  = new MemberBean();
		memberBean.setId(id);
		memberBean.setName(name);
		memberBean.setSsn(ssn);
		memberBean.setPass(pass);
		
		return memberBean;
	}

	@Override
	public String login() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}

}
