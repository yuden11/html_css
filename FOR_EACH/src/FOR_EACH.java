import java.util.ArrayList;


public class FOR_EACH {
	public static void main (String[]args){
		
		ArrayList<String> groups = new ArrayList<String>();
		int[] arr = {10,20,30,40,50};
		
		
		groups.add("daire");//gurubun 0 ýncý degeri
		groups.add("kare ");//gurubun 1 inci degeri
		groups.add("üçgen");//gurubun 2 inci degeri
		groups.add("küp");//gurubun 3 inci degeri
		

		for(int i = 0; i < groups.size() ; i++){
			System.out.println("Eleman : " + groups.get(i));
		}
		
		for(String s : groups){
			System.out.println("Eleman : " + s);
		}
		
		for(int i : arr){
			System.out.println("Eleman : " + i);
		}
	}
}

