// Q1. Write a method to print squares of the first n natural numbers, taking n as an argument to the method.
package PracticeQuestion;

class Calculator {
    void printSquares(int n) {
        for(int i=1; i<=n; i++) {
            int square=i*i;
            System.out.println("Square of " + i + " is " + square);;
        }
    }
}

class methodToPrintSquare {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int n = 5;
        calc.printSquares(n);
    }
}
