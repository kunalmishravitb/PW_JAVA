// Q4. Write a method to count the number of digits in a number and then print the square of this number.
package PracticeQuestion;

class CountNumber {
    void printDigits(int n) {
        int count = 0;
        while(n!=0) {
            n/=10;
            count++;
        }
        System.out.println(count*count);
    }
}

public class countDigits {
    public static void main(String[] args) {
        CountNumber cn = new CountNumber();
        int n = 1255;
        cn.printDigits(n);
    }
}
