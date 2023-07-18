

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
class Test {
    // creating a private field
    private String s;
  
    // Constructor of this class
  
    // Constructor 1
    // Public constructor
    public Test() { s = "GeeksforGeeks"; }
  
    // Constructor 2
    // no arguments
    public void method1()
    {
        System.out.println("The string is " + s);
    }
  
    // Constructor 3
    // int as argument
    public void method2(int n)
    {
        System.out.println("The number is " + n);
    }
  
    // Constructor 4
    // Private method
    private void method3()
    {
        System.out.println("Private method invoked");
    }
}
public class StructureOfClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cls = sc.next();
		Class c = null;
		try {
			c = Class.forName(cls);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method[] dm = c.getDeclaredMethods();
		Method[] m = c.getMethods();
		Constructor[] con = c.getConstructors();
		Field[] f = c.getDeclaredFields();
		System.out.println("Declared methods : ");
		for (Method str : dm)
			System.out.print(str + " ");
		System.out.println("\nMethods : ");
		for (Method str : m)
			System.out.print(str + " ");
		System.out.println("\nConstructors : ");
		for (Constructor str : con)
			System.out.print(str + " ");
		System.out.println("\nDeclared Fields : ");
		for (Field str : f)
			System.out.print(str + " ");
	}
}
