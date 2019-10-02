package com;

import java.util.*;
public class stack {

	  
	
	public static void main(String args[]){  
	Stack<String> v=new Stack<String>();  
	v.push("Ayush");  
	v.push("Amit");  
	v.push("Ashish");  
	v.push("Garima"); 
	System.out.println(v.pop());
	System.out.println(v.peek());
	
	Iterator<String> itr=v.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  

