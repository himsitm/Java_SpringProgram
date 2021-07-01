package com.example.spring.basic.springfirstprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFirstProgramApplication {

	public static void main(String[] args) {
		//Hello World
		HelloWorldImply helloWorld = new HelloWorldImply();
		helloWorld.displayText();
		
		
		/*Basic functionality is below to execute functions. If you want it using Spring Boot goto to SECTION 
		//Sort algorithm is a dependency on Binary Search
		//Binary Search on Bubble Sort
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());		//BubbleSortAlgorithm is a Bean for this program
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
		
		
		//Binary Search on Quick Sort
		binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());				//QuickSortAlgorithm is a Bean for this program
		result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
		*/
		
		
		//Calling via Spring Boot way. 
		//Application Context which will maintain all Beans
		ApplicationContext applicationContext =  SpringApplication.run(SpringFirstProgramApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);

	}

}
