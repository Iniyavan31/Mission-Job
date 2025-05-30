package org.spicejet;

public class Airbus {
private void employee() {
	System.out.println("employee details");

}
private void employee(int id) {
	System.out.println("employee id is "+id);
	
}
private void employee(long num,boolean bi) {
	System.out.println("employee phone number is "+num);
	System.out.println("the given information is "+bi);
}
public static void main(String[] args) {
	Airbus a=new Airbus();
	a.employee();
	a.employee(31);
	a.employee(6380288573l, true);
}
}
