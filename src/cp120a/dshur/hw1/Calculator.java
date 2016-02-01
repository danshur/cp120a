package cp120a.dshur.hw1;

public class Calculator {

	public static void main(String[] args) {
		int sample[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// int sample[] = { 21, 22, 13, 04, 50, 66, 27, 38, 19, 10 };

		// use a for loop to print out the content of the sample integer array
		for (int x : sample) {
			System.out.println("For loop - " + x);
		}

		// use while loop to find average value of the sample integer array, and
		// print it out
		int index = 0;
		double sum = 0;
		while (index < sample.length) {
			index++;
			sum += index;
		}
		double avg = sum / sample.length;
		System.out.println("While loop to find avg of array: sum=" + sum + ", count=" + sample.length + ", avg=" + avg);

		// use do while loop to find the max and min value of the sample array ,
		// and print it out
		int min = sample[0];
		int max = sample[0];
		int i = 0;
		do {
			if (sample[i] > max) {
				max = sample[i];
			}
			if (sample[i] < min) {
				min = sample[i];
			}
			i++;
		} while (i < sample.length);
		System.out.println("Do while to find max = " + max + " and min = " + min);

		// use for loop to find the first value larger than 5 in the sample
		// array , print it out and exit the loop immediately
		for (int x : sample) {
			if (x > 5) {
				System.out.println("First value > 5 in this array is " + x);
				break;
			}
		}

	}

}
