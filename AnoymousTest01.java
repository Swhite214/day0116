package anonymus;
//class AAA extends AbstractClass{}
public class AnoymousTest01 {

	static void print(Inter inter) {
		
		inter.bbb();
	}//print()의 메서드는 매개변수로 인터서브의 객체만드는것을 받습니다.
	//이후 그 객체.bbb()메서드를 호출하고 그 메서드는 자식클래스의 오버라이드된 메서드입니다.
	//와따 빡세다
	
	public static void main(String[] args) {
		//InterSub sub = new InterSub();
		//Inter inter=sub;//다형성 인터서브는 인터의 자식이므로 Inter inter = new Intersub(); 이렇게도 가능
		
		print(new InterSub());
		print(new InterSub2());//번거롭죠
		print(new Inter() {

			@Override
			public void bbb() {
				// TODO Auto-generated method stub
				System.out.println("그냥 바로출력");
					}
				}
			);//복잡한걸 람다식으로 표현
		print(()->{System.out.println("람다식");});//추상메서드가 하나밖에없는거 컴파일러가 알고있고 그거 오버라이드해야되는거 알고있으니 메서드이름 생략하고 매개변수넣을꺼랑 바디만만들어~
		
		//AbstractClass obj = new AbstractClass();//추상클래스이기때문에 인스턴스화X
		//AnoymousTest01$1.class//이런식으로 저장돼요
		AbstractClass obj = new AbstractClass() {
			@Override
			void aaa() {}
		};//클래스블록이 생겼네요? //어나니머스 클래스에 상속
		//{}이게 클래스임 단지 이름이없음 즉 class AAAextends AbstractClass가 다생략된형태
		Inter inter = new Inter() {

			@Override
			public void bbb() {
				// TODO Auto-generated method stub
				
			}//간결해지고 보통 한번만 사용할때 사용됩니다. 버튼클릭이라던지
			
			
			
		};//얘도 원래는 생성자없어서 저거 못하는데 어나니머스타입으로 선언할수 있습니다.
		//얘는 AnoymousTest02$2.class로 저장됩니다.
		
	}

}
