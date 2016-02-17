package cp120a.dshur.hw4;

import java.util.Arrays;
import java.util.Collections;

public class LambdaExercise {

	public static void main(String[] args) {
		      String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars", 
		              "Jupiter", "Saturn", "Uranus", "Neptune" };
		        System.out.println("Original planets array");
		        System.out.println(Arrays.toString(planets));
		        System.out.println("Sorted in dictionary order (ascending):");
		        Arrays.sort(planets);
		        System.out.println(Arrays.toString(planets));

		        // lambda expression , dictionary order (descending)
		        System.out.println("Sorted in dictionary order (descending)");
		        //Arrays.sort(planets, Collections.reverseOrder());
		        Arrays.sort(planets, (a, b) -> b.compareTo(a));
		        System.out.println(Arrays.toString(planets));

		        // lambda expression , short to long
		        // hint the expression can be found in the LambdaTest.java from the book.
		        System.out.println("Sorted by length (ascending):");
		        Arrays.sort(planets, (a, b) -> (a.length() - b.length()));
		        System.out.println(Arrays.toString(planets));

		        // lambda expression , long to short
		        System.out.println("Sorted by length (descending):");
		        Arrays.sort(planets, (a, b) -> b.length() - a.length());
		        System.out.println(Arrays.toString(planets));
		        
		        // lambda expression , reverse the name , then sort in ascending order
		        // hint use  new StringBuilder(first).reverse().toString() to reverse the string
		        System.out.println("Sorted in dictionary order of the reversed name (ascending)");
		        Arrays.sort(planets, (a, b) -> new StringBuilder(a).reverse().toString().compareTo(new StringBuilder(b).reverse().toString()) ) ;
		        System.out.println(Arrays.toString(planets));

		        // lambda expression , reverse the name , then sort in descending order
		        System.out.println("Sorted in dictionary order of the reversed name (descending)");
		        Arrays.sort(planets, (a, b) -> new StringBuilder(b).reverse().toString().compareTo(new StringBuilder(a).reverse().toString()) );
		        System.out.println(Arrays.toString(planets));
		}
}
