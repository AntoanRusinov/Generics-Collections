package edu.pragmatic.homework.registry;

import java.util.LinkedList;
import java.util.Queue;

public class Registry<T> {

	private String name;
	private int maxNumberOfElements;
	private Queue<T> elements;
	
	public Registry(String name, int maxElementsNumber) {
		this.maxNumberOfElements = maxElementsNumber;
		elements = new LinkedList<>();
		this.name = name;
	}
	
	public T getElement(){
		return elements.poll();
	}
	
	public boolean addElement(T element){
		if ( elements.size() < maxNumberOfElements ) 
			return elements.add(element);
		
		return false;
	}

	public String getName() {
		return name;
	}
	
	public int size(){
		return this.elements.size();
	}
	
	public Object[] getElementsArray(){
		return elements.toArray();
	}
}
