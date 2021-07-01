package com.example.spring.basic.springfirstprogram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component		//Telling what are the Beans
public class BinarySearchImpl {
	
	@Autowired			//Telling this is a dependency of a Bean. sortAlgorithm is a dependency for binary search
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	//Sorting an array
	//Search an array
	//Return the result
	
	/*Below method is tightly coupled method which is not a good thing from Spring Boot perspective.
	That means we can only perform bubble sort and not any other sorting algorithm.
	To perform any other sorting we need to create another method. 
	So this is called as TIGHTLY COUPLED.
	So get rid of these we need to create the logic of different sorting separately in different class 
	such BubbleSortAlgorithm*/

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		//Sorting an array
		//Bubble sort algorithm
		/*Tight Coupling example
		 * BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		 * int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		 */
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//Search an array
		
		//Return the result
		return 3;
	}
}
