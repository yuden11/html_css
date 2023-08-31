import java.util.ArrayList;


public class ARRAYLISTLER {
	public static void main (String[]args){
		
		ArrayList<String> groups = new ArrayList<String>();
		
		groups.add("daire");//gurubun 0 ýncý degeri
		groups.add("kare ");//gurubun 1 inci degeri
		groups.add("üçgen");//gurubun 2 inci degeri
		groups.add("küp");//gurubun 3 inci degeri
		
		System.out.println("1.ýndeks : " + groups.get(0));//daire
		System.out.println("2.ýndeks : " + groups.get(1));//kare
		//System.out.println("1.ýndeks : " + groups.get(4)); uyarý verir
		
		//Burda indeks numarasýný yani gurup numarasýný alýrýz
		System.out.println(groups.indexOf("küp"));
		
		
		groups.remove("kare");
		groups.remove(1);
		/*
		System.out.println("ArrayList" + groups.size(); 4
		for(int i = 0; i < groups.size() ; i++){
			System.out.println("Eleman : " + groups.get(i));
		}
		*/
		
	}
}
