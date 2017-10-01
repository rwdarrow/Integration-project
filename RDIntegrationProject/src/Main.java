import java.util.Scanner;

/**
 * A basic weather program that takes location as input, reads 
 * data from the Internet, parses and outputs information. 
 * @author: Robert Darrow                
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String greeting = "Hello, user!";
		
		//method call to dataTypeInfo, string argument greeting
		dataTypeInfo(greeting);
		
		int num1 = 5;
		int num2 = 10;
		
		//method call to mathExample, int argument
		mathExample(num1, num2);

	}
	
	/**
	 * Prints basic info required for integration project
	 * @param greeting printed by first print statement
	 */
	public static void dataTypeInfo(String greeting) {
		System.out.println(greeting);
		System.out.println("A variable is a location in memory");
		System.out.println("Java primitive data types:");
		System.out.println("byte: an 8-bit integer");
		System.out.println("short: a 16-bit integer");
		System.out.println("int: a 32-bit integer");
		System.out.println("long: a 64-bit integer");
		System.out.println("float: single precision 32-bit floating point");
		System.out.println("double: double precision 64-bit floating point");
		System.out.println("boolean: 1-bit true or false flag");
		System.out.println("char: 16-bit unicode character");
	}
	
	/**
	 * Demonstrates integer addition and division
	 * @param num1 First integer used in operations
	 * @param num2 Second integer used in operations
	 */
	public static void mathExample(int num1, int num2) {
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		
		System.out.println(num1 + " divided by " + num2 + " = " + (num1 / num2));
	}

}
