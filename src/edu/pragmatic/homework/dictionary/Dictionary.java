package edu.pragmatic.homework.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		try(Scanner console = new Scanner(System.in) ){
			Map<String, String> dict = new HashMap<>();
			boolean menuFlag = true;
			while (menuFlag){
				System.out.println("1. Enter word");
				System.out.println("2. Remove word");
				System.out.println("3. Search word");
				System.out.println("4. Exit Program");
				
				String option = console.nextLine();
				
				switch (option) {
					case "1" : addWord(console, dict); break;
					case "2" : removeWord(console, dict); break;
					case "3" : searchWord(console, dict); break;
					case "4" : menuFlag = false; break;
					default: System.out.println("Unknown option " + option);
				}
			}
			System.out.println("Good bye!");
		}
	}

	private static void searchWord(Scanner console, Map<String, String> dict) {
		System.out.println("Enter word to search for: ");
		String word = console.nextLine();
		String translation = dict.get(word);
		if (translation != null) System.out.println(word + "=" + translation);
		else System.out.println("No translation was found for " + word);
	}

	private static void removeWord(Scanner console, Map<String, String> dict) {
		System.out.println("Enter word to remove from the dictionary ");
		String word = console.nextLine();
		dict.remove(word);
	}

	private static void addWord(Scanner console, Map<String, String> dict) {
		System.out.println("Enter word to add to dictionary: ");
		String word = console.nextLine();
		System.out.println("Enter the translation for " + word);
		String translation = console.nextLine();
		dict.put(word, translation);
		System.out.println("Adding dictionary entry " + word + "=" + translation);
	}
	
}
