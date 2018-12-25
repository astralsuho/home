package bankAnswer3;

public class MemberserviceImpl implements Memberservice {

	@Override
	public MemberBean join(String id, String name, String ssn, String hp) {
		MemberBean bean = new MemberBean();
		bean.setId(id);
		bean.setName(name);
		bean.setSsn(ssn);
		bean.setHp(hp);
		
		return bean;
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
	public String deldete() {
		// TODO Auto-generated method stub
		return null;
	}

}
