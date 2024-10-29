package java_core;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingMagic {
	public static List<Integer> filterOddNumbers(List<Integer> numbers) {
		return numbers.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
	}
	public static List<Integer> getCubesOfFirstNNumbers(int n) {
        return IntStream.range(1, n+1).map(number -> number*number*number).boxed().collect(Collectors.toList());
    }
	public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        return courses.stream().map(String::length).collect(Collectors.toList());
    }
	 public static long sumOfSquares(List<Integer> numbers) {
		 return numbers.stream().mapToLong(n -> n*n).sum();
	    }
	 public static int findMaxNumber(List<Integer> numbers) {
		 Optional<Integer> maxNumber = numbers.stream().max(Integer::compare);
		 return maxNumber.orElse(0);
	    }
	
	public static void main(String[] args) {
		List<Integer> list  = List.of(3,5,6,2);
		
		System.out.println(findMaxNumber(list));
	}
}
