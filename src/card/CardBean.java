package card;

public class CardBean {
	String kind;
	int number;
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		String toString = "";
		return toString.format("카드종류:%s카드번호%d/n감사합니다.",kind,number );
	}
}