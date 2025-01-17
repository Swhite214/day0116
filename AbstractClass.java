package anonymus;

public abstract class AbstractClass {
	abstract void aaa();
}
@FunctionalInterface//추상메서드가 1개만 존재하는 인터페이스
interface Inter{
	void bbb();
	//추상메서드 더추가불가해요~
	}

class InterSub implements Inter{
	@Override
	public
	
	void bbb() {
		System.out.println("오버라이드된 bbb");
	}
}
class InterSub2 implements Inter{
	@Override
	public
	
	void bbb() {
		System.out.println("오버라이드된 bbbㅠ");
	}
}