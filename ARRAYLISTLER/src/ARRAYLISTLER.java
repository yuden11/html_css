import java.util.ArrayList;


public class ARRAYLISTLER {
	public static void main (String[]args){
		
		ArrayList<String> groups = new ArrayList<String>();
		
		groups.add("daire");//gurubun 0 �nc� degeri
		groups.add("kare ");//gurubun 1 inci degeri
		groups.add("��gen");//gurubun 2 inci degeri
		groups.add("k�p");//gurubun 3 inci degeri
		
		System.out.println("1.�ndeks : " + groups.get(0));//daire
		System.out.println("2.�ndeks : " + groups.get(1));//kare
		//System.out.println("1.�ndeks : " + groups.get(4)); uyar� verir
		
		//Burda indeks numaras�n� yani gurup numaras�n� al�r�z
		System.out.println(groups.indexOf("k�p"));
		
		
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
