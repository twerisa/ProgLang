import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * You are expected to add to the provided code, but should
 * not generally be removing or altering the provided code.
 * Exceptions to that are when default return values or initial
 * values are provided to allow this starter file to compile.
 * Be sure to include appropriate documentation in all submissions.
 */

public class JavaOverview{
	
	public static void main(String[] args) {
		exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise5();
		exercise6();
	}
	
	private static void exercise1() {
		System.out.println("--- Begin Exercise 1 ---");
		// Exercise 1: loops
		// Write code that computes the sum of all numbers
        	// between 100 and 2018 that are a multiple of 7.
		// Print the result in the form:
		// "The sum is: XXX"
        	// where XXX is the resulting sum
		
		System.out.println("--- End Exercise 1 ---");
	}
	
	private static void exercise2() {
		System.out.println("--- Begin Exercise 2 ---");
		// Exercise 2: strings
		// Write a function (in Java, often called a method)
        // named longerFirst which takes two strings as input
        // and concatenates them with the longer string always
        // coming first. If the strings have the same length,
		// put the first string first.
		
		// Then uncomment the lines below to test your code
		//System.out.println(longerFirst("abc", "12"));
		//System.out.println(longerFirst("ab", "123"));
		//System.out.println(longerFirst("abc", "123"));
		//System.out.println(longerFirst("abc", ""));
		//System.out.println(longerFirst("", "12"));
		System.out.println("--- End Exercise 2 ---");
	}
	
	private static void exercise3() {
		System.out.println("--- Begin Exercise 3 ---");
		// Exercise 3: arrays
		// Define an array oneToTen with 10 elements and
		// initialize it with the values 1, 2, 3, ..., 10.
		// Then implement a function shiftLeftThree which
		// shifts the elements of the array to the left by
		// three (and wraps the leftmost values around).
		// Print the results in the form:
		// The array contains: 4, 5, 6, 7, 8, 10, 1, 2, 3
        	// Be sure to match formatting.
		
		System.out.println("--- End Exercise 3 ---");
	}
	
	private static int fib4recursive(int n) {
		return -1;
	}
	
	private static int fib4dynamic(int n) {
		return -1;
	}
	
	private static void printFib4(int n) {
		System.out.print("The "+n+"-th element in the sequence is ");
		System.out.print(fib4recursive(n));
		System.out.print("(recursive), ");
		System.out.print(fib4dynamic(n));
		System.out.println("(dynamic).");
	}
	
	private static void exercise4() {
		System.out.println("--- Begin Exercise 4 ---");
		// Exercise 4: recursion
		// Consider the Fibonacci-like sequence:
		// 1, 1, 1, 1, 4, 7, 13, 25, 49, ...
		// where each element in the sequence is the sum 
		// of the previous four elements.
		// Implement two functions for computing the
		// ith number in the sequence:
		//   -- fib4recursive: a naive recursive approach
		//   -- fib4dynamic: a dynamic-programming type approach
		//                   where elements of the sequence
		//                   are stored in an array and re-used
        	// Students who have not taken algorithms may need to
        	// look up the dynamic programming type of approach.
        	// In the dynamic programming solution, no value should
        	// be computed more than once by a single call to printFib4.
		printFib4(6);
		printFib4(8);
		printFib4(10);
		printFib4(15);
		System.out.println("--- End Exercise 4 ---");
	}

    private static void exercise5() {
		System.out.println("--- Begin Exercise 5 ---");
		// Exercise 5: file i/o
		// Write code that reads integers from the file numbers.txt
		// and prints out the minimum and maximum values in the file.
		// Assume each line of the file contains one integer value.
		int min=0;
		int max=0;
		
		System.out.println("Minimum value: " + min);
		System.out.println("Maximum value: " + max);
		
		System.out.println("--- End Exercise 5 ---");
	}
	private static void exercise6() {
		System.out.println("--- Begin Exercise 6 ---");
		// Exercise 6: classes
		// Implement a class Car for a car traveling on a straight line which:
		//  - stores the current speed as a double
        	//  - stores the current position as a double
        	//  - provides a constructor that sets the initial position
		//  - provides a function setSpeed(double speed) for setting the speed
		//  - provides a function drive(double time) which sets a new position
		//      of the car to be the old position plus speed*time
		//  - provides a method getPosition() to access the current position
		class Car {
			// implement this
		}
		// uncomment the code below to test your class
//		Car car1 = new Car(0.0);
//		car1.setSpeed(50.0);
//		car1.drive(2.0);
//		car1.setSpeed(25.0);
//		car1.drive(1.0);
//		System.out.println("The position of car1 is "+ car1.getPosition());
//		
//		Car car2 = new Car(0.0);
//		car2.setSpeed(30.0);
//		car2.drive(.5);
//		car2.setSpeed(-25.0);
//		car2.drive(1.2);
//		System.out.println("The position of car2 is "+ car2.getPosition());
		
		System.out.println("--- End Exercise 6 ---");
	}
}