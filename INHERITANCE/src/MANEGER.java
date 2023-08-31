
public class MANEGER extends EMPLOYEE{
	private int num_of_employees;
	
	public MANEGER(String name, String department, int salary,int num_of_employees) {
		
		super(name, department, salary);
		
		this.num_of_employees = num_of_employees; 
	}
	
	public void raiseSalary (int amount){
		
		System.out.println("�al��anlara " + amount + "tl zam yap...");
		
	}
	
	@Override
	public void ShowInfos() {
		
		super.ShowInfos();
		
		System.out.println("Sorumlu ki�i say�s�" + this.num_of_employees);
	}
	
	@Override
	public String toString() {
		return "Maneger Objesi";
	}
	
	
	
	
	
	
	
	
	
	
	
}
