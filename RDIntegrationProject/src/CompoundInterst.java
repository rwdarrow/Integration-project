import java.util.Scanner;

public class CompoundInterst {
	
	public static void main(String[] args) {
		
		double amount;
		double principal;
		double interestRate;
		double timesCompounded;
		double years;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program will calculate compound interset");
		System.out.print("Enter a value for the principal amount: ");
		
		principal = scan.nextDouble();
		
		System.out.print("Enter a value for the interest rate: ");
		
		interestRate = scan.nextDouble();
		
		System.out.print("Enter the number of times compounded per year: ");
		
		timesCompounded = scan.nextDouble();
		
		System.out.print("Enter the number of years: ");
		
		years = scan.nextDouble();
		
		amount = principal*Math.pow((1.0+(interestRate/timesCompounded)),(timesCompounded*years));
		
		System.out.println();
		System.out.println("The amount is: "+amount);
		
		scan.close();
	}

}
