package br.com.grimoire.streamstudy;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamStudyApplication.class, args);
		List<Integer> listOfNumbers = List.of(0, 4, 1, 7, 34, 1, 259, 3, 34, 12, 50, 89, 9, 5, 312, 63, 0, 893,
				5, 259, 4,
				34, 10, 35);
		// List<Integer> simpleListOfNumbers = List.of(6, 5, 1, 10, 8, 2);

		//Sorted
		// List<Integer> sortedNumbersLowerToHigher =
		// listOfNumbers.stream().sorted().toList();
		// System.out.println(sortedNumbersLowerToHigher.toString());

		// //Sorted with predicate
		// List<Integer> sortedNumbersHigherToLower = listOfNumbers.stream().sorted((p,
		// c) -> c - p).toList();
		// System.out.println(sortedNumbersHigherToLower.toString());

		// // Distinct
		// List<Integer> listOfNumbersUnique = listOfNumbers.stream().distinct().toList();
		// System.out.println(listOfNumbersUnique);

		//DropWhile
		List<Integer> listOfNumbersDropWhile = listOfNumbers.stream().dropWhile(number -> number != 63).toList();
		System.out.println(listOfNumbersDropWhile);

	}

}
