package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.stream.Collectors;

public class ArrayListEx1 {
	public static void main(String[] args) {
		
		
		List<Employee> emps= new ArrayList<>();
		
		emps.add(new Employee(1,"Bhavani",25000.00));
		emps.add(new Employee(5,"Prasad",9000.00));
		emps.add(new Employee(2,"gujjari",90000.00));
		emps.add(new Employee(3,"indian",15000.00));
		emps.add(new Employee(4,"King",79000.00));
		
		
		// Cursors
		
		//Data reading using Iterator cursor...
		
		
		Iterator<Employee> itr= emps.iterator();
		while(itr.hasNext()) {
			Employee e=itr.next();
			
			// Data removing using iterator
			if(e.getName().equals("Bhavani")) {
			itr.remove();
			}
	
			
		}
		System.out.println(emps);
		System.out.println("--------------------------------");

		
		
		// Data reading and removing and replacing using ListIterator cursor
		ListIterator<Employee> lstr= emps.listIterator();
		
		while(lstr.hasNext()) {
			Employee e= lstr.next();
			if(e.getId()==4) {
				lstr.set(new Employee(100,"Bhavanigadu",9090.90));
			}
		}
		
		System.out.println(emps);
		System.out.println("--------------------------------");

		
		
		
		
		
		
		// List iterator is a by directional cursor so we can read the data in reverse order also...
		
		ListIterator<Employee> lstr1= emps.listIterator(emps.size()-1);
		
		while(lstr1.hasPrevious()) {
			System.out.println(lstr1.previous());
}
		
		System.out.println("--------------------------------");
		
		Vector<Employee>vctr=new Vector<>(emps);
		
		// Data reading using Enumeration...
		Enumeration<Employee> enmr= vctr.elements();
		
		while(enmr.hasMoreElements()) {
			System.out.println(enmr.nextElement());
		}
		
		
		
/*........................Data Sorting......................................
	*	We can sort the data in three ways ....
	
		1.Collections.sort()
		2.list.sort()
		3.stream.sorted()
		
	
		*/
		
		//using Collections.sort() method...............
		System.out.println("---------------------------------------");
		System.out.println("Data sorting using Collections.sort() method");
		
		Collections.sort(emps, Comparator.comparing(Employee::getId));
		emps.forEach(System.out::println);
		
		System.out.println("---------------------------------------");
		System.out.println("Data sorting using Collections.sort() method in reverse order");
		
		Collections.sort(emps, Comparator.comparing(Employee::getId).reversed());
		emps.forEach(System.out::println);
		
		
		//using  list.sort method................
		
		System.out.println("---------------------------------------");
		System.out.println("Data sorting using list.sort() method");
		
		emps.sort(Comparator.comparing(Employee::getName));
		emps.forEach(System.out::println);
		
		System.out.println("---------------------------------------");
		System.out.println("Data sorting using stream.sorted() method");
		
		emps.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
		
		
		
		
		
		


		
		
	}

}
