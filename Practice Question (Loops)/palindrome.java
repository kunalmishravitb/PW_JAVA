// Q4. Write a Java program to check if a given string is a palindrome or not using a loop.
package PracticeQuestion;

public class palindrome {
    public static void main(String[] args) {
        String str = "malayalam";

        boolean isPalindrome = true;

        // Initialize j to the index of the last character
        int j = str.length() - 1;

        // Iterate through the string from both the ends
        for(int i=0; i<j; i++, j--) {
            // If characters at 'i' and 'j' positions are not equal, it's not a palindrome
            if(str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
