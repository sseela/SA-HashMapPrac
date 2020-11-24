package com.cg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		/*HashMap<Employee, String> map = new HashMap<>();
		map.put(new Employee("sandeep", 2000, "IT"), "first");
		map.put(new Employee("sandeep", 2000, "IT"), "first");
		
		System.out.println(map);*/
		
		/*If I don't override hashcode method in custom object, then hashcode of object method is called and unique hashcode is returned for 
		new objects as below.*/
		
		/*System.out.println(new Employee("sandeep", 2000, "IT").hashCode());     //2018699554
		System.out.println(new Employee("sandeep", 2000, "IT").hashCode());		//1311053135
		
		System.out.println(new Employee("sandy", 3000, "IT").hashCode());		//118352462
		System.out.println(new Employee("sandy", 3000, "IT").hashCode());		//1550089733
		
		Employee emp = new Employee("sandy", 3000, "IT");						
		System.out.println(emp.hashCode());									//865113938
		System.out.println(emp.hashCode());									//865113938
*/		
		
		
		/*After overriding the hashcode method in custom object to return same hashcode for equal objects.
		System.out.println(new Employee("sandeep", 2000, "IT").hashCode());     //1995192142
		System.out.println(new Employee("sandeep", 2000, "IT").hashCode());		//1995192142
		
		System.out.println(new Employee("sandy", 3000, "IT").hashCode());		//-907368275
		System.out.println(new Employee("sandy", 3000, "IT").hashCode());		//-907368275
		
		Employee emp = new Employee("sandy", 3000, "IT");						
		System.out.println(emp.hashCode());									//-907368275
		System.out.println(emp.hashCode());									//-907368275
*/	
		
		
		
		/*There is a contract between hashcode and equals method that if two objects are equal, then their hashcode must be equal.
		But vice versa is not true which is when two objects have same hashcode, then those two objects need not be equal.
		Hence both hashcode and equals methods are required to be overriden to tell if two objects are same or not.*/
		
		/*Different cases of hashcode and equals methods overriding in custom class:
			
		Case 1: Override only hashcode: If I override only hashcode in custom class, then when I add two same objects as keys in 
		the HashMap, then same hashcode will be returned for those two objects, but equals method will be called from object class,
		which compares their references and tells that those two objects are not equal. Thus, two objects will be placed in the 
		two different nodes of Hashtable. This is not required behaviour of HashMap
		
		Case 2: Override only equals: If I override only equals method in custom class, then when I add two same objects as keys in 
		the HashMap, then hashcode will be returned from the object class which will be unique(different) due to the fact that both objects 
		have two different references. So two different indexes are assigned to them based on hashcode. And then equals method is 
		called which says both objects are equal, but both will be kept in different indexes. This is also not required behaviour of 
		HashMap*/
		
		/*Hence we should override both hashcode and equals methods to achieve the required functionality of Hash related type*/
		
		
		/*Other cases:*/
		
		/*If I override hashcode and return same hashcode value everytime, and equals is always true, then only one object is placed
		 in the map.*/
		
		/*If I override hashcode and return same hashcode value everytime, but equals is always false, then in the same index only,
		 two different objects will be stored with the help of Linked List*/ 
		
		/*If I override equals and hardcode the return value as true everytime, then put method will try to calculate the hash value with 
		the help of hashcode which will be different that is coming from Object class, so two different indexes will be evaluated and then 
		they are stored at two different places.*/
		
		/*Map<String, String> map = new HashMap<>();
		map.put("FB", "first");
		map.put("Ea", "second");
		
		System.out.println(map.size());*/
		
		/*HashMap map = new HashMap<>();
		map.put(new Employee("sandeep", 2000, "IT"), "first");
		map.put(new Employee("sandeep", 2000, "IT"), "second");
		map.put(new Employee("sandeep", 2000, "IT"), "third");
		map.put(new Employee("sandeep", 2000, "IT"), "fourth");
		
		System.out.println(map);
		System.out.println(map.size());*/
		
		/* **************hashcode is calculated based on the address of the object in object class if not overridden*/
		
		/*Even if hashCollision happens, all the objects are placed at one index, still the size will be based on size of LL present inside the bucket.*/
		
		/*While put and get operations, both hashcode and equals methods will be called based on which anything will be decided.*/
		
		/*A custom object should be immutable and it should override hashcode and equals methods*/
		
		HashMap<Employee, String> hashMap = new HashMap<>();
		hashMap.put(new Employee("sandeep", 2000, "java"), "first");
		hashMap.put(new Employee("sandeep", 2000, "java"), "second");
		System.out.println(hashMap);
	}
}
