5 . Bank Account and Customer Management  
package com.bank.accounts;

public class BankAccount { 
 private String accountNumber; 
 private double balance; 
 public void setAccountNumber(String accountNumber) { 
  this.accountNumber=accountNumber; 
 } 
 public void setBalance(double balance) { 
  this.balance=balance; 
 } 
 public String getAccountNumber() { 
  return accountNumber; 
 } 
 public double getBalance() { 
  return balance; 
 } 
 public void showAccountDetails() { 
  System.out.println("Account number:"+accountNumber); 
  System.out.println("Balance is:"+balance); 
 } 
} 


package com.bank.customers; 

public class Customers { 
private String customerName; 
private int customerID; 
public void setCustomerName(String customerName) { 
this.customerName=customerName; 
} 
public void setCustomerID(int customerID) { 
this.customerID=customerID; 
} 
public String getCustomerName() { 
return customerName; 
} 
public int getCustomerID() { 
return customerID; 
} 
public void showCustomerDetails() { 
System.out.println("Customer Name:"+customerName); 
System.out.println("Customer ID:"+customerID); 
} 
} 

package com.bank.app; 
import com.bank.accounts.BankAccount; 
import com.bank.customers.Customers; 

public class BankApp { 
public static void main(String[] args) { 
BankAccount obj=new BankAccount(); 
obj.setAccountNumber("123455678"); 
obj.setBalance(1000000); 
Customers obj1=new Customers(); 
obj1.setCustomerID(123456); 
obj1.setCustomerName("Hello"); 
obj.showAccountDetails(); 
obj1.showCustomerDetails(); 
} 
}
