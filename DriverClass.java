package solution2.driver;

import java.util.Arrays;
import java.util.Scanner;

import solution2.services.CountNotes;
import solution2.services.MergeSort;

public class DriverClass {

	public static void main(String[] args) {
		
		MergeSort mergeSort = new MergeSort();
		CountNotes countNotes = new CountNotes();

		System.out.println("Enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSort.sort(notes,0,notes.length-1);
		countNotes.notesCounting(notes, amount);

	}

}
