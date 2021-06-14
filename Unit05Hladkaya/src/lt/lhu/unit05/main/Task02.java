package lt.lhu.unit05.main;

public class Task02 {

	public static void main(String[] args) {
		int a=-45;
		int b=265;
		int c=18;
		int sum=0;
		
		sum=sumMinMax(a,b,c);
		

	}
	
	public static int sumMinMax (int a, int b, int c) {
		int max=0;
		int min=0;
		int sum;
		
		if (a>b) {
			if(a>c) {
				max=a;
				if(b>c) {
					min=c;
				}else {
					min=b;
				}
			}
		} else {
			if(b>c) {
				max=b;
				if(c>a) {
					min=a;
				}else {
					min=c;
				}
			}else {
				max=c;
			}
		}
		
		System.out.println("min="+min);
		System.out.println("min="+max);
		sum=min+max;
		
		System.out.println("sum="+sum);
		
		return sum;
		
	}

}
