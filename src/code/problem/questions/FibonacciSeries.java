package code.problem.questions;

/**
 * Java Program to print fibonacci series for a given count
 */

public class FibonacciSeries {

    public static void main(String[] args) {
        int count = 11;

        /* For Loop */
        System.out.print("Fibonacci1 series of " + count + " numbers: ");
        Fibonacci1(count);

        System.out.println();

        /* Recursion */
        System.out.print("Fibonacci2 series of " + count + " numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(Fibonacci2(i) + " ");
        }

    }

    static void Fibonacci1(int count) {
        int n1 = 0, n2 = 1, n3 = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print(n1 + " ");
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }
    
    static int Fibonacci2(int count) {
        if (count == 0) {
            return 0;
        }
        if (count == 1 || count == 2) {
            return 1;
        }
        return Fibonacci2(count - 2) + Fibonacci2(count - 1);
    }
}
