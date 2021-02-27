package cj.kata;

public class Driver {
	public static void main(String[] args) {
		
		
		//checking to make sure createArray in SortingArraysTest works
		int arr7[] = new int[50];
		int random;
		for(int i = 0; i < 50; i++) {
			random = (int)(Math.random()*100)+1;
			arr7[i] = random; 
			System.out.println("random value is " + random);
			System.out.println("arr7 at index: " + i + " is equal to " + arr7[i]);
		}
		
	}
}
