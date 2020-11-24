package com.cg;

import java.util.HashMap;

public class MakeCustomObjectImmutable {

	public static void main(String[] args) {
		
		
		HashMap map = new HashMap<>();
		Employee emp1 = new Employee("sandeep", 2000, "IT");
		Employee emp2 = new Employee("sandeep", 2000, "IT");
		Employee emp3 = new Employee("sandeep", 2000, "IT");
		map.put(emp1, "first");
		map.put(emp2, "second");
		map.put(emp3, "third");
		/*emp3.setEmpName("varun");			// after using emp3 as key, now if we try to mutate the custom object, then we can never get the value
											// with the same reference  emp3 because when we try to get different hashcode will come, hence it searches in differnt index and returns null.
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get(emp1));*/
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		
		System.out.println(new String("sandy").hashCode());
		System.out.println(new String("sandy").hashCode());		//hashCode is calculated based on the address. hashCode and equals methods are overridden in all Wrapper classes.
		
		System.out.println(new StringBuffer("andy").hashCode());
		System.out.println(new StringBuffer("andy").hashCode());	//hashCode is not overidden in SB, so it goes to Object class hashCode method which calculates it with address.
	}
}
