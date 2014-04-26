package edu.pragmatic.homework.comparable;

public class FindMaxNumberInAnArray {
	
	public static void main(String[] args) {
			Number[] numbers = new Number[] { 
				new Number(-4),new Number(0),new Number(7),
				new Number(-14),new Number(24),new Number(10)
			} ;
			order(numbers);
			System.out.println(numbers[0]);
	}
	
	
	private static Number[] order(Number[] numbers ){
		for (int i = 0; i < numbers.length; i++) {
		    for (int y = 1; y < numbers.length - i; y++) {
		        if (numbers[i - 1].compareTo((numbers[i])) > -1 ) {
		            Number temp = numbers[i - 1];
		            numbers[i - 1] = numbers[i];
		            numbers[i] = temp;
		        }
		    }
		 }
		
		return numbers;
	}

}
