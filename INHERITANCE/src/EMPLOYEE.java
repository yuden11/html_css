
public class EMPLOYEE {
	private String name;
	private String department;
	private int salary;
	
	public EMPLOYEE(String name, String department, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public void ShowInfos(){
		System.out.println("Bilgiler ...");
		System.out.println("Ýsim : " +  this.name);
		System.out.println("Departman : " +  this.department);
		System.out.println("Maaþ : " +  this.salary);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
