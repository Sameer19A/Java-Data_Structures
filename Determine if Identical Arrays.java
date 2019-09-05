import java.util.Scanner;

public class identicalArrays {

	public static void main(String[] args) {
		int[] Array1 = new int[5];	//array 1 of size 5
		int[] Array2 = new int[5];	//array 2 of size 5
		int SameVals = 0;   //number of identical values between arrays
		
		Scanner Input = new Scanner(System.in);
		System.out.print("Please enter 5 integers for the first array:");
		for (int i = 0; i< Array1.length; i++) {
			Array1[i] = Input.nextInt();	
		} //end of for loop for array 1
		
		System.out.print("Please enter 5 integers for the second array:");
		for (int i = 0; i< Array2.length; i++) {
			Array2[i] = Input.nextInt();	
		} //end of for loop for array 2		
		
		//compare array values:
		for (int i = 0; i< Array1.length; i++) {
			if (Array1[i] == Array2[i]) {
				SameVals++ ; //increase the count that counts the number of identical values between arrays
			}	
		} //end of for loop for comparing arrays			
				
		if (SameVals == Array1.length) {  // if the number of identical values is the same as the length of the array i.e. all values are the same then: 
			System.out.println("The two arrays are identical");
		}	//end of if
		else {
			System.out.println("The two arrays are not identical");
			}	//end of else

		
		Input.close();	//close the scanner class
	}		//end of method main

}	//end of class identicalarrays
