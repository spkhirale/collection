package com;

public class string_duplicates {

public static void main(String[] args){
	
	String str="shruti hawanna";
	int cnt=0;
	char[] inp = str.toCharArray();
	 for(int i=0;i<inp.length;i++){
		 for(int j=i+1;j<inp.length;j++){
			if(inp[i]==inp[j]){
				System.out.println(inp[i]);
			} 
			 
			 
			 
		 }
	 }
	
}	

	
}
