import java.util.Scanner;

public class SumElements {

	public static void main(String[] args) {
		double[][] Array = new double[3][4];	//creates a 2 dimensional array of 3-by-4  (3 rows, 4 coloumns)
		double Sum = 0;
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Please enter the values of the array one row at a time:");
		for (int i =0; i < 3; i++) { 	//the outer for loop is for the rows in the array
			for (int j =0; j < 4; j++) {	//the inner for loop is for the coloumns in the array
				Array[i][j] = Input.nextDouble();	//NB: the nextdouble() is used because some of the elements are doubles
			}	//end of inner for loop
		}	//end of outer for loop
		
		
		
		//*************Calculating the sum of all the coloumns*********************
		for (int c = 0; c<4; c++) {
			Sum = 0; // re initialise the Sum to 0 when we move to the next coloumn
			for (int r =0; r<3; r++) {
				Sum = Sum + Array[r][c];	// sum all the coloumns
			} //end of loop for rows
			
			System.out.println("The sum of coloumn " + c + " is " + Sum);
		}  // end of outer loop for coloumns
			
		
		//System.out.println("The sum of coloumn is " + Sum);
		
	}	//end of method main

}	//end of class SumElements
