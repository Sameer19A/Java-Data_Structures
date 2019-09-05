import java.util.Scanner;
		
public class MathsTest {
	public static void main(String[] args) {
		final int NUMBER = 5; //fixed number. this is the max number of incorrect tries the user gets for this test
		int int2 = 0 ;  // counts the number of correct times
		int int1 = 0 ;	//counts the number of incorrect tries
		long startTime =System.currentTimeMillis (); //gets the time that the user started the test
		String string1 = " " ; 
		Scanner string2 = new Scanner(System.in );  //user input answer
		
		while (int1 < NUMBER) {	//while the number of incorrect tries is less then NUMBER(5)
			int number1 = (int)(Math.random()*10);	//generates a random number from 1 to 10
			int number2 =  (int)(Math.random()*10);
			if (number1 < number2) {	// if number 1 is less than number, swap number 1 and number 2
				int temp = number1;
				number1 = number2;
				number2 = temp;
				}// end of if
			System.out.print("What is " + number1 + " - " + number2 + "? " );
			int answer = string2.nextInt ();//answer is the users answer converted to int
			if (number1 - number2 == answer) { 
				System.out.println("You are correct!");
				int2++; // Increase the correct answer count
				}//end of if
			else {
				System.out.println ( "Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + ( number1 - number2 ));
				int1++;	// increase the incorrect answer count
				}//end of else
			string1 += "\n" + number1 + "-" + number2 + "=" + answer + (( number1 - number2 == answer ) ? " correct" : " wrong" );	//this continues to add the statement to string1. 
			}// end of while loop
		
		
			long endTime = System . currentTimeMillis ();	//get the current time for end time
			long testTime = endTime - startTime;		//calculate the total test time
			System.out.println("\n");
			System.out.println ("Correct count is " + int2 + "\nTest time is " + testTime / 1000 + " seconds\n" +	string1 );
		
			
			string2.close();	//close the scanner input string2
	}// end of method main

}//end of class MathsTest
