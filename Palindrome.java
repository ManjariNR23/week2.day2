package week1.day2;
//import java.lang.Math;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp = 34343;
		int calculatedValue = 0;
     	int initialValue = temp;
     	int length = 5;
     	
		//Method : 1 
//		for (int i = 0; i < length ; i++) {
//		    int quotient = temp/10;
//			int remainder =temp%10;
//			calculatedValue = (int) (calculatedValue + remainder*Math.pow(10, length-1-i));
//			temp = quotient;
//		}
//		if(initialValue == calculatedValue) {
//			System.out.println( initialValue+ " is a Palindrome");
//		}else {
//			System.out.println( initialValue+ " is not a Palindrome");
//		}
     	
     	for (int i = 0; i < length ; i++) {
		    int quotient = temp/10;
			int remainder =temp%10;
			calculatedValue = calculatedValue*10 + remainder;
			temp = quotient;
		}
		if(initialValue == calculatedValue) {
			System.out.println( initialValue+ " is a Palindrome");
		}else {
			System.out.println( initialValue+ " is not a Palindrome");
		}
		
}
}
