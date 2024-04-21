// Q5. Write a Java program to generate and print the first 'n' terms of the Fibonacci series.
package PracticeQuestion;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        int firstTerm = 0;
        int secondTerm = 1;
        for(int i=1; i<=n; i++) {
            System.out.println(firstTerm);

            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
