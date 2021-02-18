package generic;

// 한개의 data를 저장할 수 있는 객체 : generic class 선언
// class 뒤에 <T> : 클래스 안에 있는 모든 T를 밖에서 선언한 type으로 변경하겠다.
// 컴파일 할 당시에 data의 type을 체크했다 라고 이야기한다.
// 경고가 나오는경우 checked를 이용해서 경고를 사라지게 할 수 있다.

public class Box<T> {	// < T or E > : 타입을 받아서 사용한다.
	
	// 밖에서 선언한 type으로 바꿔지게 된다. : 컴파일 할 때
	private T t;
	
	public T get() {
		
		return t;
		
	}
	
	public void set(T t) {
		
		this.t = t;
		
	}

}
