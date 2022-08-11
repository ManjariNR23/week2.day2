package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 24;
		
		boolean isPrimeNumber= true;
		
		for (int num = 2; num < a/2; num++) {
			if (a%num==0) {
				isPrimeNumber =false;
				//System.out.println(num);
				break;
				} 
			
		}
		if (isPrimeNumber) {
			System.out.println(a+ " is Prime Number");
		} else {
			System.out.println(a+ " is not a Prime Number");
		}
		
	}

}
