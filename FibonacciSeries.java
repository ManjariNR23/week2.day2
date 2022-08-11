package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 1;
		int c= 8;
		int sum = 0;
		
		for (int i = 0; i <c; i++) {
			sum = a+b;
			a=b;
			b= sum;
			System.out.println(sum);
		}
	}

}
