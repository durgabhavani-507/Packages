package com.school.management;

public class School {
	private String name;
	   private String location;
	   public void showSchoolInfo() { 
		   System.out.println("School Name:"+name); 
		   System.out.println("School Location:"+location);
	   }
	   public void setName(String name) {
		   this.name=name;
	   }
	   public void setLocation(String location) {
		   this.location=location;
	   }
	   public String getName() {
		   return name;
	   }
	   public String getLocation() {
		   return location;
	   }
}




package com.school.staff;

public class Principal {
  private String principalName;
  private int experienceYears;
  public void showPrincipalInfo() { 
	  System.out.println("School principal name is:"+principalName); 
	  System.out.println("Principal experienceYears is:"+experienceYears);
  }
  public void setprincipalName(String principalName) {
	   this.principalName=principalName;
  }
  public void setexperienceYears(int experienceYears) {
	   this.experienceYears=experienceYears;
  }
  public String getprincipalName() {
	   return principalName;
  }
  public int getexperienceYears() {
	   return experienceYears;
  }
}



package com.school.app;

import com.school.management.School;
import com.school.staff.Principal; 

public class SchoolApp {
   public static void main(String []args) {
	   School obj=new School(); 
	   Principal obj1=new Principal(); 
	   obj.setName("ADONAI public School"); 
	   obj.setLocation("ELURU"); 
	   obj1.setprincipalName("GAYTHRi"); 
	   obj1.setexperienceYears(15); 
	   obj.showSchoolInfo(); 
	   obj1.showPrincipalInfo(); 
   }
}
