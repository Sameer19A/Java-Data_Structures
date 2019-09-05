
public class NoDups {

	public static void main(String[] args) {
		
		int[] Testarray = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};  //array of size 20 elements. note the curly brackets to assign array values manually	
		System.out.println("The array BEFORE any duplicates are removed is:");

		for (int i=0; i < Testarray.length; i++) {
			System.out.print(Testarray[i] + " ");  // dont use println, if we use println then it will print each value of array on separate line
		}

		RemoveDups(Testarray);	//call the method RemoveDups. the method does not return a value, hence we do not need to assign it to a variable., we just call the method.

	} //end of method main

	public static void RemoveDups(int[] Array) {   //no return type because we dont return the array
		int[] FinalArray = new int[Array.length];   // make the final array, the same size as the inputted array		
		System.out.print("\n");
		int Fin = 0, ArrLen=0;   //ArrLen is the count of number of elements in the Final Array everytime one element is added
		for (int i = 0; i < Array.length; i++) {
			int num = 0;	//counts the number of appearances of a certain number in the array
			for (int j = 0; j < Array.length; j++) {
				if (Array[i] == Array[j]) {
					num++;	//if there is a duplicate, increase the count
					}//end of if statement
				
			}	//end of inner for loop
			
		if (num == 1) { // if the count is one then add that number to the final array
			FinalArray[Fin] = Array[i]; //add the current value of the Array to the final array if the current value is not repeated
			Fin++;
			ArrLen++;  
			}  //end of if

		}	//end of outer for loop

		
		System.out.println("\n\nThe array after duplicates are removed is: ");
		//System.out.println("\n"+ ArrLen);
		for (int k=0; k < ArrLen; k++) {
			System.out.print(FinalArray[k] + " ");
		}

	}	//end of method RemoveDups    

}	//end of class NoDups
