// Q2. Write a Java program to print a multiplication table for a given number 'n'.
package PracticeQuestion;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        System.out.println("Multiplication Table for " + n + " : ");

        for(int i=n; i<=10*n; i+=n) {
            System.out.println(i);
        }
    }
}
