package cj.kata;

import junit.framework.TestCase;

public class SortingArraysTest extends TestCase {

	SortingArrays sorter;
	int arr1[], arr2[], arr3[], arr4[], arr5[], arr6[];

	public void setUp() {

		sorter = new SortingArrays();

		arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		arr2 = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		arr3 = new int[] { -1, -2, -4, -5, 7, 4, 2, 0, 3 };
		arr4 = new int[] { 3, 3, 4, 5, 5, 6, 7, 4, 8, 0 };
		arr5 = null;

	}

	public void testIsSorted(int[] arr) {
		boolean first = true;
		int prev, curr = 0;
		for (int num : arr) {
			prev = curr;
			curr = num;

			if (!first) {
				boolean condition = prev < curr;
				if (!condition) {
					assertTrue(condition);
				}
			}else first = false;
		}
	}

	//Tests BubbleSort
	public void testBubbleSort() {
		int arr[] = sorter.bubbleSort(arr5);
		assertNull(arr);
	}
	
	//Tests QuickSort
	public void testQuickSort() {

	}
	
	//Tests MergeSort
	public void testMergeSort() {

	}

	public void testInsertionSort() {

	}

	public void testSelectionSort() {

	}

	public void testHeapSort() {

	}

	public void testBucketSort() {

	}

	public void testRadixSort() {

	}

}
