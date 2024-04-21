// Q1. Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.
package PracticeQuestion;

import java.util.Scanner;

public class sumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println("Sum of natural numbers up to " + n + " is " + sum);
    }
}
