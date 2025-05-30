package org.indigo;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner A= new Scanner(System.in);
		System.out.println("enter the value of A");
		int a = A.nextInt();
		System.out.println("enter the value of B");
		int b =A.nextInt();
		int c=a+b;
		System.out.println("the sum of A&B is " +c);
		
	}



}
