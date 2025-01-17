package nest;

public class Member {
	
	private String id;
	private String pw;
	private String name;
	
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
	public static MemberBuilder builder() {
		return new MemberBuilder(); //private메서드를 접근하기위해 스태틱을 붙여
	}//클래스이름으로 이 빌더를호출
	//순서를 정확하게 입력하셔야 해야합니다.
	private Member(String id, String pw, String name) {
		this.id =id; 
		this.pw = pw; 
		this.name = name;
	}
	//static 내부 클래스
	static class MemberBuilder{ //빌더에서 호출하기위해 static을 붙여야합니다 스태틱메서드에서는 인스턴스를 못부름 왜 객체화 못하니까
		private String id;
		private String pw;
		private String name;
		//public void setId(String id) {
			//this.id=id;
		//}
		public MemberBuilder Id(String id) {//MemberBuilder라는 클래스타입의 데이터타입을 반환합니다
			this.id=id;
			return this;
		}
		public MemberBuilder Pw(String pw) {//MemberBuilder라는 클래스타입의 데이터타입을 반환합니다
			this.pw=pw;
			return this;
		}
		public MemberBuilder Name(String name) {//MemberBuilder라는 클래스타입의 데이터타입을 반환합니다
			this.name=name;
			return this;
		}
		public Member build() {
			return new Member(id, pw, name); //private은 같은 클래스에서만 근데 얘는 내부클래스이고 심지어 메서드가아닌 생성자에는 static도접근가능
		}
	}
}
