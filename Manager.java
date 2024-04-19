
public class Manager extends Employee{ //임플로이 클래스 상속해줌
	
	private int bonus;
	
	public Manager(String name, String adress, int salary, int rrn, int bonus) {
		super(name,adress,salary,rrn);
		this.bonus=bonus;
	}

	void test() {
		System.out.println("name="+name);
		System.out.println("adress="+adress);
		System.out.println("salary="+salary);
		//System.out.println("rrn="+rnn); 자식 클래스에서 부모클래스의 프리베이트 필드는 접근할 수 없다.
		
		
	}
}
