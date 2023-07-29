package com.aurionpro.model;

public class Accountant extends Employee{
	
	public Accountant(long employeeId, String name, double basic) {
		super(employeeId, name, basic);
		// TODO Auto-generated constructor stub
	}
	private double hra=0.25*basic;
	private double ma=0.20*basic;
	
	public double getHra() {
		return hra;
	}

	public double getMa() {
		return ma;
	}	
	
	@Override
	 public double calculateAnnualCTC() {  
		 double annualCtc = basic + hra + ma;
	  return annualCtc; 
	  }

	@Override
	public String toString() {
		return "Accountant [hra=" + hra + ", ma=" + ma + ", EmployeeID=" + EmployeeID + ", name=" + name + ", basic="
				+ basic + ", getHra()=" + getHra() + ", getMa()=" + getMa() + ", calculateAnnualCTC()="
				+ calculateAnnualCTC() + ", getEmployeeID()=" + getEmployeeID() + ", getName()=" + getName()
				+ ", getBasic()=" + getBasic() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
   
}
