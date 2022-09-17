/*Name:Rishi Shah
 ID:21CE131
 Aim:Write a program that demonstrates use of 
     packages & import statements.*/
import MyPackage.MyClass;
 //The java class MyClass is referenced here by import statement  
 public class PackageDemo 
 {
     public static void main(String args[])
     {
         MyClass obj = new MyClass();
         obj.set_value(10);
         obj.display_value();
     }
 }
