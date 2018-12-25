package bankAnswer31;
/*
추가 Create      - set - void 
목록 list - Read - get - Object
검색 find - Read - get - Object
수정 Update      - set - void 
삭제 Delete      - set - void
 * */
public class MemberServiceImpl implements MemberService{
	private MemberBean[] members;
	private int count;
	MemberServiceImpl(){
		this.members = new MemberBean[10];
		this.count=0;
	}
	
	@Override
	public void join(String id, String name, String pass, String ssn) {
		MemberBean member = new MemberBean();
		
		member.setId(id);
		member.setName(name);
		member.setPass(pass);
		member.setSsn(ssn);
		members[count] = member;
		count++;
		System.out.println("카운트: "+count);
	}

	@Override
	public MemberBean[] list() {
		return members;
	}
	@Override
	public MemberBean find(String id) {
		MemberBean member = new MemberBean();
		for(int i=0;i<count;i++) {
			if(members[i].getId().equals(id)) {
				member = members[i];
				break;
			}
		}
		return member;
	}

	@Override
	public boolean login(String id, String pw) {
		boolean ok = false;
		for(int i=0;i<count;i++) {
			System.out.println("로그인 카운트 :"+count);
			if(members[i].getId().equals(id) 
					&& members[i].getPass().equals(pw)) {
				ok = true;
				break;
			}
		}
		return ok;
	}

	@Override
	public int count() {
		return count;
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	

	
	

}