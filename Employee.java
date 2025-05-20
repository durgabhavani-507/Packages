2 .  Employee and Department Management 

package com.company.hr; 
public class Employee { 
private int id; 
private String name; 
private double salary; 
public void setName(String name) { 
this.name=name; 
} 
public void setID(int id) { 
this.id=id; 
} 
public void setSalary(double salary) { 
this.salary=salary; 
} 
public String getName() { 
return name; 
} 
public int getID() { 
return id; 
}
public double getSalary() { 
  return salary; 
 } 
 public void showEmployeeDetails() { 
  System.out.println("Employee Name:"+name); 
  System.out.println("Employee ID:"+id); 
  System.out.println("Employee Salary:"+salary); 
 } 
} 
 
package com.company.admin; 
 
public class Department { 
 private String deptName; 
 private int deptId; 
 public void setName(String deptName) { 
  this.deptName=deptName; 
 } 
 public void setDept(int deptId) { 
  this.deptId=deptId; 
 } 
 public String getName() { 
  return deptName; 
 } 
 public int getId() { 
  return deptId; 
 } 
 public void showDepartmentDetails() { 
  System.out.println("Department ID:"+deptId); 
  System.out.println("Departmebt Name:"+deptName); 
 } 
} 
 
package com.company.app; 
import com.company.admin.Department; 
import com.company.hr.Employee; 

public class CompanyApp { 
 public static void main(String[] args) { 
  Employee obj=new Employee(); 
  Department obj=new Department(); 
  obj.setName("Hello"); 
  obj.setID(507); 
  obj.setSalary(550000); 
  obj.setDept(9); 
  obj.setName("frontend developer"); 
  obj.showEmployeeDetails(); 
  obj.showDepartmentDetails(); 
}
}




 
