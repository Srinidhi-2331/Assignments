package com.training.assignment;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAvg {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		
		
		IntStream str= IntStream.of(arr);
		OptionalDouble obj = str.average();
		
		if (obj.isPresent()) {
            System.out.println(obj.getAsDouble());
        }
        else {
            System.out.println("-1");
        }

		
		

	}

}
