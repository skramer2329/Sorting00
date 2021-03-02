package cj.kata;

import junit.framework.TestCase;

public class SortingArraysTest extends TestCase {

	SortingArrays sorter;
	int arr1[], arr2[], arr3[], arr4[], arr5[], arr6[], arr7[];

	public void setUp() {

		sorter = new SortingArrays();

		arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		arr2 = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		arr3 = new int[] { -1, -2, -4, -5, 7, 4, 2, 0, 3 };
		arr4 = new int[] { 3, 10, 4, 11, 5, 6, 7, 13, 8, 0 };
		arr5 = new int[] { 0 };
		arr6 = null;
		arr7 = new int[50];
		
		

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
	
	public int[] createArray(int[] arr) {
		
		for(int i = 0; i < 50; i++) {
			arr[i] = i+1;
		}
		
		return arr;
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
	
	public void test06() {
		createArray(arr7);
		int arr[] = sorter.bubbleSort(arr7);
		testIsSorted(arr);
	}

	// Tests QuickSort
	public void test20() {
		int arr[] = sorter.quickSort(arr1, 0, arr1.length-1);
		testIsSorted(arr);
	}
	
	public void test21() {
		int arr[] = sorter.quickSort(arr2, 0, arr2.length-1);
		testIsSorted(arr);
	}
	
	public void test22() {
		int arr[] = sorter.quickSort(arr3, 0, arr3.length-1);
		testIsSorted(arr);
	}
	
	public void test23() {
		int arr[] = sorter.quickSort(arr4, 0, arr6.length-1);
		testIsSorted(arr);
	}
	
	public void test24() {
		int arr[] = sorter.quickSort(arr5, 0, arr5.length-1);
		testIsSorted(arr);
	}
	
	public void test25() {
		int arr[] = sorter.quickSort(arr6, -1, -1);
		assertNull(arr);
	}
	
	public void test26() {
		int arr[] = sorter.quickSort(createArray(arr7), 0, arr7.length-1);
		testIsSorted(arr);
	}
	

	// Tests MergeSort
	public void test40() {
		int arr[] = sorter.mergeSort(arr1);
		testIsSorted(arr);
	}
	
	public void test41() {
		int arr[] = sorter.mergeSort(arr2);
		testIsSorted(arr);
	}
	
	public void test42() {
		int arr[] = sorter.mergeSort(arr3);
		testIsSorted(arr);
	}
	
	public void test43() {
		int arr[] = sorter.mergeSort(arr4);
		testIsSorted(arr);
	}
	
	public void test44() {
		int arr[] = sorter.mergeSort(arr5);
		testIsSorted(arr);
	}
	
	public void test45() {
		int arr[] = sorter.mergeSort(arr6);
		assertNull(arr);
	}
	
	public void test46() {
		int arr[] = sorter.mergeSort(arr7);
		testIsSorted(arr);
	}

	// Tests InsertionSort
	public void test60() {
		int arr[] = sorter.insertionSort(arr1);
		testIsSorted(arr);
	}
	
	public void test61() {
		int arr[] = sorter.insertionSort(arr2);
		testIsSorted(arr);
	}
	
	public void test62() {
		int arr[] = sorter.insertionSort(arr3);
		testIsSorted(arr);
	}
	
	public void test63() {
		int arr[] = sorter.insertionSort(arr4);
		testIsSorted(arr);
	}
	
	public void test64() {
		int arr[] = sorter.insertionSort(arr5);
		testIsSorted(arr);
	}
	
	public void test65() {
		int arr[] = sorter.insertionSort(arr6);
		assertNull(arr);
	}
	
	public void test66() {
		int arr[] = sorter.insertionSort(arr7);
		testIsSorted(arr);
	}

	// Tests SelectionSort
	public void test80() {
		int arr[] = sorter.selectionSort(arr1);
		testIsSorted(arr);
	}
	
	public void test81() {
		int arr[] = sorter.selectionSort(arr2);
		testIsSorted(arr);
	}
	
	public void test82() {
		int arr[] = sorter.selectionSort(arr3);
		testIsSorted(arr);
	}
	
	public void test83() {
		int arr[] = sorter.selectionSort(arr4);
		testIsSorted(arr);
	}
	
	public void test84() {
		int arr[] = sorter.selectionSort(arr5);
		testIsSorted(arr);
	}
	
	public void test85() {
		int arr[] = sorter.selectionSort(arr6);
		assertNull(arr);
	}
	
	public void test86() {
		int arr[] = sorter.selectionSort(arr7);
		testIsSorted(arr);
	}
	

	// Tests HeapSort
	public void testHeapSort() {
		//need a different kind of test for heap sort
			//testIsSorted will not work on heap sort because of how priority works
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
