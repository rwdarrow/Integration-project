import java.util.*;

/**
 * A basic weather program that takes location as input, reads 
 * data from the Internet, parses and outputs information. 
 * @author: Robert Darrow                
 */
public class Main {
	
	private static final int MIN_ZIP_LEN = 1000;
	private static Scanner scan = new Scanner(System.in);
	private static boolean success = false; 
	
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
		  try {
			zipCode = scan.nextInt();
		  }
		  catch (InputMismatchException e) {
		    System.out.println("Incorrect data type");

		  }
		  scan.nextLine();
			
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
	  
	    ////////////////////1D Array Examples////////////////////
	  
		int count = 10;
		int counter = count - 1;
		int[] nums = new int[count];
		
		success = false;
		
		for (int i = 0; i < count; i++) {
			System.out.print("Enter an integer (" + counter + " remaining): ");
			do {
			  try {
			    nums[i] = scan.nextInt();
			    success = true;
			  }
			  catch (InputMismatchException e) {
			    System.out.println("Incorrect data type");
			  }
			  finally {
			    scan.nextLine();
			  }
			} while (!success);
			
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
		
		////////////////////HashMap Examples////////////////////
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		
		System.out.print("Enter an integer between 1 and 5: ");
		
		success = false;
		
		int num = 0;
		int key = 1;
        boolean flag = true;
		
		do {
		  try {
		    num = scan.nextInt();
		    success = true;
		  }
		  catch (InputMismatchException e) {
		    System.out.println("Incorrect data type");
		  }
		  finally {
            scan.nextLine();
          }
		} while (!success);
		
		
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
		
	    ////////////////////String processing (Initials)////////////////////
	  
		System.out.print("Enter a name to extract initials: ");
		String name = "";
		
		success = false;
		
		do {
          try {
            name = scan.nextLine();
            success = true;
          }
          catch (InputMismatchException e) {
            System.out.println("Incorrect data type");
          }
          finally {
            scan.nextLine();
          }
        } while (!success);
		
		String initials = name.substring(0,1);
		
		char[] nameArray = name.toCharArray();
		System.out.print(nameArray.length);
		
		for (int i = 1; i < nameArray.length; i++) {
		  if (nameArray[i-1] == ' ') {
		    initials = initials.concat(" " + nameArray[i]);
		  } 
		}
		
		System.out.println("Initials of the name: " + initials);
		
		////////////////////String processing (Word location)////////////////////
		
		System.out.print("Enter a sentence: ");
		String sen = "";
		
		success = false;
        
        do {
          try {
            sen = scan.nextLine();
            success = true;
          }
          catch (InputMismatchException e) {
            System.out.println("Incorrect data type");
          }
          finally {
            scan.nextLine();
          }
        } while (!success);
		
		String[] words = sen.split(" ");
		
		System.out.print("Enter the word to search for (must be in the sentence): ");
		String searchWord = "";
		
		success = false;
        
        do {
          try {
            searchWord = scan.nextLine();
            success = true;
          }
          catch (InputMismatchException e) {
            System.out.println("Incorrect data type");
          }
          finally {
            scan.nextLine();
          }
        } while (!success);
		
		for (int i = 0; i < words.length; i++) {
		  if (words[i].equals(searchWord)) {
		    System.out.println(searchWord + " was found at position " + i);
		  }
		}
		
		////////////////////2D Array Searching////////////////////
		
		System.out.print("Enter the number of rows for a 2D array (min. 10): ");
		int rows = 0;
		
		success = false;
        
        do {
          try {
            rows = scan.nextInt();
            success = true;
          }
          catch (InputMismatchException e) {
            System.out.println("Incorrect data type");
          }
          finally {
            scan.nextLine();
          }
        } while (!success);
		
		System.out.print("Enter the number if columns for the array (min. 10): ");
		int cols = 0;
		
		success = false;
        
        do {
          try {
            cols = scan.nextInt();
            success = true;
          }
          catch (InputMismatchException e) {
            System.out.println("Incorrect data type");
          }
          finally {
            scan.nextLine();
          }
        } while (!success);

		int[][] numArray = new int[rows][cols];
		
		//fill the array with random digits
		
        for (int i = 0; i < numArray.length; i++) {
          for (int j = 0; j < numArray[i].length; j++) {
            numArray[i][j] = (int) (Math.random() * 10);
          }
        }
        
        System.out.print("Enter a single digit to search for in the array: ");
        int searchNum = 0;
        
        success = false;
        
        do {
          try {
            searchNum = scan.nextInt();
            success = true;
          }
          catch (InputMismatchException e) {
            System.out.println("Incorrect data type");
          }
          finally {
            scan.nextLine();
          }
        } while (!success);
        
        //search the array for specific digit
        
        for (int i = 0; i < numArray.length; i++) {
          for (int j = 0; j < numArray[i].length; j++) {
            if (numArray[i][j] == searchNum) {
              System.out.println(searchNum + " found at position: " 
                                           + "(" + i + ", " + j + ")");
            }
          }
        }
        
        ////////////////////Stack////////////////////
        
        Stack<Integer> stack = new Stack<Integer>();
        int stackNum = 0;
        
        // push example
        
        System.out.print("Enter a number to add to the stack: ");
        
        do {
          try {
            stackNum = scan.nextInt();
            
            stack.push(new Integer(stackNum));
            System.out.println("The number has been pushed");
            System.out.println("The stack: " + stack);
            
            success = true;
          }
          catch (InputMismatchException e) {
            System.out.println("Incorrect data type");
          }
          finally {
            scan.nextLine();
          }
        } while (!success);
        
        // pop example
        
        Integer n = stack.pop();
        System.out.println("The number " + n + " has been popped");
        System.out.println("The stack: " + stack);
            
              
        ////////////////////Queue////////////////////
        
        Queue<String> queue = new LinkedList<String>();
        
        System.out.print("Enter a string to add to the queue: ");
        success = false;
        
        do {
          try {
          queue.add(scan.nextLine());
          success = true;
          }
          catch (InputMismatchException e) {
            System.out.println("Incorrect data type");
          }
          finally {
            scan.nextLine();
          }
        } while (!success);
        
        System.out.println("The queue: " + queue);
	}

}
