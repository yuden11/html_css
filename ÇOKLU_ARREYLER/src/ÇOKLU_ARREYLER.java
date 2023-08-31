import java.util.Scanner;


public class ÇOKLU_ARREYLER {
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in); 
		/*
		                 gurup 0    gurup 1      gurup 2 (yok)
		int [][] arr = {{10,20,30},{40,50,60}};		
		System.out.println("0 a 0" + arr [0][0]); 10 çýkar
		System.out.println("1 e 1" + arr [1][1]); 50 çýkar
		System.out.println(arr [2][2]);  olmaz çükü üçüncü gurup yok
		*/
		int [][] arr2 = new int [2][3] ;	
		arr2 [0][0] = 10;
		arr2 [0][1] = 20;
		arr2 [0][2] = 30;
		arr2 [1][0] = 40;
		arr2 [1][1] = 50;
		arr2 [1][2] = 60;
		
		for(int i = 0;i < 2;i++){
			  for(int j = 0 ; j < 3;j++){
				  System.out.println("eleman" + arr2[i][j]);
			  }
			 }

		
		
	}
}
