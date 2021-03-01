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
	public void partition() {
		
	}
	
	//Divide and conquer; Worse case: O(n^2); Best Case: O(n log n)
	public int[] quickSort(int[] arrToSort) {

		if(arrToSort == null) return null;
		
		//gets random pivot
		int pivot = getRandomPivot(0, arrToSort.length);
		
		//places value of pivot at last index
		swap(arrToSort, arrToSort.length, pivot);
		
		//set index of pivot to last index
		pivot = arrToSort.length;
		
		for(int i = 0, j = arrToSort.length-1; i != j; ) {
			
			if((arrToSort[i] > arrToSort[pivot]) && (arrToSort[j] < arrToSort[pivot])) {
				swap(arrToSort, i, j);
				i++;
				j--;
			}
		}
		
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
