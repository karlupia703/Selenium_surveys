package coding;

import java.util.*;
//public class methodToJava {	
//	static void myMethod() {
//		System.out.println("Hello world!");
//	}
//public static void main(String[] args) {
//myMethod();
//	
// }	
//}

     // method print
//public class  methodToJava{
//	//static method
//	static void Method() {
//		System.out.println("Hello how are you?");
//	}
//	
//	public void Method1() {
//	System.out.println("public method must be called by creating objects");
//	}
//	
//	public static void main(String[] args){
////		Method(); // Call the static method
//		//Method1();
//		
//		methodToJava myobj = new methodToJava();
//		myobj.Method();
//		
//		}
//}
//





//	public static void printNum(int n) {
//		if (n>5) {
//			return;
//		}
//		System.out.println(n);
//		printNum(n+1);
//	}
	
                                               //Recursion method
//	public static void printNum(int n) {
//		if (n == 0) {
//			return;
//		}
//		printNum(n-1);
//		System.out.println(n);
//		
//	}
//	
//	 public static void main(String args[]){		 
//		 printNum(5);
//
//	}
//	}
//	




	  // Method overloading
//	static int plusMethodInt(int x,int y) {
//	return x+y;	
//	}
//  
//	static double plusMethodDouble(double x, double y) {
//	return x+y;
//	}
//	
//public static void main(String[] args) {
//	int myNum1 = plusMethodInt(8,5);
//	double myNum2 = plusMethodDouble(4.7,6.6);
//	System.out.println("int: " + myNum1);
//	System.out.println("double: " + myNum2);




// static int myMethod(int x, int y) {
//	 return y + x;
// }
//public static void main(String[] args) {
//int z = myMethod(10,3);
//System.out.println(z);
//
// // System.out.println(myMethod(10,5));
//  	}
//}










//	//method apply with if else conditions
//	public static void checkAge(int age) {
//		
//		if (age<=18) {
//			System.out.println("your age is equal than 18");
//			
//			
//		}else {
//			System.out.println("your age is equal than 20");
//		}
//	}
//	
//
//	public static void main(String[] args) {
//	checkAge(18);
//		
//	}
//}


//	public static void myMethod(String name, int age) {
//		System.out.println(name +  " age  is " + age);
//	}
//	
//public static void main(String[] args) {
//     myMethod ("Riya", 22);
//     myMethod ("Teena", 25);
	


		
        // Apply with scanner
//	public static void myMethod(String name) {
//		System.out.println("My friend name is " + name );
//		
//		}
//	
//	public static void main(String[] args) {
//    Scanner sc = new Scanner (System.in);
//    String name = sc.next();
//    
//    myMethod(name);
//    
//	}

//create main class
//public class MethodJava {
//	int x;//create a class attribute
//	
//	//create a class constructor for the main class
//	public MethodJava(int y) {
//	x = y; // set the initial value for the class attribute x
//	}
//	
//	public static void main (String[] args) {
//		MethodJava myObj1 = new MethodJava(10);//create an object of class main (this will call the constructor)
//		System.out.println(myObj1.x);// print the value of x
//		
//	}
//	
//}



// constructor add with parameters

//public class MethodJava {
//	int modelyear;
//	String modelname;
//	
//	public MethodJava(int year,String name) {
//	modelyear = year;
//	modelname = name;
//	}
//	public static void main (String[] args) {
//		MethodJava myCar = new MethodJava(1999, "XUV 700");
//		System.out.println(myCar.modelyear + " " + myCar.modelname);
//	}
//}



//Final modifiers
//public class MethodJava{
//	final int x = 10;
//	final double PI = 3.14;
//	
//	public static void main (String[] args) {
//		MethodJava myobj = new MethodJava(int x, double PI);
//		myobj.x = 50;
//		myobj.PI = 25;
//		System.out.println(myobj.x);
//	}
//}
// //output --- ERROR Through
 


//Static 

//public class MethodJava{
//	static void mystaticMethod() {
//		System.out.println("Static methods");
//	}
//	
//	public void mypublicMethod() {
//		System.out.println("public methods");
//		}
//	
//	public static void main (String[] args) {
//		mystaticMethod();
//		
//		MethodJava obj = new MethodJava();
//		obj.mypublicMethod();
//		
//		}
//}

//abstract class MethodJava{
//	public String name = "john";
//	public int age = 24;
//	public abstract void study(); // abstract method
//	
//}
//// Subclass (inherit from Main)
//class Student extends MethodJava{
//	public int graduationYear = 2018;
//	public void study() {
//		System.out.println("Studying all day long");
//	}
//}
//
//class Second{
//	public static void main(String[] args) {
//		Student myobj = new Student();
//		
//		System.out.println("Name" + myobj.name);
//		System.out.println("Age" + myobj.age);
//		System.out.println("graduation Year" + myobj.graduationYear);
//		myobj.study();
//		
//	}
//}




//               // Encapsulation
//
//	public class MethodJava {
//		  public static void main(String[] args) {
//			  MethodJava myObj = new MethodJava();
//		    myObj.name = "John";  // error
//		    System.out.println(myObj.name); // error 
//		  }
//		}





