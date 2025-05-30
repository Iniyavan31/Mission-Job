package org.spicejet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Programing {

	public static void main(String[] args) {
//	int num= 123456;
//	int rev= 0;
//	int rem=0;
//	while (num>0) {
//		rem=num%10;
//		rev=(rev*10)+ rem;
//		num=num/10;	
//		
//	}
////	System.out.println(rev);
//		String s = "python";
//				for (int i = s.length()-1; i>=0;i--) {
//					char charAt = s.charAt(i);
//					System.out.print(charAt);
//				}
		Integer a[] = {10,20,20,30,10,40,50,};
	List<Integer> li  = new LinkedList<Integer>(Arrays.asList(a));
System.out.println(li);

	Set<Integer> s  = new LinkedHashSet<Integer>(li);
	System.out.println(s);
		
		
}
	
}


