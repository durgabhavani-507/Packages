3 . Car and Engine Details 

package com.vehicles.parts; 

public class Engine { 
private int horsePower; 
private String engineType; 
public void setEngineType(String engineType) { 
this.engineType=engineType; 
} 
public void setHorsePower(int horsePower) { 
this.horsePower=horsePower; 
} 
public String getEngineType() { 
return engineType; 
} 
public int getHorsePower() { 
return horsePower; 
} 
public void showEngineDetails() { 
System.out.println("Engine Type:"+engineType); 
System.out.println("Horse Power:"+horsePower); 
} 
} 

package com.vehicles; 
public class Car { 
private String brand; 
private String model; 
private double price; 
public void setBrand(String brand) { 
this.brand=brand; 
} 
public void setModel(String model) { 
this.model=model; 
} 
public void setPrice(double price) { 
this.price=price; 
} 
public String getBrand() { 
return brand; 
} 
public String getModel() { 
return model; 
} 
public double getPrice() { 
return price; 
} 
public void showCarDetails() { 
System.out.println("Car Brand Name:"+brand); 
System.out.println("Car Model:"+model); 
System.out.println("Car Price:"+price); 
} 
} 

package com.vehicles.app;
 
import com.vehicles.parts.*; 
import com.vehicles.*; 

public class CarApp { 
public static void main(String[] args) { 
Car obj=new Car(); 
Engine obj1=new Engine(); 
obj.setBrand("BMW"); 
obj.setModel("BMW NEW MODEL"); 
obj.setPrice(10000000); 
obj1.setEngineType("GHJK"); 
obj1.setHorsePower(4567); 
obj.showCarDetails(); 
obj1.showEngineDetails(); 
} 
} 

