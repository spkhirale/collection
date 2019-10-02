package Reverse;

import java.util.HashSet;
import java.util.Set;

public class DulicateArray {
public static void main(){
	 String names[]={"java","ruby","python","java"};
	 Set<String> restore=new HashSet<String>();
	 for(String name:names){
		 if(restore.add(name)== false){
			 System.out.println(name);
			 
			 
			 
			 
		 }
		 
		 
		 
		 
	 }
	
	
	
}
}
