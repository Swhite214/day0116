package nest;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//member 객체 생성
		/*Member.MemberBuilder inner = Member.builder();
		Member member = inner.build();
		
		
		System.out.println(member);
		//inner.setId("coding");
		inner = inner.Id("coding");
		inner=inner.Pw("pw"); //위에서 세팅된 아이디와 새롭게 세팅한 비번까지 한번에
		inner=inner.Name("뭔소리야");
		inner.build();
	*/
		Member member = Member.builder()// Member member = new MemberBuiler();
				.Id("야 된다고?")
				.Pw("sp1234")
				.Name("뭔소리여")
				.build();
		System.out.println(member);
	}	

}
