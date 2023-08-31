
public class INHERITANCE {
	public static void main (String[]args){
		/*EMPLOYEE employee = new EMPLOYEE ("enis","Mühendis",1200);
		
		employee.ShowInfos();*/
		
		MANEGER maneger = new MANEGER ("OSMAN ","kasiyer",5000, 10); 
		
		maneger.ShowInfos();
		maneger.raiseSalary(100);
		
		System.out.println(maneger);
		
	}
}
