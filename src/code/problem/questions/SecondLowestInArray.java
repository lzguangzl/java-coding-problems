package code.problem.questions;

/**
 * Java Program to find second lowest number in an array
 *
 * Traverse an array and keeping lowest and second lowest flag
 * The time complexity of this approach is O(n)
 */

public class SecondLowestInArray {
    public static void main(String[] args) {
        // unsorted input array
        int num[] = {1, 3, 4, -443, -3, 5, 66, 43, 4, 42, 3, 412, 1233, -1, -1, -4, -3, -443, 95, 84, 1233};

//        int n = num.length;
//        Arrays.sort(num);
//        System.out.println("Second largest number: " + num[n-(n-2)]);

        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < lowest) {
                lowest = num[i];
            }

            if (num[i] > lowest && num[i] < secondLowest) {
                secondLowest = num[i];
            }
        }


        System.out.println("Lowest number: " + lowest + "\n"
                + "Second lowest number: " + secondLowest);
    }
}
