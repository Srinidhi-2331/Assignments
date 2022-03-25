package com.training.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAvg {

	public static void main(String[] args) {
		List<Integer> arr =Arrays.asList(1,2,3,4,5,6,7,8);
		Stream<Integer> str= arr.stream();
		str.reduce((a,b)->a+b).ifPresent(System.out::println);
		

	}

}
