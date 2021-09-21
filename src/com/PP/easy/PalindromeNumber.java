/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 */

package com.PP.easy;


public class PalindromeNumber {

    public static boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
        int reverse = 0;
        int temp = x;

        while(x != 0){
            reverse = (reverse * 10) + x%10;
            x /= 10;
        }

        return reverse == temp;
    }
}

/*
Solution

Since a palindrome is the same forwards and backwards, the approach will be to reverse the number and then
compare it to the original one. If they are equal then it returns true if it is not then return false.

Start off by checking if the number is negative, this is important because all negative numbers will fail the palindrome test
since there cannot be a negative sign behind the number.

We store the value of x in a temp variable. To compare it to later on.

If the number is positive we start to reverse it.
We mod the number by 10 to get the last integer
We store that number in the reverse field. Multiply it by 10 and add x%10.
Continue this process until x is 0 and then compare the reverse and temp results.


This algorithm will have time complexity of O(n) n being the length of the number.
This algorithm will have the space complexity of O(1) since no new data structures are created.

TEST
     int number = -124321;
     boolean palindrome = PalindromeNumber.isPalindrome(number);
     System.out.println(palindrome);
 */
