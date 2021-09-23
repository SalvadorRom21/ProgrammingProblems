/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
package com.PP.ProjectEuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPalindromeProduct {

    public static void multiply(){
        int product;
        List<Integer> palindromeList = new ArrayList<>();

        for(int i = 999; i > 0;i--) {
            for (int j = 999; j > 0; j--) {
                product = i * j;
                if (isPalindrome(product)) {
                    palindromeList.add(product);
                    break;
                }

            }
        }
        palindromeList.sort(Collections.reverseOrder());
        System.out.println(palindromeList.get(0));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int temp = number;

        while(number != 0) {
            reverse = (reverse * 10) + number % 10;
            number /= 10;
        }
        return reverse == temp;
    }
}

/*
Solution:

To solve this problem we will brute force it. We will multiply both digits by 999 all the way up to 0;
Along the way we will check if the product is a palindrome and if it is we will store it in a list
once we have gathered the whole list we will sort it and return the first value aka the biggest
this will be our answer

Time Complexity O(n^2) - We have to go through 2 for loops which makes this n * n
Space Complexity O(log(n)) This is O(log(n)) because we only store the values that are palindromes
and not every product.


 */
