package cp120a.dshur.cw3;

/***
The simple operation add, subtract, multiply, divide, clearMemory, showMemory,
setMemory will cost 25 cents. The complex operation avg, min, max will cost 50 cents. These
costs is considered constant and in class scope
 */
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

	private double memory;
	private double balance;
	private static final double simplePrice = 25;
	private static final double complexPrice = 50;

	public static void main(String[] args) {
		// Use Scanner class to prompt user to enter 2 double value and store in
		// a and b

		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		System.out.print("Enter a number: ");
		a = sc.nextDouble();
		System.out.print("Enter another number: ");
		b = sc.nextDouble();
		sc.close();
		System.out.println("You entered " + a + " and " + b);

		// Create an instance of Calculator class call calculator
		Calculator calc = new Calculator();
		// Print out a + b using calculator.add method
		System.out.println("Add method = " + calc.add(a, b));
		System.out.println("Balance = " + calc.showBalance()); // show a balance
		// Print out a - b using calculator.substract method
		System.out.println("Subtract method = " + calc.subtract(a, b));
		System.out.println("Balance = " + calc.showBalance()); // show a balance
		// Print out a * b using calculator.multiply method
		System.out.println("Multiply method = " + calc.multiply(a, b));
		System.out.println("Balance = " + calc.showBalance()); // show a balance
		// Print out a / b using calculator.divide method
		System.out.println("Divide method = " + calc.divide(a, b));
		System.out.println("Balance = " + calc.showBalance()); // show a balance
		// Use the setMemory method to store a + b
		calc.setMemory(calc.add(a, b));
		System.out.println("Balance = " + calc.showBalance()); // show a balance
		// Use the getMemory method to retrieve a + b result and use divide
		// method to find a / (a + b) then print out the result
		System.out.println("showMemory method = " + calc.showMemory());
		System.out.println("Balance = " + calc.showBalance()); // show a balance
		System.out.println("showMemory method to calc; a / (a + b) = " + calc.divide(a, calc.showMemory()));
		System.out.println("Balance = " + calc.showBalance()); // show a balance
		// Declare a integer array called sample with 3 elements
		int sample[] = new int[3];
		// Use Math.random() to populate sample array with 3 values between 0 to
		// 99
		for (int i = 0; i < sample.length; i++) {
			sample[i] = (int) (Math.random() * 100);
		}
		// Print out the sample array
		System.out.println("sample array = " + Arrays.toString(sample));
		/*
		 * Another way to print the array for (int x : sample) {
		 * System.out.println("Full array print: " + x); }
		 */

		// Print out min of sample array using calculator.min method
		System.out.println("min = " + calc.min(sample));
		System.out.println("Balance = " + calc.showBalance()); // show a balance
		// Print out max of sample array using calculator.max method
		System.out.println("max = " + calc.max(sample));
		System.out.println("Balance = " + calc.showBalance()); // show a balance
		// Print out average of sample array using calculator.avg method
		System.out.println("avg = " + calc.average(sample));

		System.out.println("Balance = " + calc.showBalance()); // show a balance

	}

	public double showBalance() {
		return balance;
	}

	public void payBalance() {

	}

	public void clearMemory() {
		balance += simplePrice;
		memory = 0.0;
	}

	public double showMemory() {
		balance += simplePrice;
		return memory;
	}

	public void setMemory(double value) {
		balance += simplePrice;
		memory = value;
		System.out.println("Memory is set to: " + value);
	}

	public double average(int[] sample) {
		balance += complexPrice;
		double sum = 0;

		for (int x : sample) {
			sum += x;
		}
		double avg = sum / sample.length;
		return avg;
	}

	public int min(int[] sample) {
		balance += complexPrice;
		int i = 0;
		int min = sample[0];
		do {

			if (sample[i] < min) {
				min = sample[i];
			}

			i++;
		} while (i < sample.length);
		return min;
	}

	public int max(int[] sample) {
		balance += complexPrice;
		int i = 0;
		int max = sample[0];
		do {

			if (sample[i] > max) {
				max = sample[i];
			}

			i++;
		} while (i < sample.length);
		return max;
	}

	public double add(double a, double b) {
		balance += simplePrice;
		return a + b;
	}

	public double subtract(double a, double b) {
		balance += simplePrice;
		return a - b;
	}

	public double multiply(double a, double b) {
		balance += simplePrice;
		return a * b;
	}

	public double divide(double a, double b) {
		balance += simplePrice;
		return a / b;
	}

}
