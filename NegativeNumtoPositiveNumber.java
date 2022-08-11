package week1.day2;

import java.lang.Math;


public class NegativeNumtoPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //first method
		
		int a=-999;
		if (a<0) {
			System.out.println("The Given Number " +a+ " is negative");
		//	int b = a-(a*2); // method 1
	   //   a = Math.abs(a); // Method 2
			int b = a*(-1); // Method 3
			System.out.println("Converted Number : " +b);
		} 
		
	}

}
