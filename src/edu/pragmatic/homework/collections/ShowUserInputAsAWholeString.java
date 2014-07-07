package edu.pragmatic.homework.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowUserInputAsAWholeString {

	public static void main(String[] args) {
		try(Scanner console = new Scanner(System.in)){
			String line = null;
			List<String> userInput = new ArrayList<>();
			while(!( line = console.nextLine() ).equals("END OF TEXT")){
				userInput.add(line);
			}
			System.out.println(concatenateUserInputIntoASingleWord(userInput));
		}
	}

	private static String concatenateUserInputIntoASingleWord(List<String> userInput) {
		StringBuilder sb = new StringBuilder();
		for (String input : userInput) {
			sb.append(input);
		}
		return sb.toString();
	}
	
}
