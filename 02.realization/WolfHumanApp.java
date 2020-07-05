package realization;

public class WolfHumanApp {
	public static void main(String[] args) {
		WolfHuman wh=new WolfHuman();
		
		wh.speak();
		wh.walk();
		wh.smile();
		wh.change();
		wh.cryLoudly();
		wh.fastWalk();
		System.out.println("=====================================================");
		//부모 참조변수에 자식 인스턴스 저장 - 부모 인스턴스 참조 가능
		// => 객체 형변환을 이용하면 자식 인스턴스 메소드 참조 가능
		Human human=new WolfHuman();
		
		human.smile();
		human.speak();
		human.walk();
		System.out.println("=====================================================");
		//명시적 객체 형변환을 이용하여 자식 인스턴스 메소드 호출
		((WolfHuman)human).change();
		System.out.println("=====================================================");
		//인터페이스를 이용하여 참조변수 생성 가능 => 자식 인스턴스 저장
		//자식클래스가 같은 클래스와 인터페이스는 서로 명시적 객체 형변환 가능
		Wolf wolf=(Wolf)human;
		
		//묵시적 객체 형변환에 의해 자식 인스턴스의 메소드 호출
		wolf.cryLoudly();
		wolf.fastWalk();
		System.out.println("=====================================================");
		
		
	}
}



























