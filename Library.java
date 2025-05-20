4 . Library and Librarian Management  
package com.library.books;

public class Library { 
 private String libraryName; 
 private int totalBooks; 
 public void setLibraryName(String libraryName) { 
  this.libraryName=libraryName; 
 } 
 public void setTotalBooks(int totalBooks) { 
  this.totalBooks=totalBooks; 
 } 
 public String getLibraryName() { 
  return libraryName; 
 } 
 public int getTotalBooks() { 
  return totalBooks; 
 } 
 public void showLibraryDetails() { 
  System.out.println("Library Name:"+libraryName); 
  System.out.println("Total Books:"+totalBooks); 
 } 
} 
 
package com.library.staff; 
 
public class Librarian { 
 private String librarianName; 
 private int yearsOfExperince; 
 public void setLibrarianName(String librarianName) { 
  this.librarianName=librarianName; 
 } 
 public void setYearsOfExperince(int yearsOfExperience) { 
  this.yearsOfExperince=yearsOfExperience; 
 } 
 public String getName() { 
  return librarianName; 
 } 
 public int getExperience() { 
  return yearsOfExperince; 
 } 
 public void showLibrarianInfo() { 
  System.out.println("Librarian Namw:"+librarianName); 
  System.out.println("Years of Experince:"+yearsOfExperince); 
 }
} 
 
package com.library.app; 
import com.library.books.Library; 
import com.library.staff.Librarian;
 
public class LibraryApp { 
 public static void main(String[] args) { 
  Library obj=new Library(); 
  lib.setLibraryName("ECET library"); 
  obj.setTotalBooks(10000); 
  Librarian obj1=new Librarian(); 
  obj1.setLibrarianName("HELLO"); 
  obj1.setYearsOfExperince(10); 
  obj.showLibraryDetails(); 
  obj1.showLibrarianInfo(); 
   
 } 
 
} 
 
