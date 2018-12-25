package bank31;
/*추가 Create -set - void
 *목록 list -read -get -object
 *검색 find -read -get -object
 *수정 update -set- void
 *삭제 Delete -set- void****/

//MemberServiceImpl은 MemberService를 구체적으로 구현한(implements) 클래스이다.
public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;//아무나접근할수없어, MemberBean[]형태야, 이름은  members야. 그리고 난 멤버변수를 선언한거야! 공간만 있어..
	private int count;

	MemberServiceImpl() {
		this.members = new MemberBean[10]; //MemberBean[10] : 10개의  MemberBean이 있는 배열을 만들어줘.그리고 그걸   내(클래스)의   members 에 넣어줘.
		this.count = 0;
	}

	@Override
	public void join(String name, String id, String ssn, String pass) {
		MemberBean member = new MemberBean();//new 연산자를 쓰면 해당 형태의 클래스 인스턴스 객체를 만든다는 의미다. 이건 해당 클래스의 멤버변수와 메서드를 . 통해 사용할 수 있다.
		member.setName(name);	
		member.setId(id);
		member.setSsn(ssn);
		member.setPass(pass);
		
		this.members[this.count] = member; //배열에 넣어주고 있음.
		System.out.println("멤버:"+this.members[this.count]);
		this.count++;
		System.out.println("카운트 : "+this.count);
		
		//하나도 모르겠음..
			
	}
	
	@Override
	public MemberBean[] list(){
		return this.members;
	}

	@Override
	public MemberBean find(String id) {
		MemberBean member = new MemberBean();
		
		for(int i=0;i< this.count; i++) { 
			if(members[i].getId().equals(id)) { //equals 문자형 비교 ==숫자형 비교
				member = members[i];
				System.out.println(member);
				break;
			}
		}
		return member;
	}

	@Override
	public boolean login(String id, String pw) {
		boolean ok = false;
		for(int i=0; i<this.count; i++) { //for(초기화;조건식;증감식){}
			System.out.println("로그인 카운트 :" + i); //?
			if(this.members[i].getId().equals(id)//.가져와  &&=>and둘다 ||=>or 둘중에 하나 또는
				&& this.members[i].getPass().equals(pw)){
				ok = true;
				break;
			}
			
		}
		return ok;
	}
	
}
