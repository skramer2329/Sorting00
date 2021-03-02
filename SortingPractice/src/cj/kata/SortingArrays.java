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
		// maybe I can use partition-1 as the length comparison
		if (arrToSort == null)
			return null;
		int partition = arrToSort.length - 1;
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

	// helper method for quickSort:
	public int getRandomPivot(int[] arr, int firstIndex, int lastIndex) {

		int randomPivot = (int) (Math.random() * lastIndex) + 1;

		swap(arr, 0, randomPivot);

		// set index of pivot to last index
		randomPivot = 0;
		return randomPivot;
	}

	// helper method for quicksort:
	public int partition(int[] arr, int startIndex, int endIndex) {

		int pivot = startIndex;
		int i,j;
		
		for(i = pivot+1, j = endIndex; i<j;) {
			while(arr[i] < arr[pivot])
				i++;
			while(arr[j] > arr[pivot])
				j--;
			
			swap(arr, j, pivot);
		}
		pivot = j;
		
		return pivot;
	}

	// Divide and conquer; Worse case: O(n^2); Best Case: O(n log n)
	// Note: using a random pivot almost guarantees O(n log n) I believe...
	// I'm almost out of coffee R.I.P
	public int[] quickSort(int[] arrToSort, int startIndex, int lastIndex) {

		if (arrToSort == null)
			return null;

		// I think this conditional is incorrect
		if (startIndex < lastIndex+1) {

			// pivot is now in it's correct place after calling partition
			int pivotCorrect = partition(arrToSort, getRandomPivot(arrToSort, startIndex, lastIndex), lastIndex);

			// left partition:
			quickSort(arrToSort, 0, pivotCorrect - 1);

			// right partition:
			quickSort(arrToSort, pivotCorrect + 1, lastIndex-1);
		}
		
		return arrToSort;
	}

	public int[] mergeSort(int[] arrToSort) {
		if (arrToSort == null)
			return null;

		return arrToSort;
	}

	public int[] insertionSort(int[] arrToSort) {
		if (arrToSort == null)
			return null;

		return arrToSort;
	}

	public int[] selectionSort(int[] arrToSort) {
		if (arrToSort == null)
			return null;

		return arrToSort;
	}

	public int[] heapSort(int[] arrToSort) {
		if (arrToSort == null)
			return null;

		return arrToSort;
	}

	public int[] bucketSort(int[] arrToSort) {
		if (arrToSort == null)
			return null;

		return arrToSort;
	}

	public int[] radixSort(int[] arrToSort) {
		if (arrToSort == null)
			return null;

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
