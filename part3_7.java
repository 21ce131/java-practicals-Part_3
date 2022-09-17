/*Name:Rishi Shah
  ID:21CE131
  Aim:Write a program that illustrates the significance of interface
 default method.*/
interface Sayable{  
    // Default method   
    default void say(){  
        System.out.println("Hello, this is default method");  
    }  
    // Abstract method  
    void sayMore(String msg);  
}  
public class DefaultMethods implements Sayable{  
    public void sayMore(String msg)
    {        // implementing abstract method   
        System.out.println(msg);  
    }  
    public static void main(String[] args) 
    {  
        DefaultMethods dm = new DefaultMethods();  
        dm.say();   // calling default method  
        dm.sayMore("Work is worship");  // calling abstract method  
   }  
}  
