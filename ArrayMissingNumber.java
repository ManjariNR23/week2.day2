package week1.day2;

public class ArrayMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {1, 2,3,4,5,6,7,9};
		for (int i = 0; i < array1.length; i++) {
			 if (array1[i] != i+1) {
				 System.out.println(i+1);
				 break;
			 }
		}
	}

}
