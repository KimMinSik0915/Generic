package generic;

public class BoxExample {
	
	public static void main(String[] args) {

		// box라는 class 밖에서 type을 지정해서 사용할 수 있는도록 코드 작성 = generic
		// BOX Class를 생성하면서 <String>로 선언 하면 
		// private T t; 코드가 private String t; 로 바뀌어 생성이 된다.
				
		// generic해서 객체를 생성 : 저장할 data의 타입을 지정(문자열을 저장할 수 있는 BOX 객체 선언)
		Box<String> box1 = new Box<>();
		
		box1.set("hello");
		
		// box1.set(1); data type이 맞지 않아 오류가 발생
		
		// box라는 class 밖에서 type을 지정해서 사용할 수 있는도록 코드 작성 = generic
		// BOX Class를 생성하면서 <Integer>로 선언 하면 
		// private T t; 코드가 private Integer t; 로 바뀌어 생성이 된다.
		
		Box<Integer> box2 = new Box<>();
		
		// box2.set("hello"); data type이 맞지 않아 오류가 발생
		
		box2.set(1);
		
		
	}

}
