package searching;

import java.time.Duration;
import java.time.Instant;

/*
* Linear search is the easiest search algorithm
* It works with sorted and unsorted arrays (an binary search works only with sorted array)
* This algorithm just compares all elements of an array to find a value
* <p>
* Worst-case performance	O(n)
* Best-case performance	O(1)
* Average performance	O(n)*/
public class LinearSearch extends MasterData implements SearchAlgorithm {

	
	
	@Override
	public <T extends Comparable<T>> int find(T[] arr, T value) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].compareTo(value)==0) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int shouldbeFound=searchElement();
		Integer[] integers=getArrayData();
		LinearSearch ls=new LinearSearch();
		int atIndex=ls.find(integers, shouldbeFound);
		System.out.println(String.format("Should be found :%d  found %d at index %d.  An array lenght %d", shouldbeFound,integers[atIndex],atIndex,size));	
	}
	
	
	

}
