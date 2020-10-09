package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] Array = {"One", "Two", "Three", "Black", "White"};
		//2. print the third element in the array
		System.out.println(Array[2]);
		//3. set the third element to a different value
		Array[2] = "Four";
		//4. print the third element again
		System.out.println(Array[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int ArrayLooper = 0; ArrayLooper < Array.length; ArrayLooper++) {
			Array[ArrayLooper] = "Gray";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int ArrayLooper2 = 0; ArrayLooper2 < Array.length; ArrayLooper2++) {
			System.out.print(Array[ArrayLooper2] + " ");
		}
		System.out.println("");
		//7. make an array of 50 integers
		int[] Array2 = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		Random RandomNumberGen = new Random();
		for (int ArrayLooper3 = 0; ArrayLooper3 < Array2.length; ArrayLooper3++) {
			Array2[ArrayLooper3] = RandomNumberGen.nextInt(101);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int SmallestNumber = 1000;
		for (int ArrayLooper4 = 0; ArrayLooper4 < Array2.length; ArrayLooper4++) {
			if (Array2[ArrayLooper4] < SmallestNumber) {
				SmallestNumber = Array2[ArrayLooper4];
			}
		}
		System.out.println(SmallestNumber);
		//10 print the entire array to see if step 8 was correct
		for (int ArrayLooper5 = 0; ArrayLooper5 < Array2.length; ArrayLooper5++) {
			System.out.print(Array2[ArrayLooper5] + " ");
		}
		System.out.println("");
		//11. print the largest number in the array.
		int BiggestNumber = -1;
		for (int ArrayLooper6 = 0; ArrayLooper6 < Array2.length; ArrayLooper6++) {
			if (Array2[ArrayLooper6] > BiggestNumber) {
				BiggestNumber = Array2[ArrayLooper6];
			}
		}
		System.out.println(BiggestNumber);
		//12. print only the last element in the array
		System.out.println(Array2[Array2.length - 1]);
	}
}
