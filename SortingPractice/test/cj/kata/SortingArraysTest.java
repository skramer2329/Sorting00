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
		arr5 = new int[] { 0 };
		arr6 = null;
		

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
			} else
				first = false;
		}
	}

	// Tests BubbleSort
	public void test00() {
		int arr[] = sorter.bubbleSort(arr6);
		assertNull(arr);
	}

	public void test01() {
		int arr[] = sorter.bubbleSort(arr1);
		testIsSorted(arr);
	}

	public void test02() {
		int arr[] = sorter.bubbleSort(arr2);
		testIsSorted(arr);
	}

	public void test03() {
		int arr[] = sorter.bubbleSort(arr3);
		testIsSorted(arr);
	}

	public void test04() {
		int arr[] = sorter.bubbleSort(arr4);
		testIsSorted(arr);
	}
	
	public void test05() {
		int arr[] = sorter.bubbleSort(arr5);
		assertEquals(arr5, arr);
	}

	// Tests QuickSort
	public void test20() {
		int arr[] = sorter.quickSort(arr1);
		testIsSorted(arr);
	}
	
	public void test21() {
		int arr[] = sorter.quickSort(arr2);
		testIsSorted(arr);
	}
	
	public void test22() {
		int arr[] = sorter.quickSort(arr3);
		testIsSorted(arr);
	}
	
	public void test23() {
		int arr[] = sorter.quickSort(arr4);
		testIsSorted(arr);
	}
	
	public void test24() {
		int arr[] = sorter.quickSort(arr5);
		testIsSorted(arr);
	}
	
	public void test25() {
		int arr[] = sorter.quickSort(arr6);
		assertNull(arr);
	}
	

	// Tests MergeSort
	public void test30() {
		int arr[] = sorter.mergeSort(arr1);
		testIsSorted(arr);
	}
	
	public void test31() {
		int arr[] = sorter.mergeSort(arr2);
		testIsSorted(arr);
	}
	
	public void test32() {
		int arr[] = sorter.mergeSort(arr3);
		testIsSorted(arr);
	}
	
	public void test33() {
		int arr[] = sorter.mergeSort(arr4);
		testIsSorted(arr);
	}
	
	public void test34() {
		int arr[] = sorter.mergeSort(arr5);
		testIsSorted(arr);
	}
	
	public void test35() {
		int arr[] = sorter.mergeSort(arr6);
		assertNull(arr);
	}

	// Tests InsertionSort
	public void test40() {
		int arr[] = sorter.insertionSort(arr1);
		testIsSorted(arr);
	}
	
	public void test41() {
		int arr[] = sorter.insertionSort(arr2);
		testIsSorted(arr);
	}
	
	public void test42() {
		int arr[] = sorter.insertionSort(arr3);
		testIsSorted(arr);
	}
	
	public void test43() {
		int arr[] = sorter.insertionSort(arr4);
		testIsSorted(arr);
	}
	
	public void test44() {
		int arr[] = sorter.insertionSort(arr5);
		testIsSorted(arr);
	}
	
	public void test45() {
		int arr[] = sorter.insertionSort(arr6);
		assertNull(arr);
	}

	// Tests SelectionSort
	public void test50() {
		int arr[] = sorter.selectionSort(arr1);
		testIsSorted(arr);
	}
	
	public void test51() {
		int arr[] = sorter.selectionSort(arr2);
		testIsSorted(arr);
	}
	
	public void test52() {
		int arr[] = sorter.selectionSort(arr3);
		testIsSorted(arr);
	}
	
	public void test53() {
		int arr[] = sorter.selectionSort(arr4);
		testIsSorted(arr);
	}
	
	public void test54() {
		int arr[] = sorter.selectionSort(arr5);
		testIsSorted(arr);
	}
	
	public void test55() {
		int arr[] = sorter.selectionSort(arr6);
		assertNull(arr);
	}
	

	// Tests HeapSort
	public void testHeapSort() {
		//need a different kind of test for heap sort
			//testIsSorted will not work on heapsort because of how priority works
	}

	// Tests BucketSort
	public void testBucketSort() {
		//need to learn more about this sorting algorithm
	}

	// Tests RadixSort
	public void testRadixSort() {
		//need to learn more about this sorting algorithm
	}

}
