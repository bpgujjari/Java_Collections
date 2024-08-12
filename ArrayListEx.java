package com.collections;

import java.util.ArrayList;
import java.util.Spliterator;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.trimToSize();
		arrayList.add("Bhavani");
		arrayList.add("Prasad");
		arrayList.add("Gujjari");
		arrayList.add("king");
		
		
		
		arrayList.ensureCapacity(2);
		System.out.println(arrayList.size());
		
		Spliterator<String>sp= arrayList.spliterator();
		Spliterator<String> secondPart=  sp.trySplit();
		sp.forEachRemaining(System.out::println);
		System.out.println("---");
		secondPart.forEachRemaining(System.out::println);
	
		System.out.println("----");
		System.out.println(arrayList);
	}

}
