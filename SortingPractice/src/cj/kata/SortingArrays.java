package cj.kata;

/*
 * Sabrina Kramer
 * Personal Project
 * Sorting
 * 
 */
public class SortingArrays {
	// Different sorting algorithms to code
	// Quick sort
	// Bubble sort
	// Merge sort
	// Insertion sort
	// Selection sort
	// Heap sort
	// Radix sort
	// Bucket sort

	// Data Structures to work with
	// Arrays, Linked Lists, BST, heap
	
	/*
	 * TODO: add wellformed method to test data structure if necessary
	 */

	public void swap(int[] arr, int indexA, int indexB) {

		int tmp = arr[indexA];
		arr[indexA] = arr[indexB];
		arr[indexB] = tmp;

	}

	// Big O analysis: O(n^2) because it uses nested loops
	public int[] bubbleSort(int[] arrToSort) {
		//maybe I can use partition-1 as the length comparison
		if (arrToSort == null)
			return null;
		int partition = arrToSort.length-1;
		while (partition != 0) {
			for (int i = 0, j = i + 1; i < partition; i++) {
				if (arrToSort[i] > arrToSort[j])
					swap(arrToSort, i, j);

				j++;

			}
			--partition;
		}

		return arrToSort;
	}
	
	
	//helper method for quickSort:
	public int getRandomPivot(int firstIndex, int lastIndex) {
		
		int randomPivot = (int)(Math.random()*lastIndex) +1;
		return randomPivot;
	}
	
	//helper method for quicksort:
	public int partition(int[] arr) {
		
		return -1;
	}
	
	//Divide and conquer; Worse case: O(n^2); Best Case: O(n log n)
	public int[] quickSort(int[] arrToSort, int startIndex, int lastIndex) {

		if(arrToSort == null) return null;
		
		//Base case:
		if(arrToSort.length == 1) return arrToSort;
		
		//gets random index for pivot
		int pivot = getRandomPivot(0, arrToSort.length-1);
		
		//places value of pivot at last index; not sure if this is totally necessary tbh. Seems to make sorting easier
		swap(arrToSort, arrToSort.length-1, pivot);
		
		//set index of pivot to last index
		pivot = arrToSort.length-1;
		
		//pivot is now in it's correct place
		int pivotCorrect = partition(arrToSort);
		
		//Lets say we have a partition method... that works
		//What would it return? What if it returned the int index of pivot (in its right place)
			//then I could find the left and right partition
			
		//left partition:
		quickSort(arrToSort, 0, pivotCorrect-1);
		
		//right partition:
		quickSort(arrToSort, pivotCorrect+1, arrToSort.length-1);
		
		return arrToSort;
	}

	public int[] mergeSort(int[] arrToSort) {
		if(arrToSort == null) return null;
		
		return arrToSort;
	}

	public int[] insertionSort(int[] arrToSort) {
		if(arrToSort == null) return null;
		
		return arrToSort;
	}

	public int[] selectionSort(int[] arrToSort) {
		if(arrToSort == null) return null;
		
		return arrToSort;
	}

	public int[] heapSort(int[] arrToSort) {
		if(arrToSort == null) return null;
		
		return arrToSort;
	}

	public int[] bucketSort(int[] arrToSort) {
		if(arrToSort == null) return null;
		
		return arrToSort;
	}

	public int[] radixSort(int[] arrToSort) {
		if(arrToSort == null) return null;
		
		return arrToSort;
	}

	// Other Projects I want to work on (will make separate note later)
	// Queue, Stack, Heap, Lists, Iterators

	/*
	 * TODO Need to figure out what kinds of things I want this class to do For now
	 * it will only be sorting data structures
	 */

	/*
	 * TODO Need to create other classes that will sort different kinds of data
	 * structures. These classes will need their own test classes.
	 */

	/*
	 * TODO Later, need to create efficiency tests
	 */

}
