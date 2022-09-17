/*Name:Rishi Shah
 ID:21CE131
 AIM : Write a program to create a default method in an interface IPrinter. 
 Create an interface IPrinter and IScanner. You can assume variables and 
 methods for both interfaces. Create a concrete class to implement both
 the interfaces. Create 5 objects of the class, store it in Vector and 
 display the result of the vector.*/
import java.util.*;

interface IPrinter{
    default void show(Vector v1){
        System.out.println(v1);
    }

}
interface IScanner{
    default Vector get(){
        Vector v = new Vector(5);
        Scanner sc = new Scanner(System.in);
        int n;
        for(int i=0;i<5;i++){ 
        System.out.println("Enter your element(integer value): ");
        n=sc.nextInt();
        v.add(n);
       }
       return v;
    }
}
public class Practical3_2 implements IPrinter, IScanner {
    public static void main(String[] args) {
        Vector vec = new Vector(5);
        IPrinter ip = new Practical3_2();
        IScanner is = new Practical3_2();

        vec =is.get();
        ip.show(vec);

    }
}
