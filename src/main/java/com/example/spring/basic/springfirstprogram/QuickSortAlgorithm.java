package com.example.spring.basic.springfirstprogram;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component			//Telling what are the Beans
@Primary			//If we have multiple component of same type (SortAlgorithm) then it will through error. So to handle that we need to use @Primary which will allow to pick primary first.
public class QuickSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		//Logic for Quick Sort
		
		return numbers;
	}

}
