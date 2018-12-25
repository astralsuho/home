package bank31;

public interface MemberService {//도면
	//회원가입
	public void join(String name,String id, String ssn, String pass);
	
	//여긴 왜 보이드이고..
	public MemberBean[] list(); // 다호출해 맴버빈배열값으로 돌려줘 그리고 이름은 리스트 그리고 받는건 없어 
	
	public MemberBean find(String id); //다 호출해 멤버빈값으로 돌려줘 이름은 파인드야 스트링값 받을래;
	
	public boolean login(String id,String pw);
	//다 호출해도 돼 불린값으로 돌려줘 이름은 로긴이야 스트링 아이디 패스워드 받을래.
	
}
