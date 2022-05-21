package org.emp;

public class Employee {
	
	private void empId() {
		System.out.println("3226");

		
	}
	
	private void empName() {
		System.out.println("BALAJI");
	}
	
	private void empDob() {
		System.out.println("02.06.1995");

	}

	private void empPhone() {
		System.out.println("9994986795");
	}
	
	
	private void empEmail() {
		System.out.println("balajirb333@gmail.com");

	}
	
	
	public static void main(String[] args) {
		Employee my= new Employee();
		
	my.empId();
	my.empName();
	my.empPhone();
	my.empDob();
	my.empEmail();
		
	}
	
	
}
