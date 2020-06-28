package code.problem.questions;

/**
 * Java Program to find second highest number in an array
 *
 * Sorting approach does not work if the element in an array is repeated
 */


public class SecondLargestInArray {

    public static void main(String[] args) {
        // unsorted input array
        int num[] = {1, 3, 4, 5, 66, 43, 4, 42, 3, 412, 1233, -1, -3, -444, 95, 84, 1233};

//        int n = num.length;
//        Arrays.sort(num);
//        System.out.println("Second largest number: " + num[n-2]);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {

            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];

            }

            if (num[i] < largest && num[i] > secondLargest) {
                secondLargest = num[i];
            }
        }

        System.out.println("Largest number: " + largest + "\n"
                + "Second largest number: " + secondLargest);
    }
}
