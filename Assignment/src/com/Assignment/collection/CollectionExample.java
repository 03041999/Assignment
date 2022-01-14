package com.Assignment.collection;

import java.util.*; 

public class CollectionExample {
	 

	    public static void main(String args[])
	    {
	        
	        ArrayList<String> numbers = new ArrayList<String>();  
	        
	        //Adding items to arraylist  
	        numbers.add("One");
	        numbers.add("Two");  
	        numbers.add("Three");  
	        numbers.add("Two");  

	        //Traversing arraylist through Iterator  
	        Iterator iter = numbers.iterator();  
	        System.out.println("The items in the collection are: ");
	        while(iter.hasNext())
	        {  
	            System.out.println(iter.next());  
	        }  
	    }  
	}  



