// Q3. Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.
package PracticeQuestion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int gcd = 1;
        for(int i=1; i<=a && i<=b; i++) {
            if(a%i==0 && b%i==0) {
                gcd = i;
            }
        }
        System.out.println("GCD is : " + gcd);
    }
}
