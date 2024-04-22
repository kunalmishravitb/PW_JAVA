// Q3. Given two numbers a and b, write a method to print all odd numbers between them.
package PracticeQuestion;

class OddNumbers {
    void printOdd(int a, int b) {
        for(int i=a; i<=b; i+=2) {
            System.out.println(i);
        }
    }
}

public class odd {
    public static void main(String[] args) {
        OddNumbers on = new OddNumbers();
        int a = 1;
        int b = 15;
        on.printOdd(a, b);
    }
}
