/*Name:Rishi Shah
 ID:21CE131
 Aim:Write a java program which shows importing of classes from other
 user define packages.*/
package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
}  
//save by B.java  
package mypack;  
import pack.*;  
  
class B{  
  public static void main(String args[]){  
   A obj = new A();  
   obj.msg();  
  }  
}  
