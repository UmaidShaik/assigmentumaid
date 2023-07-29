package com.aurionpro.model;
public abstract class Employee {  
protected long EmployeeID;
 protected String name; 
 protected double basic;
 
 
 public long getEmployeeID() {  
	 return EmployeeID;
 } 
 public String getName() {
  return name;
 } public double getBasic() {
  return basic; }
  public Employee(long employeeID, String name, double basic) {
     super();  
  EmployeeID = employeeID;
  this.name = name;  
  this.basic = basic;
 } public abstract double calculateAnnualCTC();
 @Override public String toString() {
  return "Employee [EmployeeID=" + EmployeeID + ", name=" + name + ", basic=" + basic + "]"; }
  
}