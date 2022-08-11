package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		long n = 25l;
		int fact = 1;
		
		for(int i=1; i<=n; i++) 
		{
			fact = fact *i; // fact--1*1 ==1 fact, fact--1*2 int--2 ==2 fact; 
			//fact--2*3--int == 6 fact
			//fact -- 6*4 === 24-- fact
			//fact ---24*5 ===120 fact
		}
			System.out.println("Factorial:" +n+ " is:" +fact);
		}
	}

