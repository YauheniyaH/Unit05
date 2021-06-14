package lt.lhu.unit05.main;

public class Task01 {

	public static void main(String[] args) {
		int a, b;
		int nod;
		int nok;

		a = 15;
		b = 135;

		int masA[];
		int masB[];

		masA = submultiple(a);
		masB = submultiple(b);
		
		printMas(masA);
		printMas(masB);
		
		nod=nod(a,b);
		System.out.println(nod);
		
		nok=a*b/nod;
		System.out.println(nok);

	}

	public static int[] submultiple(int x) {
		int j = 0;

		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				j = j + 1;
			}
		}
		int masA[] = new int[j];

		j = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				masA[j] = i;
				j = j + 1;
			}
		}

		
		return masA;

	}

	public static int nod(int a, int b) {
		int result=0;
		
		int masA[];
		masA = submultiple(a);

		int masB[];
		masB = submultiple(b);

	

		for (int i = 0; i < masA.length; i++) {
			for(int j=0; j<masB.length;j++) {
				if (masA[i] == masB[j]) {
					result = masA[i];
				}
			}
			
		}
		
		return result;

	}
	
	public static void printMas (int masA[]) {
		for (int i = 0; i < masA.length; i++) {
			System.out.printf("[%4d]", masA[i]);
		}
		System.out.println();
		
		return;
		
	}

}
