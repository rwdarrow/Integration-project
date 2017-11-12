import java.util.*;

/**
 * A basic weather program that takes location as input, reads 
 * data from the Internet, parses and outputs information. 
 * @author: Robert Darrow                
 */
public class Main {
	
	private static final int MIN_ZIP_LEN = 1000;
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		WeatherData weather = new WeatherData();
		
		String greeting = "Hello, user!";
		
		//method call to dataTypeInfo, string argument greeting
		dataTypeInfo(greeting);
		
		int num1 = 5;
		int num2 = 10;
		
		//method call to mathExample, int argument
		mathExample(num1, num2);
		
		moreExamples();
		
		int zipCode = 0;
		
		System.out.print("Welcome to the weather app. Please enter the zip code: ");
		
		//while loop (do-while)
		do {	
			zipCode = scan.nextInt();
			
			//conditional operator
			String out = (zipCode < MIN_ZIP_LEN) ? "Invalid zip code. Please try again: " : 
												   "Zip code entered: " + zipCode; 
			System.out.print(out);
		} while (zipCode < MIN_ZIP_LEN);
		
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
	
	/**
	 * Contains code for integration project requirements not needed
	 * for main program functionality
	 */
	public static void moreExamples() {
		
		int count = 10;
		int counter = count - 1;
		int[] nums = new int[count];
		
		for (int i = 0; i < count; i++) {
			System.out.print("Enter an integer (" + counter + " remaining): ");
			nums[i] = scan.nextInt();
			System.out.println(nums[i]);
			counter--;
		}
		
		int min = nums[0];
		int index = 0;
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {			
			if (min > nums[i]) {
				min = nums[i];
				index = i;
			}
			
			sum += nums[i];
		}
		
		System.out.println("The smallest number is " + min + " at index " + index);
		System.out.println("The sum of the integers is " + sum);
		
		if (min >= 0) {
			System.out.println("All numbers entered were positive");
		}
		else {
			System.out.println("Negative numbers were entered");	
		}
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		
		System.out.print("Enter an integer between 1 and 5: ");
		int num = scan.nextInt();
		int key = 1;
		boolean flag = true;
		
		switch (num) {
		case 1: key = 1;
				break;
		case 2: key = 2;
				break; 
		case 3: key = 3;
				break;
		case 4: key = 4;
				break;
		case 5: key = 5;
				break;
		default: flag = false;
				 System.out.println("You did not enter a number between 1 and 5");
		}
		
		if (flag) {
			System.out.println("You entered " + map.get(key));
		}

	}

}
