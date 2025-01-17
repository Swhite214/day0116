package methodlocal;

import java.util.ArrayList;
import java.util.List;

public class MethodLocalClassTest {

	public static void main(String[] args) {
		MethodLocalClassTest obj = new MethodLocalClassTest();
		List<Integer> numberList=List.of(1,2,3,4,5,6,7,8,9,10); //...가변배열 of보면 Object에 정의되어있는데 E.... elements로 되어있음 여기서 E는 제네릭
		obj.filterEvenNUmber(numberList);
	}
		
		public void filterEvenNUmber(List<Integer> numberList) {//collection문법임 리스트라는 집합에 인티저만 넣을겁니다 그리고이름
			//배열로만들어버리면 배열은 맨처음에 몇개인지 갯수를 설정해줘야함
			//중첩클래스 정의
			class EvenNumberChecker{
				//짝수 여부 확인 메서드 boolean형이면 is어쩌구로함 보통
				int n=Integer.valueOf(0);//언박싱해서 컴파일러가 처리해줌
				public boolean isEven(int number) {
					
					return number%2 == 0; //숫자가 2로떨어지면 true리턴
				}
			}//EvenNumberChecker
			
			EvenNumberChecker checker = new EvenNumberChecker();
			//결과집합
			List<Integer> evenList = new ArrayList<Integer>();
			for(int n:numberList/*int i=0; i<numberList.size();i++*/) {//배열은 length 리스트는 size
				//향상된 포문 인트형 a에다가 numberList들을 하나씩집어넣습니다.
				boolean result = checker.isEven(n);
				
				if(result) {
					evenList.add(n);
				}
			}//결과 출력
			System.out.println("결과 "+ evenList);
		}//method filterEvenNumber

}
