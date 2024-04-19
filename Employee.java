
public class Employee {

	public String name; //이름:퍼블릭 멤버
	String adress; //주소: 패키지 멤버
	protected int salary; //월급:프로텍티드 멤버
	private int rrn; //주민등록번호:프리베이트 멤버

	public Employee(String name, String adress,int salary,int rrn) 
	{
		this.name=name;
		this.adress=adress;
		this.salary=salary;
		this.rrn=rrn;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" +name + ", adress="+adress+ ",salary="+salary + "rrn="+rrn+"]";
	}
	
}
