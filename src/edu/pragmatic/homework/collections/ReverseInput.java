package edu.pragmatic.homework.collections;

import java.util.Scanner;
import java.util.Stack;

public class ReverseInput {
	
	public static void main(String[] args) {
		try(Scanner console = new Scanner(System.in)){
			String line = null;
			Stack<String> userInput = new Stack<>();
			while(!( line = console.nextLine() ).equals("END OF TEXT")){
				userInput.add(line);
			}
			
			int elementsEntered = userInput.size();
			for (int i=0; i < elementsEntered; i++){
				System.out.println(userInput.pop());
			}
		}
	}

}
