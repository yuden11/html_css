import java.util.Scanner;


public class ARRAYLER {
	public static void main (String[]args){
		
		Scanner scan = new Scanner(System.in); 
		
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = new int [5];
		
		System.out.println("Array 2 nin deðerlerini girin " );
		for (int i = 0; i < arr2.length ;i++){
			arr2[i] = scan.nextInt();
		}
		System.out.println("Array 2 nin deðerlerini yazýlýyor " );
		for (int i = 0; i < arr2.length ;i++){
			System.out.println("eleman : " + arr2[i]);
		}
		
		
		
	}
}
