package lt.lhu.unit05.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		int n = 9;
		int mas [] = new int [n];
		int sum;
		int k=3;
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
		for (int i=0; i<mas.length; i++){
			System.out.print("[" + i + "]=" + mas[i] + "; ");
			}
		System.out.println();
		
		sum=sum(mas,k);
		System.out.println("sum= "+sum);
		

	}
	
	public static int sum ( int mas[], int start) {
		int sum;
		
		sum=mas[start]+mas[start+1]+mas[start+2];
		
		return sum;
		
	}

}
