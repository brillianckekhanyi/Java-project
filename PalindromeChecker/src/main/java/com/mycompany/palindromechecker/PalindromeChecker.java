/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromechecker;

/**
 *
 * @author Dell
 */
public class PalindromeChecker {

    public static void main(String[] args) {
        int number = 12321; // The number to check for palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    // Function to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return originalNum == reversed;
    }
}
