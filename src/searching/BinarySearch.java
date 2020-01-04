package searching;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/*
Binary search is one of the most popular algorithms
* The algorithm finds the position of a target value within a sorted array
*
* Worst-case performance	O(log n)
* Best-case performance	O(1)
* Average performance	O(log n)
* Worst-case space complexity	O(1)*/
public class BinarySearch extends MasterData implements SearchAlgorithm {

	@Override
	public <T extends Comparable<T>> int find(T[] arr, T value) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid].compareTo(value) > 0) {
				high = mid - 1;
			} else if (arr[mid].compareTo(value) < 0) {
				low = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		Random r = ThreadLocalRandom.current();
		
		  
		  int size = 100;  int maxElement = 100000;  Integer[] integers =
		  IntStream.generate(() ->
		  r.nextInt(maxElement)).limit(size).sorted().boxed().toArray(Integer[]::new);
		   // The element that should be found 
		  int shouldBeFound =
		  integers[r.nextInt(size - 1)];
		 
		//Integer[] integers = { 23, 49, 78, 88, 105, 120, 126 };
		//int shouldBeFound = 105;
		BinarySearch ls = new BinarySearch();
		int atIndex = ls.find(integers, shouldBeFound);
		System.out.println(String.format("Should be found: %d. Found %d at index %d. An array length %d", shouldBeFound,
				integers[atIndex], atIndex, size));

		int toCheck = Arrays.binarySearch(integers, shouldBeFound);
		System.out.println(
				String.format("Found by system method at an index: %d. Is equal: %b", toCheck, toCheck == atIndex));
	}

}
