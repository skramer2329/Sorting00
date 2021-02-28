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

	public int[] quickSort(int[] arrToSort) {

		return null;
	}

	public int[] mergeSort(int[] arrToSort) {

		return null;
	}

	public int[] insertionSort(int[] arrToSort) {

		return null;
	}

	public int[] selectionSort(int[] arrToSort) {

		return null;
	}

	public int[] heapSort(int[] arrToSort) {

		return null;
	}

	public int[] bucketSort(int[] arrToSort) {

		return null;
	}

	public int[] radixSort(int[] arrToSort) {

		return null;
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
