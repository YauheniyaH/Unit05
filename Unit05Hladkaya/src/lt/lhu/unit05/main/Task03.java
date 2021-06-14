package lt.lhu.unit05.main;

public class Task03 {

	public static void main(String[] args) {
		double a= 123.34;
		double b= 0.234789;
		
	
		task03(a,b);
		
		
		

	}
	
	public static void task03(double a, double b) {
		String sA;
		String sB;
		
		int countA;
		int countB;
		
		sA= Double.toString(a);
		sB= Double.toString(b);
		
		System.out.println(sA);
		System.out.println(sB);
		
		countA=numbersCount(sA);
		countB=numbersCount(sB);
		
		if (countA>countB) {
			System.out.println("первое число содержит больше цифр");
		}else {
			System.out.println("второе число содержит больше цифр");
		}
		
	}
	
	public static int numbersCount (String s) {
		int count=0;
		
		for (int i=0; i<s.length();i++) {
			switch (s.charAt(i)) {
			case '1':
				count=count+1;
				break;
			case '2':
				count=count+1;
				break;
			case '3':
				count=count+1;
				break;
			case '4':
				count=count+1;
				break;
			case '5':
				count=count+1;
				break;
			case '6':
				count=count+1;
				break;
			case '7':
				count=count+1;
				break;
			case '8':
				count=count+1;
				break;
			case '9':
				count=count+1;
				break;
			case '0':
				count=count+1;
				break;
				
			}
		}
		return count;
	}

}
