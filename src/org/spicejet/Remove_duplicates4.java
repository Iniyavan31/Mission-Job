package org.spicejet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicates4 {
public static void main(String[] args) {
//	String  s = " programming  class....";
//			Set<Character> se =  new LinkedHashSet<Character>();
//			for (int i = 0; i < s.length(); i++) {
//				
//				char ch = s.charAt(i);
//				se.add(ch);
//			}
//			System.out.println(se);
	
	String s =  "as am as have had him am him ";
	String[] split = s.split(" ");
	Set<String> se =  new LinkedHashSet<String>();
	for (String string : split) {
		se.add(string);
	}
	System.out.println(se);
	
	
	
	
	
	
	
	
}
}
