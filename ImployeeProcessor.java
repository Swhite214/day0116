package methodlocal;

public class ImployeeProcessor {

	//JSON javascript object의줄인말 JSON 데이터를 처리하는 메서드
	public void processEmployeeData(String JsonData) {
		//중첩클래스정의
		//int a; 차피 메소드 끝나면 사라지는 변수기에 public등등 아무것도안됨 default아님
		class EmployeeData{// 당연히 얘도 default 클래스아님
			private String name;
			private String dept;
			public EmployeeData(String name, String dept) {//이너클래스의 생성자
				this.name = name;
				this.dept = dept;
			}
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "name: " + name + ", dept: " + dept;
			}
			
		}//EmployeeData 문자열로받은 JsonData(name:박찬우 age:20뭐이런식으로)를 name과 dept로 쪼갠뒤 name dept에 받고 출력
		
		//JSON 파싱
		
		//JSONArray empArray;
	}
}
