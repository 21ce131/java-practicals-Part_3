/* Name:Rishi Shah
   ID:21CE131
   AIM:Concept of method overriding*/

class Vehicle{  
  //method 
  void run()
  {
      System.out.println("Vehicle is running");
  }  
}  
class Bike2 extends Vehicle
{  
  //method overriding  
  void run()
  {
      System.out.println("Bike is running safely");
  }  
  public static void main(String args[])
  {  
      Bike2 obj = new Bike2();// object  
      obj.run();//calling method  
  }  
}   
